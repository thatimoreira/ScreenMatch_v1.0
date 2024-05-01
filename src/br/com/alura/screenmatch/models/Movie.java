package br.com.alura.screenmatch.models;

public class Movie {
    private String   movieTitle;             //nomeFilme
    private int      releaseYear;            //anoDeLançamento
    private boolean  includedInPlan;         //incluidoNoPlano
    private double  ratingSum;              //somaDasAvaliacoes
    private int     totalRatings;           //totalDeAvaliacoes
    private int      runningTimesInMinutes;  //duracaoEmMinutos

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public double getRatingSum() {
        return ratingSum;
    }

    public int getRunningTimesInMinutes() {
        return runningTimesInMinutes;
    }

    public int getTotalRatings(){
        return (totalRatings);
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setRunningTimesInMinutes(int runningTimesInMinutes) {
        this.runningTimesInMinutes = runningTimesInMinutes;
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
