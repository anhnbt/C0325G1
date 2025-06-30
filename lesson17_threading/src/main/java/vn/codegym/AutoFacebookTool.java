package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 15:53
 */
public class AutoFacebookTool implements Runnable {
    public static final int TOTAL_NEWSFEED = 10; // 10 cai newsfeed
    public static final int MILLIS = 3000; // 3s
    String threadName;
    public AutoFacebookTool() {
    }


    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        try {
            System.out.println("Dang ket noi den Facebook voi username/password...");
            // Login.... (mua acc via)
            // Save access token
            // Tao request get 100 newfeeds
            boolean isSuccess = false;
            for (int i = 0; i < TOTAL_NEWSFEED; i++) {
                Thread.sleep(MILLIS);
                // Tao vong lap duyet 100 newfeeds, gui request like/reaction (haha,...)
                // Gui comment: cam on ban, .........
                if (threadName.equals("LIKE")) {
                    System.out.println("Dang like status cua xyz..." + i);
                } else {
                    System.out.println("Dang comment status cua xyz..." + i);
                }
                isSuccess = true;
            }
            long endTime = System.currentTimeMillis();
            if (isSuccess) {
                System.out.println(this.threadName + "Thanh cong xu ly mat bao nhieu !" + (endTime - startTime) / 1000 + "S");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
