package com.movie.WatchList;

public class Movie {
	private String movieName;

	private String directorName;

	public Movie(){

	}

	public Movie(String movieName, String directorName) {
		this.movieName = movieName;
		this.directorName = directorName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
}
