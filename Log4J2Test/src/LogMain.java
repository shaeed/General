import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {
	
	public static void main(String[] args) {
		Logger logger = LogManager.getRootLogger();
		logger.trace("Exception: \n" + new Exception().toString());
	}
}
