/**
 * JWW
 */
package cn.edu.zjut.service;


import cn.edu.zjut.dao.TeacherMapper;
import cn.edu.zjut.po.Teacher;

import java.util.Map;

public class TeacherService implements ITeacherService {
    private Map<String, Object> request, session;
    private TeacherMapper teacherMapper = null;

    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    public boolean login(Teacher teacher) {
        System.out.println(teacher.getTedID());
        Teacher instance = new Teacher();
        try {
            instance = teacherMapper.findById(teacher.getTedID());
            if (instance == null) {
                return false;
            } else {
                teacher = instance;
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
