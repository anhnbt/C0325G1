package vn.codegym;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/27
 * Time: 16:11 ${AM_PM}
 */
public class Main {
    public static void main(String[] args) {
//        int[] numbers = {2, 9, 5, 4, 8, 1}; // avg: O(n^2)
        Random rand = new Random();
        int[] numbers = new int[20]; // worst: O(n^2)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // best: O(n)
        System.out.println("Mảng numbers trước khi sắp xếp: ");
        System.out.println(Arrays.toString(numbers));
        BubbleSort.bubbleSort(numbers);
        System.out.println("Mảng numbers sau khi sắp xếp: ");
        System.out.println(Arrays.toString(numbers));
    }
}