package main.java.com.company.JavaSourceLearn.algorithm.graph;

import main.java.com.company.JavaSourceLearn.algorithm.MyStack;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 图
 * @date : 2021-03-18 20:25:49
 */
public class Graph {
    private Vertex[] vertices;
    private int currentSize;
    MyStack myStack = new MyStack();
    // 当前遍历的下标
    private int currentIndex;
    public int[][] adjMatrix;

    public Graph(int size) {
        vertices = new Vertex[size];
        adjMatrix = new int[size][size];
        // 对角线赋值
        for (int i = 0; i < size; i++) {
            adjMatrix[i][i] = 1;
        }
    }

    /**
     * 添加顶点
     *
     * @param vertex 顶点
     */
    public void putVer(Vertex vertex) {
        if (currentSize < vertices.length) {
            vertices[currentSize++] = vertex;
        } else {
            System.out.println(" vertices is full ");
        }
    }


    /**
     * 添加边
     *
     * @param v1 顶点值
     * @param v2 顶点值
     */
    public void addEdge(String v1, String v2) {
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < vertices.length; i++) {
            if (index1 == -1 || index2 == -1) {
                if (v1.equals(vertices[i].getValue())) {
                    index1 = i;
                }
                if (v2.equals(vertices[i].getValue())) {
                    index2 = i;
                }
            }
        }
        adjMatrix[index1][index2] = 1;
        adjMatrix[index2][index1] = 1;
    }


    public void printAdjMatrix() {
        for (int[] matrix : adjMatrix) {
            System.out.println(Arrays.toString(matrix));
        }
    }


    /**
     * 深度优先遍历图
     */
    public void dfs() {
        // 从第0个顶点开始 将第0个顶点标记为已访问状态
        vertices[0].setVisited(true);
        // 入栈
        myStack.push(0);
        // 打印顶点的值
        System.out.println(vertices[0].getValue());
        // 遍历邻接矩阵
        breakOut:
        while (!myStack.isEmpty()) {
            for (int i = currentIndex + 1; i < vertices.length; i++) {
                // 如果和下一个遍历的元素是通的
                if (currentIndex != i && adjMatrix[currentIndex][i] == 1 && !vertices[i].isVisited()) {
                    // 把下一个元素压入栈中
                    myStack.push(i);
                    vertices[i].setVisited(true);
                    System.out.println(vertices[i].getValue());
                    currentIndex++;
                    continue breakOut;
                }
                if (!myStack.isEmpty()) {
                    // 没找到通的元素 弹出栈顶元素
                    myStack.pop();
                }
                if (!myStack.isEmpty()) {
                    // 修改当前位置为栈顶元素的位置
                    currentIndex = myStack.peek();
                }
            }
        }
    }
}
