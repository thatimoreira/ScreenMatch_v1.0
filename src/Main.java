public class Main {
    public static void main(String[] args) {
        Movie   movie1 = new Movie();
        movie1.movieTitle = "The Godfather";
        movie1.releaseYear = 1972;
        movie1.includedInPlan = true;
        movie1.runningTimesInMinutes = 175;

        movie1.displayMovieInfo();
        movie1.updateRatingSum(8);
        movie1.updateRatingSum(7.5);
        movie1.updateRatingSum(9.8);
        System.out.printf("Total ratings...: %d\n", movie1.getTotalRatings());
        System.out.printf("Rating average..: %.2f\n", movie1.calculateRatingAverage());
    }
}
