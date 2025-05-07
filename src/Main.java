import com.lara.alisson.conversormoeda.api.CotacaoApi;
import com.lara.alisson.conversormoeda.dto.CotacaoDto;

public class Main {
    public static void main(String[] args) {

        CotacaoApi cotacaoApi = new CotacaoApi();
        CotacaoDto taxa = cotacaoApi.buscarCotacao(); // Agora você pega o retorno

        System.out.println("Valor Contado = "+ taxa.getCodeTarget() +" "+ taxa.getConversionRate(10)); // Mostra o valor correto
    }
}

