package com.sparta.spring_07.prac;

public class Course {
    private String title;
    private String tutor;
    private int days;

    public Course(){
    }

    //Getter
    public String getTitle(){
        return this.title;
    }
    public String getTutor(){
        return this.tutor;
    }
    public int getDays(){
        return this.days;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    public void setDays(int days) {
        this.days = days;
    }
}
