package org.study.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinTreePostorderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }

    public void dfs(List<Integer> result, TreeNode node) {
        if (node == null) return;
        dfs(result, node.left);
        dfs(result, node.right);
        result.add(node.val);
    }

}
