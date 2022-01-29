public class Cook extends Human implements CapableCook{

    public Cook(String name) {
        super(name);
    }

    @Override
    public void Cook_food() {
        System.out.println("Повар способен готовить вкусную еду");
    }
}
