public class ClasseB {

    private final ClasseC classeC;
    private Boolean result;

    public ClasseB(){
        this.classeC = new ClasseC();
    }

    public Boolean isValid(){
        for (Boolean resultado : classeC.validar())
            this.result = resultado;
        return result;
    }
}
