package com.sparta.spring_07.prac;

public class Prac {
    public static void main(String[] args) {
        Course course1 = new Course();

        course1.setTitle("웹 계발의 봄 스프링");
        course1.setTutor("남병관");
        course1.setDays(35);

        System.out.println(course1.getTitle());
        System.out.println(course1.getTutor());
        System.out.println(course1.getDays());

    }
}
