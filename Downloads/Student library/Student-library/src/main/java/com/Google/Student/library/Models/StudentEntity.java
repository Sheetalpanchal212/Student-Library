package com.Google.Student.library.Models;

public class StudentEntity {
    private int id;
    private String name;
    private String schoolName;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public StudentEntity(){

    }
    public StudentEntity(int id,String name,String schoolName){
        this.id=id;
        this.name=name;
        this.schoolName=schoolName;

    }
}
