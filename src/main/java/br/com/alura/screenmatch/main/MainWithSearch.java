package br.com.alura.screenmatch.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.models.OmdbTitle;
import br.com.alura.screenmatch.models.Title;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Qual filme deseja buscar? ");
        var search = keyboard.nextLine();

        String adress = "https://www.omdbapi.com/?t=" + search + "&apikey=7bc2b861";

        try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(adress))
                                .build();
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
                
                String json = response.body();
                System.out.println(json);

                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .create();
                OmdbTitle myOmdbTitle = gson.fromJson(json, OmdbTitle.class);
                System.out.println(myOmdbTitle);

                    Title myTitle = new Title(myOmdbTitle);
                    System.out.println("Converted title:");
                    System.out.println(myTitle);
        } catch (NumberFormatException e) {
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: please check the argument(s)");
        }

        System.out.println("EXIT SUCCESS!");

        keyboard.close();
    }
}
