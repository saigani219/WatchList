package com.movie.WatchList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;

	public void addMovie(Movie movie){

		movieRepository.addMovieToDb(movie);
	}

	public String getDirectorByMovieName(String name) {

		return movieRepository.getDirectorByMovieName(name);
	}
}
