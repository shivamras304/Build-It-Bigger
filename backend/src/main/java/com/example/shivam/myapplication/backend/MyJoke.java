package com.example.shivam.myapplication.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyJoke {

    private String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String thisJoke) {
        joke = thisJoke;
    }
}