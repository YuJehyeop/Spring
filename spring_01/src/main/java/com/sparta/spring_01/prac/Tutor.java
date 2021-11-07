package com.sparta.spring_01.prac;

class Person {
    private String name;
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Tutor extends Person {
    private String address;

    // Person 클래스를 상속했기 때문에,
    // name 멤버변수와 getName() 메소드를 가지고 있습니다.
}
