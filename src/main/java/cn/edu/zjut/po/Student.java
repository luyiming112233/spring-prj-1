package cn.edu.zjut.po;

public class Student {
    private Integer stuID;
    private String name;
    private String password;
    private String classname;
    private String departname;
    private String email;
    private String img;

    public Student(){
        this.password = "123456";
    }

    public Student(Integer stuID, String name, String password, String classname, String departname, String email, String img) {
        this.stuID = stuID;
        this.name = name;
        this.password = password;
        this.classname = classname;
        this.departname = departname;
        this.email = email;
        this.img = img;
    }

    public Integer getStuID() {
        return stuID;
    }

    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
