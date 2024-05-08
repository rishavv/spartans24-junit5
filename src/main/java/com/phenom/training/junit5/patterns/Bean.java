package com.phenom.training.junit5.patterns;

public class Bean {

    private String firstName;
    private String lastName;

    public Bean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
