package com.revature;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
                //implement logic here
                // convert body of request to json string
               String jsonString = ctx.body();
               // use jackson to convert to song object
               ObjectMapper om = new ObjectMapper();
               Song song = om.readValue(jsonString, Song.class);
               // return artist name in body
               ctx.result(song.getArtistName());
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
               //implement logic here
               // convert body of request to json string
               String jsonString = ctx.body();
               // use jackson to convert to song object
               ObjectMapper om = new ObjectMapper();
               Song song = om.readValue(jsonString, Song.class);
               // let request know we will send back json in the body
               ctx.contentType("application/json");
               // change the artist
               song.setArtistName("Beatles");
               // use jackson to convert back to json object to be returned
                String jsonStringToBeReturned = om.writeValueAsString(song);
               //return json object of song with updated artist
               ctx.result(jsonStringToBeReturned);
        });


        return app;
    }
    
}
