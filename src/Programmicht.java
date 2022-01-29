public class Programmicht extends Human implements CapableProgramicht {


    public Programmicht(String name) {
        super(name);
    }

    @Override
    public void sing_code() {
        System.out.println("Программист способен писть код");
    }
}
