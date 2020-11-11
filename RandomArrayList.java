package D_JavaAdvancedOOP.Lecture2_Inheritances.LabProblem4;
import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<String> {


    private Random random;

    public RandomArrayList (Random random) {
        this.random = random;
    }



    public String getRandomElement() {
        int rnd = random.nextInt(super.size());   // this.super - shte byde size-a na Array-q

        //dai mi proizvolen element on 0 do kr na masiva
        random.nextInt(this.size());    // this.size - shte byde nasledeniq size

        return this.get(rnd);
    }


}