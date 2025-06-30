package org.example;

class TreeNode<E> {
    protected E element;
    protected
    TreeNode<E> left;
    protected
    TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }


//    public boolean search(E element) {
//        TreeNode<E> current = root;
//        while (current != null) {
//            if (element < current.element) {
//                current = current.left;
//            } else if (element > current.element) {
//                current = current.right;
//            } else
//                return true;
//        }
//        return false;
//    }
}