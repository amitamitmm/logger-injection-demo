package aptota.logger_injection_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogForgingDemo {
	private final Logger logger  = LoggerFactory.getLogger(LogForgingDemo.class);
	 
	public void addLog( String amount ) {
	    logger.info( "Amount credited = {}" , amount );
	}
	 
	public static void main( String[] args ) {
	    LogForgingDemo demo = new LogForgingDemo();
	   // demo.addLog("300");	    
	    demo.addLog("300 \n2017-04-12 17:47:08,957 INFO Amount reversed successfully");
	}
}
