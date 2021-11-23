package com.sparta.spring_08.prac;

public class Prac {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("스프링의 봄");
        course.setTutor("유제협");
        course.setDays(1);

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

        Tutor tutor = new Tutor();
        tutor.setName("유제협");
        tutor.setBio(3);

        System.out.println(tutor.getName());
        System.out.println(tutor.getBio());
    }
}
