package main.java.com.company.JavaSourceLearn.leetcode.test202101;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1603. 设计停车系统
 * @date : 2021-01-29 20:31:42
 */
public class ParkingSystem {
    private Integer big;
    private Integer medium;
    private Integer small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big > 0) {
                    this.big--;
                    return true;
                }
                break;
            case 2:
                if (this.medium > 0) {
                    this.medium--;
                    return true;
                }
                break;
            case 3:
                if (this.small > 0) {
                    this.small--;
                    return true;
                }
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        List<Boolean> list = new ArrayList<>();
        list.add(parkingSystem.addCar(1));
        list.add(parkingSystem.addCar(2));
        list.add(parkingSystem.addCar(3));
        System.out.println(list);
    }

}
