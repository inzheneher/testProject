import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

    private static final Logger logger = LogManager.getLogger(TestClass.class);

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SimpleClass.class);
        SimpleClass sc = ctx.getBean(SimpleClass.class);
        logger.trace(sc.getS());
    }
}
