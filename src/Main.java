import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Palavra> palavras = Palavras.getPalavras();

        int setorVendas = 0;

        int setorFinanceiro = 0;

        for (Palavra palavra : palavras) {
            if(palavra.getSetor().equals(Setor.VENDAS)){
                setorVendas++;
            }else if(palavra.getSetor().equals(Setor.FINANCEIRO)){
                setorFinanceiro++;
            }
        }

        if(setorFinanceiro > setorVendas){
            System.out.println("Redirecionando ao setor de vendas");
        }

    }
}
