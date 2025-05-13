// Caminho: com.lara.alisson.conversormoeda.controller.ConversorMoeda.java
package com.lara.alisson.conversormoeda.controller;

import com.lara.alisson.conversormoeda.api.CotacaoApi;
import com.lara.alisson.conversormoeda.dto.CotacaoDto;
import com.lara.alisson.conversormoeda.exception.entradaUsuarioInvalida;

import java.util.Scanner;

public class ConversorMoeda {

    private final Scanner leitura;
    private final CotacaoApi cotacaoApi;

    public ConversorMoeda(Scanner leitura, CotacaoApi cotacaoApi) {
        this.leitura = leitura;
        this.cotacaoApi = cotacaoApi;
    }

    public void executarConversao() {
        try {

            String moedaDestino = "";
            String moedaOrigem = "";
            int opcao = 0;

            while (true) {
                System.out.println("Digite uma das opções do menu ou 11 para escolher a moeda de sua preferência:");
                if (leitura.hasNextInt()) {
                    opcao = leitura.nextInt();
                    break; // entrada válida, sai do loop
                } else {
                    System.out.println("Entrada inválida. Por favor, digite apenas números.");
                    leitura.next(); // consome a entrada inválida para evitar loop infinito
                }
            }

            if(opcao <= 10){
                switch (opcao) {
                    case 1:
                        moedaOrigem = "USD";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu USD -> BRL (Dólar para Real)");
                        break;
                    case 2:
                        moedaOrigem = "SGD";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu SGD -> BRL (Dólar de Singapura para Real)");
                        break;
                    case 3:
                        moedaOrigem = "HKD";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu HKD -> BRL (Dólar de Hong Kong para Real)");
                        break;
                    case 4:
                        moedaOrigem = "BRL";
                        moedaDestino = "USD";
                        System.out.println("Você escolheu BRL -> USD (Real para Dólar)");
                        break;
                    case 5:
                        moedaOrigem = "CNY";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu CNY -> BRL (Yuan Chinês para Real)");
                        break;
                    case 6:
                        moedaOrigem = "RUB";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu RUB -> BRL (Rublo Russo para Real)");
                        break;
                    case 7:
                        moedaOrigem = "EUR";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu EUR -> BRL (Euro para Real)");
                        break;
                    case 8:
                        moedaOrigem = "GBP";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu GBP -> BRL (Libra Esterlina para Real)");
                        break;
                    case 9:
                        moedaOrigem = "JPY";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu JPY -> BRL (Iene Japonês para Real)");
                        break;
                    case 10:
                        moedaOrigem = "CAD";
                        moedaDestino = "BRL";
                        System.out.println("Você escolheu CAD -> BRL (Dólar Canadense para Real)");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        leitura.close();
                        return;
                }
            }else {

                while (true) {
                    System.out.print("Informe o código da moeda de origem (ex: USD): ");
                    moedaOrigem = leitura.next().toUpperCase();

                    if (moedaOrigem.matches("[A-Z]+") && moedaOrigem.length() == 3) {
                        break;
                    } else {
                        System.out.println("Código inválido. (ex: USD).");

                    }

                }

                while (true) {
                    System.out.print("Informe o código da moeda de destino (ex: BRL): ");
                    moedaDestino = leitura.next().toUpperCase();

                    if (moedaDestino.matches("[A-Z]+") && moedaDestino.length() == 3) {
                        break;
                    } else {
                        System.out.println("Código inválido. (ex: BRL).");
                    }
                }
            }


            double valor = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.print("Informe o valor a ser Cotado: ");

                if (leitura.hasNextDouble()) {
                    valor = leitura.nextDouble();
                    entradaValida = true;
                } else {
                    System.out.println("Entrada inválida. Digite um valor válido.");
                    leitura.next(); // consome a entrada inválida
                }
            }


            CotacaoDto cotacao = cotacaoApi.buscarCotacao(moedaOrigem, moedaDestino);
            double valorConvertido = cotacao.converValor(valor);
            System.out.println("\nCotação utilizada: 1 "+moedaOrigem +" = " + cotacao.getConversionRate() +" "+ moedaDestino );
            System.out.printf("Valor convertido: %.2f %s equivalem a %.2f %s%n",
                    valor, moedaOrigem, valorConvertido, moedaDestino);

            //System.out.println(cotacao.getCodeBase());

        } catch (entradaUsuarioInvalida e) {
            System.out.println(e.getMsg());
        }
    }
}
