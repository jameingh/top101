package com.kim.leetcode.part3.bintree3;

import com.kim.leetcode.part3.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author JinXin
 * @date 2022/12/9 21:38
 * @description 二叉树的后序遍历(非递归法)
 */
public class Solution2 {

    public int[] postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList(); //添加遍历结果的数组
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode pre = null;
        while (root != null || !s.isEmpty()) {
            while (root != null) { //每次先找到最左边的节点
                s.push(root);
                root = root.left;
            }
            TreeNode node = s.pop(); //弹出栈顶
            if (node.right == null || node.right == pre) { //如果该元素的右边没有或是已经访问过
                list.add(node.val); //访问中间的节点
                pre = node; //且记录为访问过了
            } else {
                s.push(node); //该节点入栈
                root = node.right; //先访问右边
            }
        }
        int[] res = new int[list.size()]; //返回的结果
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right.left = new TreeNode(1);
        root.right.left.right = new TreeNode(9);
        root.right.right = new TreeNode(0);
        root.left.left = new TreeNode(6);
        final int[] result = postorderTraversal(root);
        Arrays.stream(result).forEach(System.out::println);
    }
}
