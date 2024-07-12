package reporting;

public class ApplicationLog {
    public static void epicLogger(String epic){
        reporting.TestLogger.log(epic);
        //TestLogger.log("Browser is launching");
    }
}
