package cn.edu.zjut.dao;

import cn.edu.zjut.po.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 新增学生
     */
    public int insertStudent(Student student) throws Exception;

    /**
     * 修改学生
     */
    public int updateStudent(Student student) throws Exception;

    /**
     * 刪除学生
     */
    public int deleteStudent(int id) throws Exception;

    /**
     * 根据id查询学生信息
     */
    public Student getStudentById(int id) throws Exception;

    /**
     * 查询所有的学生信息
     */
    public List<Student> listAllStudent() throws Exception;

    /**
     * 查询一个班级的学生信息
     */
    public List<Student> listStudentByClass(String className) throws Exception;

    /**
     * 查询一个专业的学生信息
     */
    public List<Student> listStudentByDepart(String departName) throws Exception;
}
