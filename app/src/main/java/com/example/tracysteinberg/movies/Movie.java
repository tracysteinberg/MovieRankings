package com.example.tracysteinberg.movies;

/**
 * Created by tracysteinberg on 07/08/2017.
 */


public class Movie {

    public String title;
    public String genre;
    public int ranking;


    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }


    public String getTitle (){
        return this.title;
    }

    public String getGenre (){
        return this.genre;
    }

    public int getRanking (){
        return this.ranking;
    }

    public String toString() {
        return "Title: " + getTitle() + "Genre: " + getGenre() + "Ranking: " + getRanking();
    }

}

