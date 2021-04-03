package com.company.JavaSourceLearn.sources.functionalInterface;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-16 15:59:27
 */
public class UndergraduateComparator {
    public int compareByScore(Undergraduate undergraduate1, Undergraduate undergraduate2) {
        return undergraduate1.getScore() - undergraduate2.getScore();
    }

    public int compareByName(Undergraduate undergraduate1, Undergraduate undergraduate2) {
        return undergraduate1.getName().compareToIgnoreCase(undergraduate2.getName());
    }
}
