import javax.swing.event.HyperlinkEvent;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cook humanCook = new Cook("Алексей");
        Driver humamDrive = new Driver("Павел");
        Programmicht humanProgrammer = new Programmicht("Артур");

        ArrayList<Human> Job = new ArrayList<>();
        Job.add(humanCook);
        Job.add(humamDrive);
        Job.add(humanProgrammer);

        for (Human human : Job){
            human.voice();
        }

        ArrayList<CapableCook> cooks = new ArrayList<>();
        cooks.add(humanCook);
        for (CapableCook cook : cooks){
            cook.Cook_food();
        }


    }
}

