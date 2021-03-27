package com.company.algorithm.graph;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 图测试
 * @date : 2021-03-18 20:34:19
 */
public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        graph.putVer(v1);
        graph.putVer(v2);
        graph.putVer(v3);
        graph.putVer(v4);
        graph.putVer(v5);

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");
        graph.addEdge("B", "E");

        graph.printAdjMatrix();

        graph.dfs();
    }
}
