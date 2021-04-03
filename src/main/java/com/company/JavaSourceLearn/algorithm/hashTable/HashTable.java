package com.company.JavaSourceLearn.algorithm.hashTable;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 哈希表实现
 * @date : 2021-03-17 21:19:52
 */
public class HashTable {
    private StudentInfo[] data = new StudentInfo[10];

    public void put(StudentInfo studentInfo) {
        data[studentInfo.hashCode()] = studentInfo;
    }

    public StudentInfo get(int age) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setAge(age);
        return data[studentInfo.hashCode()];
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
