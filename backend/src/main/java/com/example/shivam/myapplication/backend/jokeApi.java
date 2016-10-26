/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.shivam.myapplication.backend;

import com.example.Joke;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.shivam.example.com",
                ownerName = "backend.myapplication.shivam.example.com",
                packagePath = ""
        )
)
public class JokeApi {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "tellJoke")
    public MyJoke tellJoke() {
        MyJoke myJoke = new MyJoke();

        Joke joke = new Joke();
        myJoke.setJoke(joke.getJoke());

        return myJoke;
    }

}
