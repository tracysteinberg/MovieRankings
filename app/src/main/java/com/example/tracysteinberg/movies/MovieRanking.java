package com.example.tracysteinberg.movies;

/**
 * Created by tracysteinberg on 07/08/2017.
 */

public class MovieRanking {
    public String title;
    public int ranking;


    public MovieRanking(String title, int ranking) {
        this.title = title;
        this.ranking = ranking;
    }



    public String getTitle (){
        return this.title;
    }

    public int getRanking (){
        return this.ranking;
    }



}
