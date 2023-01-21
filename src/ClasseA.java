public class ClasseA {
    private final ClasseB classeB;

    public ClasseA() {
        classeB = new ClasseB();
    }
    public void execute() {
        new Thread(() -> System.out.println(classeB.isValid())).start();

        new Thread(() -> System.out.println(classeB.isValid())).start();

        new Thread(() -> System.out.println(classeB.isValid())).start();

        new Thread(() -> System.out.println(classeB.isValid())).start();

        new Thread(() -> System.out.println(classeB.isValid())).start();

        new Thread(() -> System.out.println(classeB.isValid())).start();
    }

}
