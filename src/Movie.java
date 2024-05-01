public class Movie {
    String  movieTitle;             //nomeFilme
    int     releaseYear;            //anoDeLançamento
    boolean includedInPlan;         //incluidoNoPlano
    double  ratingSum;                 //somaDasAvaliacoes
    int     totalRatings;          //totalDeAvaliacoes
    int     runningTimesInMinutes;  //duracaoEmMinutos

    void    displayMovieInfo(){
        System.out.printf("Movie title.....: %s\n", movieTitle);
        System.out.printf("Release year....: %s\n", releaseYear);
        if (includedInPlan == true){
            System.out.println("Included in plan: Yes");
        }
        else{
            System.out.println("Included in plan: No");
        }
        System.out.printf("Running time....: %d min\n", runningTimesInMinutes);
    }

    void    updateRatingSum(double newRating){
        if (newRating >= 0){
            ratingSum += newRating;
            totalRatings++;
        } else{
            System.out.println("Invalid rating. the rating must be equal or greater than zero");
        }
        
    }

    double  calculateRatingAverage(){
        return (ratingSum/totalRatings);
    }
}
