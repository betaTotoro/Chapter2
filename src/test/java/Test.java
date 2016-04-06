import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Yang on 2016/3/24.
 */
public class Test {

//    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {

//        logger.debug("this is debug message");
//        logger.info("this is info message");
//        logger.error("this is error message");
        DateFormat dateFormat = new SimpleDateFormat("yyy-M-dd");
        String date = dateFormat.format(new Date());
        System.out.println(new Date());
        System.out.println(date);

    }
}
