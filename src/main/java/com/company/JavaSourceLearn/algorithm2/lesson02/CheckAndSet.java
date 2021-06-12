package com.company.JavaSourceLearn.algorithm2.lesson02;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 并查集
 * @date : 2021-06-06 15:35:51
 */
public class CheckAndSet {

    int[] pre;

    public CheckAndSet(int[] pre) {
        this.pre = pre;
    }

    public int[] getPre() {
        return pre;
    }

    public void setPre(int[] pre) {
        this.pre = pre;
    }

    public int find(int x) {
//        while (pre[x] != x) {
//            x = pre[x];
//        }
//        return x;
        if (pre[x] == x) return x;
        return pre[x] = find(pre[x]);
    }

    public void join(int x, int y) {
        if (find4(x) != find4(y)) {
            pre[find4(x)] = find4(y);
        }
    }


    int find2(int x)                                       //查找根节点
    {
        int r = x;
        while (pre[r] != r)                           //返回根节点 r
            r = pre[r];

        int i = x, j;
        while (i != r)                                   //路径压缩
        {
            j = pre[i];                // 在改变上级之前用临时变量  j 记录下他的值
            pre[i] = r;                //把上级改为根节点
            i = j;
        }
        return r;
    }

    public int find3(int x) {
        int temp = x;
        while (temp != pre[temp]) {
            temp = pre[temp];
        }
        // temp = 2 x =10

        int i;
        // 优化
        while (x != temp) {
            i = pre[x];
            pre[x] = temp;
            x = i;
        }
        return temp;
    }

    public int find4(int x) {
        return x == pre[x] ? x : (pre[x] = find4(pre[x]));
    }
}
