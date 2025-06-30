package org.example.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/29
 * Time: 08:56
 */
public class StringSplitDemo {
    public static void main(String[] args) {
        String text = "50,Zombie,teeth,hands";
        String[] tokens = text.split(",");
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
