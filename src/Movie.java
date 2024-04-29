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

    void    updateRating(double newRating){
        ratingSum += newRating;
        totalRatings++;
    }
}
