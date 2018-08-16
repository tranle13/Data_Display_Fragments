
    // Name: Tran Le
    // AID - 1808
    // File name: Person.java

package com.sunny.android.letran_ce05;

public class Person {
    protected String name;
    protected String university;
    protected int identification;

    protected Person(String name, String university, int identification) {
        this.name = name;
        this.university = university;
        this.identification = identification;
    }

    void setName(String name) {
        this.name = name;
    }

    void setUniversity(String university) {
        this.university = university;
    }

    void setIdentification(int identification) {
        this.identification = identification;
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, String university, int identification, String grade) {
        super(name, university, identification);
        this.grade = grade;
    }

    void setGrade(String grade) {
        this.grade = grade;
    }
}

class Instructor extends Person {
    private String course;

    public Instructor(String name, String university, int identification, String course) {
        super(name, university, identification);
        this.course = course;
    }

    void setCourse(String course) {
        this.course = course;
    }
}

class Administrator extends Person {
    private String program;

    public Administrator(String name, String university, int identification, String program) {
        super(name, university, identification);
        this.program = program;
    }

    void setProgram(String program) {
        this.program = program;
    }
}
