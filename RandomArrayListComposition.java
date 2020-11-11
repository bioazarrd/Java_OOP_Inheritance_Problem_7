package D_JavaAdvancedOOP.Lecture2_Inheritances.LabProblem4;
import java.util.ArrayList;
import java.util.Random;

public class RandomArrayListComposition {


    private ArrayList<String> container = new ArrayList<>();

    public void add(String string) {
        container.add(string);
    }

    public  String getRandomElement() {
        Random random = new Random();
        int size = container.size();
        int rnd = random.nextInt();
        return container.get(rnd);
    }






}



