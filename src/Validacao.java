import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Validacao {

    private ArrayList listaValidacao = new ArrayList<Boolean>();
    private Random gerador = new Random();

    public Validacao(){}

    public ArrayList<Boolean> validar(){
        listaValidacao.clear();
        preencher();
        return listaValidacao;
    }

    private void preencher(){
        for(int i=0; i < 10; i++) listaValidacao.add(gerador.nextBoolean());
    }


}
