package cn.edu.zjut.service;

import cn.edu.zjut.po.Student;

import java.util.List;

public interface IStudentService {
    /**
     * 增加一个学生信息
     */
    public boolean addStudent(Student student);

    /**
     * 修改一个学生的信息
     */
    public boolean updateStudent(Student student);

    /**
     * 删除一个学生的信息*
     */
    public boolean deleteStudent(int stuID);

    /**
     * 通过学号查找一个学生信息
     */
    public Student serachStudentByID(int stuID);

    /**
     * 查找所有学生的信息
     */
    public List<Student> searchAllStudent();

    /**
     * 查找一个班级学生的信息
     */
    public List<Student> searchStudentByClass(String className);

    /**
     * 查找一个专业学生的信息
     */
    public List<Student> searchStudentByDepart(String departName);

    /**
     * 根据输入的学生信息进行查找
     * 通过传入的student哪个属性不为空来判断根据什么查询
     */
    public boolean searchStudentByStudent (Student student);
}