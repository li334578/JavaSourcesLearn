package com.company.JavaSourceLearn.designPatterns2.creatorMode.design04.util;

import java.util.*;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class Topic {
    private Map<String, String> options;
    private String key;

    public Topic() {
    }

    public Topic(Map<String, String> options, String key) {
        this.options = options;
        this.key = key;
    }

    /**
     * 乱序map元素 记录对应答案key
     *
     * @param options 选项
     * @param key     正确答案
     * @return 新Topic对象
     */
    public static Topic random(Map<String, String> options, String key) {
        Set<String> keySet = options.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        // 打乱key
        Collections.shuffle(keyList);
        HashMap<String, String> newOptions = new HashMap<>();
        String newKey = "";
        int index = 0;
        for (String oldKey : keySet) {
            String randomKey = keyList.get(index++);
            if (oldKey.equals(key)) {
                newKey = randomKey;
            }
            newOptions.put(randomKey, options.get(oldKey));
        }
        return new Topic(newOptions, newKey);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");
        Topic topic = Topic.random(map, "B");
        System.out.println(topic);
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
