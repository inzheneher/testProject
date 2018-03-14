import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:simple.properties")
public class SimpleClass {

    @Value("${simple.one}")
    private String s;

    @Bean
    public String getS() {
        return s;
    }
}
