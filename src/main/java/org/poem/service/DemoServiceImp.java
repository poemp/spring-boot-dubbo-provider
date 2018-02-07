package org.poem.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.poem.api.DemoService;

@Service(
        version = "1.0.0",
        interfaceClass = DemoService.class,
        timeout = 10000
)
public class DemoServiceImp implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello , " + name + "（from Spring Boot）";
    }
}
