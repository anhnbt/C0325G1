/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/21
 * Time: 10:37
 */
public class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
    }

    public static void main(String[] args) {
        Node<String> head = null; // Danh sách bây giờ là rỗng
        Node<String> tail = null;

        head = new Node<>("Chicago");
        tail = head;

        tail.next = new Node<>("Denver");
        tail = tail.next;

        tail.next = new Node<>("Dallas");
        tail = tail.next;

        Node current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }
}
