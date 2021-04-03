package com.company.JavaSourceLearn.algorithm.graph;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 顶点
 * @date : 2021-03-18 20:24:36
 */
public class Vertex {

    private String value;

    private boolean visited;

    public Vertex(String value) {
        this.value = value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value='" + value + '\'' +
                '}';
    }
}
