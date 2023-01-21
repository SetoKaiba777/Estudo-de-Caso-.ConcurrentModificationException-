import java.util.ArrayList;
import java.util.Random;

public class ClasseC {

    private final ArrayList<Boolean> listaValidacao = new ArrayList<>();
    private final Random gerador = new Random();

    public ClasseC(){}

    public ArrayList<Boolean> validar(){
        listaValidacao.clear();
        preencher();
        return listaValidacao;
    }

    private void preencher(){
        for(int i=0; i < 10000; i++) listaValidacao.add(gerador.nextBoolean());
        listaValidacao.add(true);
        listaValidacao.add(false);
    }


}
