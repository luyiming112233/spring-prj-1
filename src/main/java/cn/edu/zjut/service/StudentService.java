package cn.edu.zjut.service;

import cn.edu.zjut.dao.StudentMapper;
import cn.edu.zjut.po.Student;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudentService implements IStudentService {
    private Map<String, Object> request;

    @Autowired
    StudentMapper studentMapper = null;

    @Override
    public boolean insertStudent(Student student) {
        try {
            studentMapper.insertStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateStudent(Student student) {
        try {
            studentMapper.updateStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteStudent(int stuID) {
        try {
            studentMapper.deleteStudent(stuID);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Student serachStudentByID(int stuID) {
        try {
            Student student = studentMapper.getStudentById(stuID);
            return student;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Student> listAllStudent() {
        try {
            List<Student> studentList = studentMapper.listAllStudent();
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Student> searchStudentByClass(String className) {
        System.out.println(className);
        try {
            List<Student> studentList = studentMapper.listStudentByClass(className);
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Student> searchStudentByDepart(String departName) {
        try {
            List<Student> studentList = studentMapper.listStudentByDepart(departName);
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean searchStudentByStudent(Student student) {
        ActionContext ctx = ActionContext.getContext();
        request = (Map) ctx.get("request");
        request.remove("student");
        List<Student> studentList = null;
        try {
            if (student.getStuID() != null) {
                System.out.println("id:" + student.getStuID());//后期删除
                Student newStudent = studentMapper.getStudentById(student.getStuID());//后期删除
                if (newStudent != null) {
                    studentList = new ArrayList<Student>();
                    studentList.add(newStudent);
                }
            } else if (student.getClazz() != null) {
                studentList = studentMapper.listStudentByClass(student.getClazz());
            } else if (student.getDepart() != null) {
                studentList = studentMapper.listStudentByDepart(student.getDepart());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (studentList != null) {
            request.put("studentList", studentList);
            System.out.println("success");
            for (Student stu : studentList) {
                System.out.println(stu.getStuID() + "," + stu.getName());
            }
            return true;
        } else {
            request.put("tip", "查找失败！");
            System.out.println("fail");
            return false;
        }
    }
}
