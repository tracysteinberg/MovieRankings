package com.example.tracysteinberg.movies;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by tracysteinberg on 07/08/2017.
 */

public class MovieTest {


    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Gone With The Wind", "Historical Fiction", 1);

    }

    @Test
    public void getMovie() {
        assertEquals("Gone With The Wind", movie.getTitle());

    }


    @Test

    public void getGenre() {

        assertEquals("Historical Fiction", movie.getGenre());


    }

    @Test

    public void getRanking (){

        assertEquals(1, movie.getRanking());

    }



}

