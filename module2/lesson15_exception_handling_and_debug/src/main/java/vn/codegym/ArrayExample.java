package vn.codegym;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/28
 * Time: 16:34
 */
public class ArrayExample {
    public static void main(String[] args) {
        try {
            System.out.println(System.getProperty("language"));
            for (String item : args) {
                System.out.println(item);
            }
            Scanner sc = new Scanner(System.in);
            int[] numbers = createRandomArray();
            printArray(numbers);
            System.out.println("Nhap vao chi so bat ky:");
            int index = sc.nextInt();
            System.out.println("Phan tu tai chi so " + index + " la: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chi so vuot qua gioi han cua mang. Vui long nhap chi so tu 0 den " + (createRandomArray().length - 1));
        } catch (InputMismatchException e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
        }
    }

    private static void printArray(int[] numbers) {
        System.out.println("Danh sach cac so ngau nhien:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int[] createRandomArray() {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // Random numbers from 1 to 100
        }
        return numbers;
    }
}
