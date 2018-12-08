package cn.edu.zjut.app;

import cn.edu.zjut.action.StudentMessageAction;
import cn.edu.zjut.dao.AdminMapper;
import cn.edu.zjut.dao.StudentMapper;
import cn.edu.zjut.po.Admin;
import cn.edu.zjut.po.Student;
import cn.edu.zjut.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminMapper adminMapper = (AdminMapper) ctx.getBean("adminMapper");
        StudentMapper studentMapper = (StudentMapper) ctx.getBean("studentMapper");
        Admin admin = null;
        try {
            admin = adminMapper.findById(1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        if(admin==null)
            System.out.println("admin null");
        System.out.println(admin.getName());
        Student student = null;
        try {
            student = studentMapper.selectStudentById(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (student == null)
            System.out.println("student null");
    }
}
