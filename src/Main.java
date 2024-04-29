public class Main {
    public static void main(String[] args) {
        Movie   movie1 = new Movie();
        movie1.movieTitle = "The Godfather";
        movie1.releaseYear = 1972;
        movie1.includedInPlan = true;
        movie1.rating = 9.6;
        movie1.totalRatings = 8084;
        movie1.runningTimesInMinutes = 175;
        System.out.printf("Movie title.....: %s\n", movie1.movieTitle);
        System.out.printf("Release year....: %s\n", movie1.releaseYear);
        if (movie1.includedInPlan == true){
            System.out.println("Included in plan: Yes");
        }
        else{
            System.out.println("Included in plan: No");
        }
        System.out.printf("Rating..........: %.2f\n", movie1.rating);
        System.out.printf("Running time....: %d min\n", movie1.runningTimesInMinutes);
        System.out.printf("Total ratings...: %d\n", ++movie1.totalRatings);
    }
}
