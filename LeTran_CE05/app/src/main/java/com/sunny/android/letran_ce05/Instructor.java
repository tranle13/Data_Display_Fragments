
    // Name: Tran Le
    // AID - 1808
    // File name: Instructor.java

package com.sunny.android.letran_ce05;

public class Instructor extends Person {

    private String course;

    public Instructor(String firstName, String lastName, String course) {
        super(firstName, lastName);
        this.course = course;
    }

    void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | " + course;
    }

}
