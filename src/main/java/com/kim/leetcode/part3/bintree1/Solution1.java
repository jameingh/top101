package com.kim.leetcode.part3.bintree1;

import com.kim.leetcode.part3.TreeNode;

import java.util.List;

/**
 * @author JinXin
 * @date 2022/12/9 21:32
 * @description 二叉树的前序遍历(递归法)
 */
public class Solution1 {
    public void preorder(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder(list, root.left);
        preorder(list, root.right);
    }

}
