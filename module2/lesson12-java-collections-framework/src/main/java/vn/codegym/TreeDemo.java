package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/04
 * Time: 20:59
 */
public class TreeDemo<E extends Comparable<E>> {

    TreeNode<E> root;
    public static void main(String[] args) {
        TreeDemo<Integer> treeDemo = new TreeDemo<>();
        treeDemo.root = new TreeNode<>(60);
        treeDemo.root.left = new TreeNode<>(55);
        treeDemo.root.right = new TreeNode<>(100);

        if (treeDemo.search(55)) {
            System.out.println("Found 55 in the tree.");
        } else {
            System.out.println("55 not found in the tree.");
        }
    }

    public boolean search(E element) {
        TreeNode<E> current = root;

        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return true; // Found the element
            }
        }
        return false;
    }
}
