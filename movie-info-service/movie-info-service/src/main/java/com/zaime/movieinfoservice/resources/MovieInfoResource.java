package com.zaime.movieinfoservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaime.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {
	
	@GetMapping("/{movieID}")
	public Movie getMovieInfo(@PathVariable("movieID") String movieID) {
		return new Movie(movieID, "Test Movie");
	}

}
