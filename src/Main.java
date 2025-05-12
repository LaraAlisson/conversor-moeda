import com.lara.alisson.conversormoeda.api.CotacaoApi;
import com.lara.alisson.conversormoeda.controller.ConversorMoeda;
import com.lara.alisson.conversormoeda.controller.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        Scanner leitura = new Scanner(System.in);
        CotacaoApi cotacaoApi = new CotacaoApi(); // Supondo que esta seja sua classe de API
        Menu menu = new Menu();
        String sair = "";
        while(true) {
            System.out.println("Deseja Realizar uma cotação: " +
                    "\nY - Sim" +
                    "\nN - não");

            sair = leitura.next().toUpperCase();
            if(sair.equalsIgnoreCase("N")){
                System.out.println("Você optou para encerrar o programa");
                break;
            }
            ConversorMoeda handler = new ConversorMoeda(leitura, cotacaoApi);

            System.out.println("\n");
            menu.exibirMenu();
            handler.executarConversao();
        }
    }
}
