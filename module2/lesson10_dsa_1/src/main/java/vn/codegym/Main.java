package vn.codegym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**s
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/21
 * Time: 15:32 ${AM_PM}
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Collection<String> collection = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
//        collection.add("PHP");
//        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Hải Anh", 24, 3.9));
//        students.add(new Student("Chiến", 26, 3.9));
//        students.add(new Student("Toàn", 24, 3.9));
//        students.add(new Student("An", 23, 3.9));
//        students.add(new Student("Hoàng", 33, 3.9));
//        students.add(new Student("Yến Nhi", 24, 3.9));
//        students.add(new Student("Thiện", 23, 3.9));
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//        for (String item : students) {
//            System.out.println(item);
//            // list.remove(item); // ❌ Sẽ ném ConcurrentModificationException
//        }
//        ListIterator<String> iterator = list.listIterator();
//
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if (item.equals("Java")) {
//                iterator.remove(); // ✅ An toàn
//            } else if (item.equals("Python")) {
//                iterator.add("C++"); // ✅ Thêm mới trong khi duyệt
//            }
//        }
//        ListIterator còn cho phép duyệt ngược lại (hasPrevious() + previous()).




                List<Student> students = new LinkedList<>(Arrays.asList(new Student("An")));
        students.add(new Student("Hải Anh", 24, 3.9));

        // Duyệt students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}