package com.JpaAuditExample.DataJpaAdutitDemo.controller;

import com.JpaAuditExample.DataJpaAdutitDemo.domain.Movie;
import com.JpaAuditExample.DataJpaAdutitDemo.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @PostMapping
    public void saveMovie(@ModelAttribute("movie")Movie movie){
        System.out.println(movie.getName() +" "+ movie.getYear() + " "+ movie.getGenre()+
                movie.toString());
        movieRepository.save(movie);
    }

    @GetMapping
    public List<Movie> getAll(){
        return movieRepository.findAll();
    }
}
