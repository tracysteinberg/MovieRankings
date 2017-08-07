package com.example.tracysteinberg.movies;

import java.util.HashMap;

import static java.util.HashMap.*;

/**
 * Created by tracysteinberg on 07/08/2017.
 */

public class MovieRankingTest {

        public static void  mail(String[] args) {

         HashMap<String, Integer> movieRankings = new HashMap<String,Integer>();

                movieRankings.put("Gone With The Wind", 1);
                movieRankings.put("Avatar",      2);
                movieRankings.put("Star Wars",     3);
                movieRankings.put("Titantic", 4);
                movieRankings.put("The Sound of Music",    5);
                movieRankings.put("E.T. the Extra Terrestrial",    6);
                movieRankings.put("The Ten Commandments",    7);
                movieRankings.put("Doctor Zhivago",    8);
                movieRankings.put("Jaws",    9);
                movieRankings.put("Snow White and the Seven Dwarfs",    10);

            System.out.println( movieRankings.get("Gone With The Wind"));

            if (movieRankings.remove("Snow White and the Seven Dwarfs", 10)) {

                movieRankings.put("Jurassic World", 10);
            }

            System.out.println( movieRankings.get("Jurassic World"));

        }

}









