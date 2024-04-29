public class Main {
    public static void main(String[] args) {
        Movie   movie1 = new Movie();
        movie1.movieTitle = "The Godfather";
        movie1.releaseYear = 1972;
        movie1.includedInPlan = true;
        movie1.rating = 9.6;
        movie1.totalRatings = 8084;
        movie1.runningTimesInMinutes = 175;

        movie1.displayMovieInfo();
    }
}
