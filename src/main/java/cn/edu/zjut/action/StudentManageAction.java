package cn.edu.zjut.action;

import cn.edu.zjut.po.Student;
import cn.edu.zjut.service.IStudentService;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class StudentManageAction implements RequestAware {
    private Map request;
    private Student student;
    @Autowired
    private IStudentService studentService;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setRequest(Map<String,Object> request){
        this.request=request;
    }

    public String studentAdd(){
        if(student!=null) {
            studentService.addStudent(student);
            request.put("tip",student.getName()+"信息添加成功！");
            return "studentAddSuccess";
        }else{
            request.put("tip","添加失败！");
            return "studentAddFail";
        }
    }

    public String stuSearch(){
        if(student==null) {
            request.put("tip","查询失败！");
            return "stuSearchFail";
        }else{
            boolean srarch=studentService.searchStudentByStudent(student);
            student = new Student();
            if(srarch) {
                return "stuSearchSuccess";
            }
            else {
                student = null;
                return "stuSearchFail";
            }
        }
    }
}
