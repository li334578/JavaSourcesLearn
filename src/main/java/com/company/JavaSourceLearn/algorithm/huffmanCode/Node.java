package main.java.com.company.JavaSourceLearn.algorithm.huffmanCode;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 节点
 * @date : 2021-03-09 21:41:31
 */
public class Node implements Comparable<Node> {
    Byte value;
    int weight;
    Node left;
    Node right;

    public Node(Byte value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return o.weight - this.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }
}
