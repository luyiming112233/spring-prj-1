package cn.edu.zjut.action;


import cn.edu.zjut.po.Teacher;
import cn.edu.zjut.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherAction {
    private Teacher teacher;
    @Autowired
    private ITeacherService teacherService = null;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String login() {
        if (teacherService.login(teacher)) {
            return "success";
        } else
            return "fail";
    }

}
