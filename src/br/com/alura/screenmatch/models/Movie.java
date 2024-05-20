package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Rateable;

public class Movie extends Title implements Rateable {
    private String  director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) getRatingSum() / getTotalRatings();
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() + " (" + getReleaseYear() + ")";
    }
}
