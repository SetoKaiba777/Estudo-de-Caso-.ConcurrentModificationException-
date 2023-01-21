public class ClasseTeste {

    private Validacao validacao;

    public ClasseTeste(){
        this.validacao = new Validacao();
    }

    public String isValid(){
        for (Boolean resultado : validacao.validar())
            System.out.println("foo-bar");
        return "Inválido";
    }
}
