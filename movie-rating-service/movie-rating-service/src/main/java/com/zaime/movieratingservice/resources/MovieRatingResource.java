package com.zaime.movieratingservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaime.movieratingservice.models.Rating;

@RestController
@RequestMapping("/ratingsData")
public class MovieRatingResource {

	@GetMapping("/{movieID}")
	public Rating getRating(@PathVariable("movieID") String movieID) {
		return new Rating(movieID, 4);
	}
}
