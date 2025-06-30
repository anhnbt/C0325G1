package org.example;

/**
 * Lớp `MyLinkedListQueue` triển khai hàng đợi sử dụng danh sách liên kết.
 * Hàng đợi hoạt động theo nguyên tắc FIFO (First In, First Out).
 */
public class MyLinkedListQueue {
    private Node head; // Phần tử đầu tiên của hàng đợi
    private Node tail; // Phần tử cuối cùng của hàng đợi

    /**
     * Hàm khởi tạo: Tạo một hàng đợi rỗng.
     */
    public MyLinkedListQueue() {
        this.head = null; // Ban đầu hàng đợi rỗng
        this.tail = null;
    }

    /**
     * Thêm một phần tử vào cuối hàng đợi.
     * @param key Giá trị của phần tử cần thêm.
     */
    public void enqueue(int key) {
        Node newNode = new Node(key); // Tạo một Node mới
        if (tail == null) { // Nếu hàng đợi rỗng
            head = newNode; // Cả head và tail đều trỏ đến Node mới
            tail = newNode;
        } else { // Nếu hàng đợi không rỗng
            tail.next = newNode; // Gắn Node mới vào cuối hàng đợi
            tail = newNode; // Cập nhật tail
        }
    }

    /**
     * Lấy và xóa phần tử đầu tiên trong hàng đợi.
     * @return Node đầu tiên hoặc null nếu hàng đợi rỗng.
     */
    public Node dequeue() {
        if (head == null) { // Nếu hàng đợi rỗng
            return null; // Trả về null
        }
        Node dequeuedNode = head; // Lấy Node đầu tiên
        head = head.next; // Cập nhật head trỏ đến phần tử tiếp theo
        if (head == null) { // Nếu hàng đợi trở nên rỗng
            tail = null; // Đặt tail = null
        }
        return dequeuedNode; // Trả về Node đã lấy
    }
}