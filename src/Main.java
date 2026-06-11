import java.util.List;

public class Main {

    public static void main(String[] args) {

        String mensagem = "Oi, comprei uma calça jeans tamanho 44 ontem.";

        mensagem = normalizar(mensagem);

        List<Palavra> palavras = Palavras.getPalavras();

        int setorVendas = 0;

        int setorFinanceiro = 0;

        for (Palavra palavra : palavras) {
            if (mensagem.contains(palavra.getPalavra())) {
                if (palavra.getSetor().equals(Setor.VENDAS)) {
                    setorVendas++;
                } else if (palavra.getSetor().equals(Setor.FINANCEIRO)) {
                    setorFinanceiro++;
                }
            }
        }

        if (setorFinanceiro > setorVendas) {
            System.out.println("Redirecionando ao setor de financeiro");
        }

    }

    private static String normalizar(String text) {
        return text.toLowerCase()
                .replaceAll("[^a-záéíóúãõâêô\\s]", "")
                .trim();
    }
}
