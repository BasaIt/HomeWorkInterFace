public class Driver extends Human implements CapableDrive{


    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive_car() {
        System.out.println("Водитель способен хорошо водить машину");
    }
}
