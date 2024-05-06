package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Rateable;

public class Episode extends Serie implements Rateable {
    private int     number;
    private String  name;
    private Serie   serie;
    private int     totalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getRating() {
        if (totalViews == 0){
            return 0;
        } else if (totalViews <= 100) {
            return 1;
        } else if (totalViews <= 300) {
            return 2;
        } else if (totalViews <= 600) {
            return 3;
        } else if (totalViews < 1000) {
            return 4;
        } else {
            return 5;
        }
    }
}
