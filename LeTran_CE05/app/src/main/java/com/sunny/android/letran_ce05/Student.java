
    // Name: Tran Le
    // AID - 1808
    // File name: Student.java

package com.sunny.android.letran_ce05;

public class Student extends Person {

    private String studentId;

    public Student(String firstName, String lastName, String studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | " + studentId;
    }
}
