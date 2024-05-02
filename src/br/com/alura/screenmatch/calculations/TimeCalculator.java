package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void add(Movie m){
        totalTime += m.getRunningTimeInMinutes();
    }

    public void add(Serie s){
        totalTime += s.getRunningTimeInMinutes();
    }
}
