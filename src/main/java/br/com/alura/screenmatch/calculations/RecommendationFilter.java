package br.com.alura.screenmatch.calculations;

public class RecommendationFilter {
    public void filter(Rateable rateable){
        if (rateable.getRating() >= 4){
            System.out.println("Top watches!");
        } else if (rateable.getRating() >= 2){
            System.out.println("Popular watches!");
        } else {
            System.out.println("Add to Watchlist");
        }
    }
}
