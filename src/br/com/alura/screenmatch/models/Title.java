package br.com.alura.screenmatch.models;

public class Title implements Comparable<Title>{
    private String  title;             //nomeFilme
    private int     releaseYear;            //anoDeLançamento
    private boolean includedInPlan;         //incluidoNoPlano
    private double  ratingSum;              //somaDasAvaliacoes
    private int     totalRatings;           //totalDeAvaliacoes
    private int     runningTimesInMinutes;  //duracaoEmMinutos

    public Title(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
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

    public int getRunningTimeInMinutes() {
        return runningTimesInMinutes;
    }

    public int getTotalRatings(){
        return (totalRatings);
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void displayTitleInfo(){
        System.out.printf("Title..............: %s\n", title);
        System.out.printf("Release year.......: %d\n", releaseYear);
        if (includedInPlan){
            System.out.println("Included in plan...: Yes");
        }
        else{
            System.out.println("Included in plan...: No");
        }
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

    @Override
    public int compareTo(Title otherTitle) {
        return this.getTitle().compareTo(otherTitle.getTitle());
    }
}
