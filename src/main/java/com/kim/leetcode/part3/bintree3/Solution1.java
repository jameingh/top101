package com.kim.leetcode.part3.bintree3;

import com.kim.leetcode.part3.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JinXin
 * @date 2022/12/9 21:32
 * @description 二叉树的后序遍历(递归法)
 */
public class Solution1 {
    public void postorder(List<Integer> list, TreeNode root) {
        if (root == null) //遇到空节点则返回
            return;
        postorder(list, root.left); //先去左子树
        postorder(list, root.right); //再去右子树
        list.add(root.val); //最后访问根节点
    }

    public int[] postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList(); //添加遍历结果的数组
        postorder(list, root); //递归后序遍历
        int[] res = new int[list.size()]; //返回的结果
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
