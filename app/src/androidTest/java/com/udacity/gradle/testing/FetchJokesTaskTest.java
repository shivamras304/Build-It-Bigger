package com.udacity.gradle.testing;


import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.chutkula.FetchJokeTask;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class FetchJokesTaskTest{

    String response = null;

    @Before
    public void cleaning() {
        FetchJokeTask.response = null;
    }

    @Test
    public void test() {
        FetchJokeTask fetchJokeTask = new FetchJokeTask();
        fetchJokeTask.execute();

        response = FetchJokeTask.response;

        Assert.assertNotNull(response);
    }

}