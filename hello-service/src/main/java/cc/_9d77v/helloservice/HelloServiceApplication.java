package cc._9d77v.helloservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@EnableDubbo(scanBasePackages = "cc._9d77v.helloservice.service")
@PropertySource(value = "classpath:/bootstrap.yml")
@SpringBootApplication
public class  HelloServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class, args);
    }

}
