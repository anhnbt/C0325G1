package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/12
 * Time: 16:04 PM
 */
public class ArrayDemo {

    // class
    public static void main(String[] args) {
        // local
        // Khai báo biến mảng: dataType[] variableName; or dataType variableName[];
        // Khởi tạo mảng: new dataType[size]; size là kích thước
//        double[] numbers; // null
//        numbers = new double[5]; // [0,0,0,0,0]
//        numbers[0] = 10; // [10,0,0,0,0]
//        System.out.println(numbers[0]);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        for (double item : numbers) {
//            System.out.println(item);
//        }
//        String[] names = new String[30];
//        names[0] = "C";
//        names[1] = "o";
//        names[2] = "d";
//        names[3] = "e";
//        for (String name : names) {
//            System.out.print(name);
//        }

//        int a = 10; // hard code: code cứng
//        int b = 90; // hard code: code cứng
//        System.out.println(sum(a, b));
//        modifyNumber();
//        ArrayDemo arrayDemo = new ArrayDemo();
//        arrayDemo.modifyNumber(a, b);
//        System.out.println(a); // 10
//        System.out.println(b); // 90

        int[] a = {1, 2};
        int[] b = a;
        int[] c = a;
        int[] d = a;
        b[0] = 100;
        b[1] = 200;
//        System.out.println(a);
//        System.out.println(b);
//        modifyNumberInArray(numbers);
        System.out.println(c[0]); // 1
//        System.out.println(a[1]); // 2
    }

    // modifier: public, protected, private, default

    static void modifyNumberInArray(int[] arr) {
        arr[0] = 10;
        arr[1] = 20;
    }

    // Hàm này dùng để demo past-by-value

//    public void modifyNumber(int firstNumber, int secondNumber) {
//        firstNumber = 10;
//        secondNumber = 20;
//    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
