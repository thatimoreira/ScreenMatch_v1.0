package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Rateable;

public class Movie extends Title implements Rateable {
    private String  director;

    // Constructor -> same name as the class and returns nothing
    public Movie(String title, int releaseYear) {
        super(title, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    // Now a constructor was created (line 9), so is this setter really necessary?
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
