package br.com.alura.screenmatch.Main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Qual filme deseja buscar? ");
        var search = keyboard.nextLine();

        String adress = "https://www.omdbapi.com/?t=" + search + "&apikey=7bc2b861";

        HttpClient client = HttpClient.newHttpClient();
   HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(adress))
         .build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    System.out.println(response.body());

    keyboard.close();
    }
}
