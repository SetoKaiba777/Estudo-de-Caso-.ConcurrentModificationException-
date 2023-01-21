import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClasseC {

    private final CopyOnWriteArrayList<Boolean> listaValidacao = new CopyOnWriteArrayList<>();
    private final Random gerador = new Random();

    public ClasseC(){}

    public CopyOnWriteArrayList<Boolean> validar(){
        listaValidacao.clear();
        preencher();
        return listaValidacao;
    }

    private void preencher(){
        for(int i=0; i < 1000; i++) listaValidacao.add(gerador.nextBoolean());
        listaValidacao.add(true);
        listaValidacao.add(false);
    }


}
