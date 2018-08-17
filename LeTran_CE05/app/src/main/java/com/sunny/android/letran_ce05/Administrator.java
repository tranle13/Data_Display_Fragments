
    // Name: Tran Le
    // AID - 1808
    // File name: Administrator.java

package com.sunny.android.letran_ce05;

public class Administrator extends Person {

    private String program;

    public Administrator(String firstName, String lastName, String program) {
        super(firstName, lastName);
        this.program = program;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | " + program;
    }

}
