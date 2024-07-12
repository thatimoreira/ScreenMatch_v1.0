package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }


    public void add(Title title){
        //System.out.printf("Adding title to runningTimeInMinutes calculation -> %s\n", title);
        this.totalTime += title.getRunningTimeInMinutes();
    }
}
