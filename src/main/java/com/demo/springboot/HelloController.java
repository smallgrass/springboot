package com.demo.springboot; /**
 * Created by Administrator on 2017/7/7.
 */

//rest接口 jar包

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "helloAAA";
    }
}
