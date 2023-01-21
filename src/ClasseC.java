import java.util.ArrayList;
import java.util.Random;

public class ClasseC {
    
    private final Random gerador = new Random();

    public ClasseC(){}

    public ArrayList<Boolean> validar(){
        ArrayList<Boolean> listaValidacao = new ArrayList<>();
        preencher(listaValidacao);
        return listaValidacao;
    }

    private void preencher(ArrayList<Boolean> listaValidacao){
        for(int i=0; i < 1000; i++) listaValidacao.add(gerador.nextBoolean());
        listaValidacao.add(true);
        listaValidacao.add(false);
    }


}
