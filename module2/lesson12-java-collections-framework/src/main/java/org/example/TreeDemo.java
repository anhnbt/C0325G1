package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/04
 * Time: 19:14
 */
public class TreeDemo {
    public static void main(String[] args) {
        TreeNode<Integer> root = new
                TreeNode<>(60);
        root.left = new TreeNode<>(55);
        root.right = new TreeNode<>(100);
    }
}
