public class Paralelo {
    private ClasseTeste classeTeste;

    public Paralelo() {
        classeTeste = new ClasseTeste();
    }
    public void execute() {
        new Thread() {
            @Override
            public void run() {
                System.out.println(classeTeste.isValid());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(classeTeste.isValid());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(classeTeste.isValid());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(classeTeste.isValid());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(classeTeste.isValid());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(classeTeste.isValid());
            }
        }.start();
    }

}
