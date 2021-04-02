package main.java.com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 线性查找
 * @date : 2021-02-21 20:38:51
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 8, 9, 1, 3, 0};
        int target = 3;
        int resultIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                resultIndex = i;
                break;
            }
        }
        System.out.println(resultIndex);
    }
}
