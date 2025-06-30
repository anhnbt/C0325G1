package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 16:06
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Thread chinh la: " + Thread.currentThread().getName());
        AutoFacebookTool likeTool = new AutoFacebookTool();
        Thread autoFacebookTool1 = new Thread(likeTool);
        autoFacebookTool1.setName("LIKE");
        likeTool.setThreadName(autoFacebookTool1.getName());
        autoFacebookTool1.start();
    }
}