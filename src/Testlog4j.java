import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;




public class Testlog4j {

	static Logger log= Logger.getLogger(Testlog4j.class);
	
//	static Logger myLogger = Logger.getLogger(log4jTest.class.getName());



	
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	BasicConfigurator.configure();
log.debug("this is debug log");

log.info("this is info log");

log.error("error in this proeject");	
	}

}
