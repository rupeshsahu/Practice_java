package Log4j_test;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jimpl {


  //  static Logger logger=Logger.getLogger(Log4jimpl.class);
  static Logger  logger= LogManager.getLogger(Log4jimpl.class);

    public static void main(String[] args) {
        logger.info("Hello:========");
        logger.warn("hellow:========");
        logger.error("hiihihiih:=========");
        logger.fatal("23432424:==========");
    }


}
