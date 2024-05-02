import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie godfather = new Movie();
        godfather.setTitle("The Godfather");
        godfather.setReleaseYear(1972);
        godfather.setIncludedInPlan(true);
        godfather.setRunningTimesInMinutes(175);

        System.out.println("\n------------------------- MOVIE -------------------------");
        godfather.displayTitleInfo();
        godfather.updateRatingSum(8);
        godfather.updateRatingSum(7.5);
        godfather.updateRatingSum(9.8);
        System.out.printf("Running time.......: %d min\n", godfather.getRunningTimeInMinutes());
        System.out.printf("Total ratings......: %d\n", godfather.getTotalRatings());
        System.out.printf("Rating average.....: %.2f\n", godfather.calculateRatingAverage());

        System.out.println("\n------------------------- SERIE -------------------------");
        Serie   demonSlayer = new Serie();
        demonSlayer.setTitle("Demon Slayer - Kimetsu no Yaiba");
        demonSlayer.setReleaseYear(2016);
        demonSlayer.setIncludedInPlan(true);
        demonSlayer.updateRatingSum(7.5);
        demonSlayer.updateRatingSum(8.1);
        demonSlayer.updateRatingSum(7);
        demonSlayer.setEpisodesPerSeason(18);
        demonSlayer.setMinutesPerEpisode(25);
        demonSlayer.setSeasons(4);
        demonSlayer.displayTitleInfo();
        System.out.printf("Time to binge-watch: %dmin\n", demonSlayer.getRunningTimeInMinutes());
        System.out.printf("Total ratings......: %d\n", demonSlayer.getTotalRatings());
        System.out.printf("Rating average.....: %.2f\n", demonSlayer.calculateRatingAverage());
    }
}
