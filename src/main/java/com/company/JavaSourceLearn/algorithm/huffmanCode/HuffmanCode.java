package com.company.JavaSourceLearn.algorithm.huffmanCode;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 赫夫曼编码
 * @date : 2021-03-09 21:41:14
 */
public class HuffmanCode {
    public static void main(String[] args) {
//        String s = "can you can a can as a can canner can a can.";
//        byte[] bytes = s.getBytes();
//        byte[] result = huffmanCodeZip(bytes);
//        byte[] decode = decode(huffCodes, result);
//        System.out.println(new String(decode));

        // 文件压缩
        String src = "src/com/company/algorithm/huffmanCode/1.png";
        String target = "src/com/company/algorithm/huffmanCode/2.zip";
        String target2 = "src/com/company/algorithm/huffmanCode/3.png";

        try {
            zipFile(src, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            unZip(target,target2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void unZip(String src, String target) throws Exception {
        // 创建一个输入流
        InputStream inputStream = new FileInputStream(src);
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        // 读取byte数组
        byte[] b = (byte[]) ois.readObject();
        // 读取赫夫曼编码表
        Map<Byte, String> codes = (Map<Byte, String>) ois.readObject();
        ois.close();
        inputStream.close();
        // 解码
        byte[] bytes = decode(codes, b);
        // 创建一个输出流
        OutputStream outputStream = new FileOutputStream(target);
        // 写出数据
        outputStream.write(bytes);
        outputStream.close();
    }


    private static void zipFile(String src, String target) throws IOException {
        // 创建一个输入流
        InputStream inputStream = new FileInputStream(src);
        // 创建一个和输入流指向的文件一样的byte数组
        byte[] bytes = new byte[inputStream.available()];
        // 读取文件内容
        inputStream.read(bytes);
        inputStream.close();
        // 使用赫夫曼编码进行编码
        byte[] newBytes = huffmanCodeZip(bytes);
        // 输出流
        OutputStream outputStream = new FileOutputStream(target);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        // 把压缩后的byte数组写入文件
        objectOutputStream.writeObject(newBytes);
        // 赫夫曼编码表写入文件
        objectOutputStream.writeObject(huffCodes);
        objectOutputStream.close();
        outputStream.close();
    }


    private static byte[] decode(Map<Byte, String> huffCodes, byte[] bytes) {
        StringBuilder stringBuilder = new StringBuilder();
        // 把byte数组转换成为一个二进制的字符串
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            stringBuilder.append(byteToBitStr(i != bytes.length - 1, b));
        }
        // 把字符串按照指定的赫夫曼编码进行解码
        // 把赫夫曼编码的键值对进行掉换
        Map<String, Byte> decodeHuffCodes = huffCodes.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        // 创建一个集合 用于存byte
        List<Byte> list = new ArrayList<>();
        // 处理字符串
        for (int i = 0; i < stringBuilder.length(); ) {
            // 记录取了多长
            int count = 1;
            boolean flag = true;
            // 记录每次取出来的byte
            Byte b = null;
            while (flag) {
                String key = stringBuilder.substring(i, i + count);
                b = decodeHuffCodes.get(key);
                if (b == null) {
                    // 未找到对应的byte count++
                    count++;
                } else {
                    // 成功取出
                    flag = false;
                }
            }
            list.add(b);
            i += count;
        }
        byte[] bytes1 = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bytes1[i] = list.get(i);
        }
        return bytes1;
    }


    private static String byteToBitStr(boolean flag, byte b) {
        int temp = b;
        if (flag) {
            temp |= 256;
            String str = Integer.toBinaryString(temp);
            return str.substring(str.length() - 8);
        } else {
            return Integer.toBinaryString(temp);
        }
    }

    private static byte[] huffmanCodeZip(byte[] bytes) {
        // byte数组转为node集合
        List<Node> list = getNodes(bytes);
        Node node = createHuffmanTree(list);
        // 创建赫夫曼编码表
        Map<Byte, String> huffCodes = getCodes(node);
        // 编码
        byte[] bytes1 = zipBytes(bytes, huffCodes);
        return bytes1;
    }

    /**
     * 进行赫夫曼编码
     *
     * @param bytes
     * @param huffCodes
     * @return
     */
    private static byte[] zipBytes(byte[] bytes, Map<Byte, String> huffCodes) {
        StringBuilder stringBuilder = new StringBuilder();
        // 把需要压缩的byte数组处理成二进制字符串
        for (byte aByte : bytes) {
            stringBuilder.append(huffCodes.get(aByte));
        }
        // 定义数组的长度
        int len;
        if (stringBuilder.length() % 8 == 0) {
            len = stringBuilder.length() / 8;
        } else {
            len = stringBuilder.length() / 8 + 1;
        }
        // 用于存储压缩后的byte数组
        byte[] by = new byte[len];
        for (int i = 0, index = 0; i < stringBuilder.length(); i += 8, index++) {
            // 每八位进行一次分割
            String strByte;
            if (i + 8 > stringBuilder.length()) {
                strByte = stringBuilder.substring(i);
            } else {
                strByte = stringBuilder.substring(i, i + 8);
            }
            byte byt = (byte) Integer.parseInt(strByte, 2);
            by[index] = byt;
        }
        return by;
    }

    // 用于临时存储路径
    static StringBuilder stringBuilder = new StringBuilder();
    // 用于存储赫夫曼编码
    static Map<Byte, String> huffCodes = new HashMap<>();

    /**
     * 根据赫夫曼树进行赫夫曼编码
     *
     * @param node
     * @return
     */
    private static Map<Byte, String> getCodes(Node node) {
        if (node == null) {
            return null;
        }
        getCodes(node.left, "0", stringBuilder);
        getCodes(node.right, "1", stringBuilder);
        return huffCodes;
    }

    private static void getCodes(Node node, String code, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder);
        stringBuilder2.append(code);
        if (node.value == null) {
            getCodes(node.left, "0", stringBuilder2);
            getCodes(node.right, "1", stringBuilder2);
        } else {
            huffCodes.put(node.value, stringBuilder2.toString());
        }

    }

    /**
     * 创建赫夫曼树
     *
     * @param list
     * @return
     */
    private static Node createHuffmanTree(List<Node> list) {

        // 排序
        while (list.size() > 1) {
            Collections.sort(list);
            // 取出最小的两个
            Node left = list.get(list.size() - 1);
            Node right = list.get(list.size() - 2);
            // 创建新节点
            Node parent = new Node(null, left.weight + right.weight);
            parent.left = left;
            parent.right = right;
            list.remove(left);
            list.remove(right);
            list.add(parent);
        }
        return list.get(0);
    }

    private static List<Node> getNodes(byte[] bytes) {
        List<Node> list = new ArrayList<>();
        // 遍历数组 根据出现的次数排序
        Map<Byte, Integer> map = new HashMap<>();
        for (byte aByte : bytes) {
            Integer integer = map.putIfAbsent(aByte, 1);
            if (integer != null) {
                map.put(aByte, integer + 1);
            }
        }
        for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
            list.add(new Node(entry.getKey(), entry.getValue()));
        }
        return list;
    }
}
