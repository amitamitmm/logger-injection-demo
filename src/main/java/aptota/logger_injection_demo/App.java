package aptota.logger_injection_demo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	
	private static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args ){
    	printLog("You have successfully signin!! \n2017-04-12 17:47:08 INFO App:19 You have successfylly sign out!!");
        
    }
    
    public static void printLog(String str) {
    	logger.info("Message is :: "+str);
    }
}
