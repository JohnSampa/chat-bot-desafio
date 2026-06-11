import java.util.ArrayList;
import java.util.List;

public class Palavras {

    public static List<Palavra> listaDePalavras =  List.of(
            new Palavra("valor",2, Setor.FINANCEIRO),
            new Palavra("cobrado",2,Setor.FINANCEIRO),
            new Palavra("cartão",1,Setor.FINANCEIRO),
            new Palavra("calça",1,Setor.VENDAS),
            new Palavra("tamanho 44",1,Setor.VENDAS)
    );

    public static List<Palavra>  getPalavras(){
        return listaDePalavras;
    }

}
