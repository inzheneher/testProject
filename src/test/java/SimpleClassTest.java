import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SimpleClass.class})
public class SimpleClassTest {

    private static final Logger logger = LogManager.getLogger(SimpleClassTest.class);

    @Autowired
    private SimpleClass sc;

    @Test
    public void getS() {
        logger.trace(sc.getS());
        assertEquals("some text one", sc.getS());
    }
}