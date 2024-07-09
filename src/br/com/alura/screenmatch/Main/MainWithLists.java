package br.com.alura.screenmatch.Main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Movie godfather = new Movie("The Godfather", 1972);
        godfather.updateRatingSum(9.0);
        Movie avatar = new Movie("Avatar", 2009);
        avatar.updateRatingSum(8.5);
        Movie cityOfGod = new Movie("City of God (Cidade de Deus)", 2002);
        cityOfGod.updateRatingSum(9.5);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Title> list = new ArrayList<>();
        list.add(godfather);
        list.add(avatar);
        list.add(cityOfGod);
        list.add(lost);

        for (Title item : list) {
            System.out.println(item);
            Movie movie = (Movie) item; // typecasting
            System.out.println("Rating average: " + movie.calculateRatingAverage());
        }
    }
}
