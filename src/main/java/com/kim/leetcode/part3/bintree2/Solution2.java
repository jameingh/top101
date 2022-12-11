package com.kim.leetcode.part3.bintree2;

import com.kim.leetcode.part3.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author JinXin
 * @date 2022/12/9 21:38
 * @description 二叉树的中序遍历(非递归法)
 */
public class Solution2 {

    public int[] inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList(); //添加遍历结果的数组
        Stack<TreeNode> s = new Stack<>();
        if (root == null) //空树返回空数组
            return new int[0];
        while (root != null || !s.isEmpty()) { //当树节点不为空或栈中有节点时
            while (root != null) { //每次找到最左节点
                s.push(root);
                root = root.left;
            }
            TreeNode node = s.pop(); //访问该节点
            list.add(node.val);
            root = node.right; //进入右节点
        }
        int[] res = new int[list.size()]; //返回的结果
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
