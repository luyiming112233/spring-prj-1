package cn.edu.zjut.app;

import cn.edu.zjut.dao.CustomerMapper;
import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService)ctx.getBean("userService");
        Customer customer = new Customer();
        customer.setAccount("SPRING");
        customer.setPassword("SPRING");
        userService.register(customer);
    }
}
