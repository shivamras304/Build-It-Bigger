package com.udacity.gradle.testing;


import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.chutkula.FetchJokeTask;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class FetchJokesTaskTest{

    final String LOG_TAG = getClass().getName();

    String response = null;

    @Before
    public void cleaning() {
        response = null;
    }

    @Test
    public void test() throws ExecutionException, InterruptedException {

        try {
            FetchJokeTask fetchJokeTask = new FetchJokeTask();
            fetchJokeTask.execute().get();
        }
        catch (Exception e) {
            Log.e(LOG_TAG, e.getMessage());
        }
        response = FetchJokeTask.response;

        Assert.assertNotNull(response);
    }

}