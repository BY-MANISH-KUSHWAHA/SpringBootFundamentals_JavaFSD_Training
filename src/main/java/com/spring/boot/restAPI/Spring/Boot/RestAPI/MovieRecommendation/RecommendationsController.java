package com.spring.boot.restAPI.Spring.Boot.RestAPI.MovieRecommendation;

import com.fasterxml.jackson.core.JsonEncoding;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecommendationsController {

    @GetMapping(value = "/movies")
    public List<Movie> getAllMovie(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1,"Iron Man 1",4.5));
        movies.add(new Movie(2,"Iron Man 2",4.7));
        movies.add(new Movie(3,"Iron Man 3",4.9));
        movies.add(new Movie(4,"Spiderman 1",5.5));
        movies.add(new Movie(5,"Spiderman 2",6.7));
        movies.add(new Movie(6,"Spiderman 3",7.9));
        movies.add(new Movie(7,"Need For Speed",8.9));

        return movies;
    }

    @GetMapping(value = "/movies-json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> getAllMovieJson(){
        return getAllMovie();
    }


}
