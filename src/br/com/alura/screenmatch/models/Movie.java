package br.com.alura.screenmatch.models;

public class Movie {
    public String   movieTitle;             //nomeFilme
    public int      releaseYear;            //anoDeLançamento
    public boolean  includedInPlan;         //incluidoNoPlano
    private double  ratingSum;              //somaDasAvaliacoes
    private int     totalRatings;           //totalDeAvaliacoes
    public int      runningTimesInMinutes;  //duracaoEmMinutos

    public int getTotalRatings(){
        return (totalRatings);
    }

    public void    displayMovieInfo(){
        System.out.printf("br.com.alura.screenmatch.models.Movie title.....: %s\n", movieTitle);
        System.out.printf("Release year....: %d\n", releaseYear);
        if (includedInPlan == true){
            System.out.println("Included in plan: Yes");
        }
        else{
            System.out.println("Included in plan: No");
        }
        System.out.printf("Running time....: %d min\n", runningTimesInMinutes);
    }

    public void    updateRatingSum(double newRating){
        if (newRating >= 0 && newRating <= 10){
            ratingSum += newRating;
            totalRatings++;
        } else{
            System.out.println("Invalid rating. the rating must be equal or greater than zero");
        }   
    }

    public double  calculateRatingAverage(){
        return (ratingSum/totalRatings);
    }
}
