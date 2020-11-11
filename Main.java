package D_JavaAdvancedOOP.Lecture2_Inheritances.LabProblem4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        RandomArrayList randomArrayList = new RandomArrayList(new Random());

        randomArrayList.add("Alice");
        randomArrayList.add("Bob");
        RandomArrayListComposition calc = new RandomArrayListComposition();

        randomArrayList.add("Alice");
        randomArrayList.add("Bob");


        calc.add("Alice");
        calc.add("Bob");
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());

    }
}
