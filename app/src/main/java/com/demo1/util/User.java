package com.demo1.util;

public class User {

    private String firstname;
    private String lastname;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("PUser: "+firstname+"last: "+lastname);
    }

    @Override
    public String toString() {

        return "P123 User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
