package com.movie.WatchList;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MovieRepository {


	HashMap<String, Movie> movieDb = new HashMap<>();

	public void addMovieToDb(Movie movie) {
		String movieName = movie.getMovieName();
		movieDb.put(movieName, movie);
	}

	public String getDirectorByMovieName(String movieName) {
		if(movieDb.containsKey(movieName))
			return movieDb.get(movieName).getDirectorName();
		return null;
	}

}
