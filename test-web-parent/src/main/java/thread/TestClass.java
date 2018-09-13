package thread;

import com.sun.net.httpserver.HttpServer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import sun.net.www.http.HttpClient;
import sun.nio.ch.IOUtil;

import java.io.Console;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.*;

/**
 * Created by Administrator on 2017/12/14.
 */
public class TestClass {



    public static void main(String[] args) throws Exception{


        String date = UUID.randomUUID().toString();

        Logger logger = Logger.getLogger("chapter07");

      //  logger.setLevel(Level.ALL);

        FileHandler fileHandler = new FileHandler(date + "log.txt");

       // LogRecord lr = new LogRecord(Level.ALL, "log.txt");

        SimpleFormatter sf = new SimpleFormatter();
        fileHandler.setFormatter(sf);

        logger.addHandler(fileHandler);

     //   logger.log(lr);

        logger.info("日志测试two");
        logger.info("日志测试one");





    }
}
