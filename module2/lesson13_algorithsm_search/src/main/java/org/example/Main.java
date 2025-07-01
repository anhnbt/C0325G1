package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/26
 * Time: 15:54 ${AM_PM}
 */
public class Main {

    public static final int[] numbers = {4, 13, 15, 12, 22, 33, 55, 98}; // asc|desc

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(Main.numbers));
//        int target = 55;
//        int result = linearSearch(numbers, target);
//        if (result != -1) {
//            System.out.println("Ket qua tim thay gia tri " + target + " tai vi tri " + result + ": " + numbers[result]);
//        } else {
//            System.out.println("Khong tim thay ket qua nao");
//        }
//        System.out.println("Mảng numbers trước khi sắp xếp");
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 4, 5)); // Wrap
//        Collections.sort(list);
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//        System.out.println("Mảng numbers sau khi sắp xếp");
//        System.out.println(Arrays.toString(numbers));
//
//        int result = binarySearch(numbers, target);
//        if (result != -1) {
//            System.out.println("Ket qua tim thay gia tri " + target + " tai vi tri " + result + ": " + numbers[result]);
//        } else {
//            System.out.println("Khong tim thay ket qua nao");
//        }
    }

    static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (array[middle] == target) {
                return middle;
            }
            if (target < array[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

}