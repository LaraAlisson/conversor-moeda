import com.lara.alisson.conversormoeda.api.CotacaoApi;
import com.lara.alisson.conversormoeda.controller.ConversorMoeda;
import com.lara.alisson.conversormoeda.controller.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        CotacaoApi cotacaoApi = new CotacaoApi(); // Supondo que esta seja sua classe de API

        ConversorMoeda handler = new ConversorMoeda(leitura, cotacaoApi);
        Menu menu = new Menu();

        menu.exibirMenu();
        handler.executarConversao();
    }
}
