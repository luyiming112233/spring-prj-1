package cn.edu.zjut.po;

public class Teacher {
    private int tedID;
    private String name;
    private String password;
    private Integer sex;
    private Integer phone;

    public Teacher(){ }

    public Teacher(int tedID, String name, String password, Integer sex, Integer phone) {
        this.tedID = tedID;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.phone = phone;
    }

    public int getTedID() {
        return tedID;
    }

    public void setTedID(int tedID) {
        this.tedID = tedID;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
