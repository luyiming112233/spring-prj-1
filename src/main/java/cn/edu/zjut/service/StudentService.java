package cn.edu.zjut.service;

import cn.edu.zjut.dao.StudentMapper;
import cn.edu.zjut.po.Student;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentService implements IStudentService {
    private Map<String, Object> request;

    StudentMapper studentMapper = null;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    /*增加一个学生信息*/
    public boolean addStudent(Student student) {
        try {
            studentMapper.insertStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*修改一个学生的信息*/
    public boolean updateStudent(Student student) {
        try {
            studentMapper.updateStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*删除一个学生的信息*/
    public boolean deleteStudent(int stuID) {
        try {
            studentMapper.deleteStudent(stuID);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*通过学号查找一个学生信息*/
    public Student serachStudentByID(int stuID) {
        try {
            Student student = studentMapper.selectStudentById(stuID);
            return student;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*查找所有学生的信息*/
    public List<Student> searchAllStudent() {
        try {
            List<Student> studentList = studentMapper.selectAllStudent();
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查找一个班级学生的信息
     */
    public List<Student> searchStudentByClass(String className) {
        try {
            List<Student> studentList = studentMapper.selectStudentByClass(className);
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查找一个专业学生的信息
     */
    public List<Student> searchStudentByDepart(String departName) {
        try {
            List<Student> studentList = studentMapper.selectStudentByDepart(departName);
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据输入的学生信息进行查找
     * 通过传入的student哪个属性不为空来判断根据什么查询
     */
    public boolean searchStudentByStudent(Student student) {
        ActionContext ctx = ActionContext.getContext();
        request = (Map) ctx.get("request");
        request.remove("student");
        List<Student> studentList = null;
        try {
            if (student.getStuID() != null) {
                System.out.println("id:" + student.getStuID());
                Student newStudent = studentMapper.selectStudentById(student.getStuID());
                if (newStudent != null)
                    studentList.add(newStudent);
                studentList = new ArrayList<Student>();
            } else if (student.getClassname() != null) {
                studentList = studentMapper.selectStudentByClass(student.getClassname());
            } else if (student.getDepartname() != null) {
                studentList = studentMapper.selectStudentByDepart(student.getDepartname());
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
