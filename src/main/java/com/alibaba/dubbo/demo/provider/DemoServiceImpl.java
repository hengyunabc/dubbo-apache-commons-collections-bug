
package com.alibaba.dubbo.demo.provider;
 
import com.alibaba.dubbo.demo.DemoService;
 
public class DemoServiceImpl implements DemoService {
 
    public String sayHello(Object o) {
        return "Hello " + o;
    }
 
}