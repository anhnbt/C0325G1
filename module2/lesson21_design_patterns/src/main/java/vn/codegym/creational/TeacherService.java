package vn.codegym.creational;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 15:38
 */
public class TeacherService {
    Logger logger = Logger.getInstance();

    public TeacherService() {
        logger.log("WARNING", "TeacherService created.");
        logger.log("ERROR", "TeacherService created error.");
    }
}
