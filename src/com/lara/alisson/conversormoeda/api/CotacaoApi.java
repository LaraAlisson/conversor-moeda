package com.lara.alisson.conversormoeda.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lara.alisson.conversormoeda.dto.ConversionRates;
import com.lara.alisson.conversormoeda.dto.CotacaoDto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CotacaoApi {

    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();


    private final String chave = "67a7d5801a928fa947990322";


    public CotacaoDto buscarCotacao(String valor1, String valor2) {
        try {
            String endereco = "https://v6.exchangerate-api.com/v6/"+chave+"/pair/"+valor1+"/"+valor2;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();


            ConversionRates conversionRates = gson.fromJson(json, ConversionRates.class);
            CotacaoDto cotacaoDto = new CotacaoDto(conversionRates);


            return cotacaoDto;

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

