import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestClass {

    private static final Logger logger = LogManager.getLogger(TestClass.class);

    public static void main(String[] args) {
        logger.trace("!!!TRACE!!!");
        logger.debug("!!!DEBUG!!!");
        logger.info("!!!INFO!!!");
        logger.warn("!!!WARN!!!");
        logger.error("!!!ERROR!!!");
        logger.fatal("!!!FATAL!!!");
    }

}
