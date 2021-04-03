package com.company.JavaSourceLearn.algorithm.hashTable;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 哈市表测试
 * @date : 2021-03-17 21:23:57
 */
public class HashTableTest {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(19, "熊大");
        StudentInfo s2 = new StudentInfo(20, "熊二");
        StudentInfo s3 = new StudentInfo(18, "张三");
        StudentInfo s4 = new StudentInfo(17, "李四");
        StudentInfo s5 = new StudentInfo(16, "王五");
        StudentInfo s6 = new StudentInfo(15, "赵六");
        HashTable hashTable = new HashTable();
        hashTable.put(s1);
        hashTable.put(s2);
        hashTable.put(s3);
        hashTable.put(s4);
        hashTable.put(s5);
        hashTable.put(s6);
        System.out.println(hashTable.get(17));
        System.out.println(hashTable);
    }
}
