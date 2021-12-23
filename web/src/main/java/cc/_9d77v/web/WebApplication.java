package cc._9d77v.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class WebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=SpringApplication.run(WebApplication.class, args);
    }

}
