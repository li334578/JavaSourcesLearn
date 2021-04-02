package main.java.com.company.JavaSourceLearn.algorithm.tree.binarySortTree2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 测试二叉排序树
 * @date : 2021-03-11 20:04:07
 */
public class BinarySortTreeTest {
    public static void main(String[] args) {
        BinarySortTree binarySortTree = new BinarySortTree();
//        int[] nums = new int[]{8, 9, 6, 7, 5, 4};
//        int[] nums = new int[]{2, 1, 4, 3, 5, 6};
        int[] nums = new int[]{8, 9, 5, 4, 6, 7};
        for (int num : nums) {
            binarySortTree.add(new Node(num));
        }
        // 查看高度
        System.out.println(binarySortTree.root.height());
        System.out.println(binarySortTree.root);
    }
}
