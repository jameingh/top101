package com.kim.leetcode.part3.bintree1;

import com.kim.leetcode.part3.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author JinXin
 * @date 2022/12/9 21:38
 * @description 二叉树的前序遍历(非递归法)
 */
public class Solution2 {

    public int[] preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList(); //添加遍历结果的数组
        Stack<TreeNode> s = new Stack<>();
        if (root == null) //空树返回空数组
            return new int[0];
        s.push(root); //根节点先进栈
        while (!s.isEmpty()) {
            TreeNode node = s.pop(); //每次栈顶就是访问的元素
            list.add(node.val);
            if (node.right != null) //如果右边还有右子节点进栈
                s.push(node.right);
            if (node.left != null) //如果左边还有左子节点进栈
                s.push(node.left);
        }
        int[] res = new int[list.size()]; //返回的结果
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
