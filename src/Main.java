import br.com.alura.screenmatch.calculations.Rateable;
import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie godfather = new Movie();
        godfather.setTitle("The Godfather");
        godfather.setReleaseYear(1972);
        godfather.setIncludedInPlan(true);
        godfather.setRunningTimesInMinutes(175);

        System.out.println("\n---------------------------- MOVIE ----------------------------");
        godfather.displayTitleInfo();
        godfather.updateRatingSum(8);
        godfather.updateRatingSum(7.5);
        godfather.updateRatingSum(9.8);
        System.out.printf("Running time.......: %d min\n", godfather.getRunningTimeInMinutes());
        System.out.printf("Total ratings......: %d\n", godfather.getTotalRatings());
        System.out.printf("Rating average.....: %.2f\n", godfather.calculateRatingAverage());

        System.out.println("\n---------------------------- SERIE ----------------------------");
        Episode demonSlayer = new Episode();
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
        System.out.printf("Time to binge-watch: %d min\n", demonSlayer.getRunningTimeInMinutes());
        System.out.printf("Total ratings......: %d\n", demonSlayer.getTotalRatings());
        System.out.printf("Rating average.....: %.2f\n", demonSlayer.calculateRatingAverage());

        System.out.println("\n---------------------- BINGE-WATCH TIME ----------------------");
        TimeCalculator  calculator = new TimeCalculator();
        calculator.add(godfather);
        calculator.add(demonSlayer);
        System.out.printf("Titles: '%s' and '%s'\n", godfather.getTitle(), demonSlayer.getTitle());
        System.out.printf("Binge-watch time: %s min\n", calculator.getTotalTime());

        System.out.println("\n----------------------- RECOMMENDATION -----------------------");
        RecommendationFilter    recommendationFilter = new RecommendationFilter();
        System.out.printf("Serie....: %s\n", demonSlayer.getTitle());
        demonSlayer.setName("Cruelty");
        demonSlayer.setNumber(1);
        demonSlayer.setTotalViews(1500);
        System.out.printf("Episode %d: '%s' -> ", demonSlayer.getNumber(), demonSlayer.getName());
        recommendationFilter.filter(demonSlayer);
        demonSlayer.setName("Trainer Sakonji Urokodaki");
        demonSlayer.setNumber(2);
        demonSlayer.setTotalViews(1200);
        System.out.printf("Episode %d: '%s' -> ", demonSlayer.getNumber(), demonSlayer.getName());
        recommendationFilter.filter(demonSlayer);
        demonSlayer.setName("Sabito and Makomo");
        demonSlayer.setNumber(3);
        demonSlayer.setTotalViews(900);
        System.out.printf("Episode %d: '%s' -> ", demonSlayer.getNumber(), demonSlayer.getName());
        recommendationFilter.filter(demonSlayer);
        demonSlayer.setName("Final selection");
        demonSlayer.setNumber(4);
        demonSlayer.setTotalViews(600);
        System.out.printf("Episode %d: '%s' -> ", demonSlayer.getNumber(), demonSlayer.getName());
        recommendationFilter.filter(demonSlayer);
    }
}
