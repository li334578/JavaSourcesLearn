package com.company.JavaSourceLearn.sources.functionalInterface;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 大学生
 * @date : 2021-01-16 15:23:20
 */
public class Undergraduate {
    private String name;
    private Integer score;

    public Undergraduate(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Undergraduate{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static int compareByScore(Undergraduate undergraduate1, Undergraduate undergraduate2) {
        return undergraduate1.getScore() - undergraduate2.getScore();
    }

    public static int compareByName(Undergraduate undergraduate1, Undergraduate undergraduate2) {
        return undergraduate1.getName().compareToIgnoreCase(undergraduate2.getName());
    }

    public int compareScore(Undergraduate undergraduate) {
        return this.getScore() - undergraduate.getScore();
    }

    public int compareName(Undergraduate undergraduate) {
        return this.getName().compareToIgnoreCase(undergraduate.getName());
    }
}
