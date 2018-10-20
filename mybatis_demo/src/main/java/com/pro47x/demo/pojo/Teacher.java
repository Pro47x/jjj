package com.pro47x.demo.pojo;

import java.util.List;

public class Teacher {
    private String userName;
    private String className;
    private int id;
    private List<Student> students;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "userName='" + userName + '\'' +
                ", className='" + className + '\'' +
                ", id=" + id +
                ", students=" + students +
                '}';
    }
}
