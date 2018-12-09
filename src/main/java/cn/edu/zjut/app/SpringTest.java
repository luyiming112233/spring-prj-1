package cn.edu.zjut.app;

import cn.edu.zjut.action.TeacherAction;
import cn.edu.zjut.dao.TeacherMapper;
import cn.edu.zjut.po.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherMapper teacherMapper = (TeacherMapper) ctx.getBean("teacherMapper");
        TeacherAction teacherAction =(TeacherAction)ctx.getBean("teacherAction");
        try {
            Teacher tea = new Teacher();
            tea.setTeaID(2015111);
            tea.setName("laowang");
            teacherMapper.updateTeacher(tea);
            List<Teacher> teacherList = teacherMapper.listAllTeacher();
            for(Teacher teacher:teacherList)
                System.out.println(teacher.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
