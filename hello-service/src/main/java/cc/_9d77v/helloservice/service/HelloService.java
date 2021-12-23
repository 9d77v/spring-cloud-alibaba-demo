package cc._9d77v.helloservice.service;

import Service.IHelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloService implements IHelloService {
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
