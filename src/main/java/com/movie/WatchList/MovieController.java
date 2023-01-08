package com.movie.WatchList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movie")
public class MovieController {

	@Autowired
	MovieService movieService;

	@PostMapping("/add-movie")
	public ResponseEntity<String> addMovie(@RequestBody Movie movie){
		movieService.addMovie(movie);
		return new ResponseEntity<>("New movie added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/get-director-by-movieName/{name}")
	public ResponseEntity<String> getDirectorByMovieName(@PathVariable String name){
		String directorName = null;

		directorName = movieService.getDirectorByMovieName(name);
		return new ResponseEntity<>(directorName, HttpStatus.CREATED);
	}
}
