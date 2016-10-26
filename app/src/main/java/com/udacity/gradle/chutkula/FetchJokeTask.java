package com.udacity.gradle.chutkula;

import android.os.AsyncTask;

import com.example.shivam.myapplication.backend.jokeApi.JokeApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

/**
 * Created by shivam on 26/10/16.
 */

public class FetchJokeTask extends AsyncTask<Void, Void, String> {
    private static JokeApi jokeApiService = null;
    private boolean successfulResponse = true;
    public static String response = null;

    @Override
    protected String doInBackground(Void... params) {
        if(jokeApiService == null) {  // Only do this once
            JokeApi.Builder builder = new JokeApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://192.168.0.104:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            jokeApiService = builder.build();
        }



        try {
            response = jokeApiService.tellJoke().execute().getJoke();
            return response;
        } catch (IOException e) {
            successfulResponse = false;
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String joke) {
        if(!successfulResponse)
            joke = "null";

        EventBus.getDefault().post(joke);
    }
}
