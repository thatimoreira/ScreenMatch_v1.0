package br.com.alura.screenmatch.main;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.exceptions.InvalidYearFormatException;
import br.com.alura.screenmatch.models.OmdbTitle;
import br.com.alura.screenmatch.models.Title;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        String search = "";

        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .create();

        while (!search.equalsIgnoreCase("exit")) {

        System.out.print("Qual filme deseja buscar? ");
        search = keyboard.nextLine();

        String adress = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=7bc2b861";

        try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(adress))
                                .build();
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
                
                String json = response.body();
                System.out.println(json);

                OmdbTitle myOmdbTitle = gson.fromJson(json, OmdbTitle.class);
                System.out.println(myOmdbTitle);

                    Title myTitle = new Title(myOmdbTitle);
                    System.out.println("Converted title:");
                    System.out.println(myTitle);

                    titles.add(myTitle);
        } catch (NumberFormatException e) {
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: please check the argument(s)");
        } catch (InvalidYearFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    System.out.println(titles);

    try (FileWriter writer = new FileWriter("movies.json")) {
        writer.write(gson.toJson(titles));
    } catch (IOException e) {
        System.out.println("Error: could not write to file: " + e.getMessage());
    }

    System.out.println("EXIT SUCCESS!");

    keyboard.close();
    }
}
