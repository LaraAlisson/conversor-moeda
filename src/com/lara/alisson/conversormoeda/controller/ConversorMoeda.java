package com.lara.alisson.conversormoeda.controller;

import com.lara.alisson.conversormoeda.api.CotacaoApi;
import com.lara.alisson.conversormoeda.dto.CotacaoDto;

import java.util.Scanner;

public class ConversorMoeda{

    private final Scanner leitura;
    private final CotacaoApi cotacaoApi;

    public ConversorMoeda(Scanner leitura, CotacaoApi cotacaoApi) {
        this.leitura = leitura;
        this.cotacaoApi = cotacaoApi;
    }

    public void executarConversao() {
        try {
            System.out.print("Informe o código da moeda de origem (ex: USD): ");
            String moedaOrigem = leitura.next().toUpperCase();

            System.out.print("Informe o código da moeda de destino (ex: BRL): ");
            String moedaDestino = leitura.next().toUpperCase();

            System.out.print("Informe o valor a ser convertido: ");
            double valor = leitura.nextDouble();

            CotacaoDto cotacao = cotacaoApi.buscarCotacao(moedaOrigem, moedaDestino);
            double valorConvertido = cotacao.getConversionRate(valor);

            System.out.printf("\nResultado: %.2f %s equivalem a %.2f %s%n",
                    valor, moedaOrigem, valorConvertido, moedaDestino);

            System.out.println(cotacao.getCodeBase());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao realizar a conversão. Detalhes: " + e.getMessage());
        }
    }
}
