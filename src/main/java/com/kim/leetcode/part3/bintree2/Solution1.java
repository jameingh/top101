package com.kim.leetcode.part3.bintree2;

import com.kim.leetcode.part3.TreeNode;

import java.util.List;

/**
 * @author JinXin
 * @date 2022/12/9 21:32
 * @description 二叉树的中序遍历(递归法)
 */
public class Solution1 {
    public void inorder(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(list, root.left);
        list.add(root.val);
        inorder(list, root.right);
    }

}
