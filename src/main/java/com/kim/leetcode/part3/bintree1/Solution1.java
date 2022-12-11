package com.kim.leetcode.part3.bintree1;

import com.kim.leetcode.part3.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JinXin
 * @date 2022/12/9 21:32
 * @description 二叉树的前序遍历(递归法)
 */
public class Solution1 {
    public void preorder(List<Integer> list, TreeNode root) {
        if (root == null) //遇到空节点则返回
            return;
        list.add(root.val); //先遍历根节点
        preorder(list, root.left); //再去左子树
        preorder(list, root.right); //最后去右子树
    }

    public int[] preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList(); //添加遍历结果的数组
        preorder(list, root); //递归前序遍历
        int[] res = new int[list.size()]; //返回的结果
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
