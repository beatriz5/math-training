import java.util.Random;
import java.util.Scanner;

public class Addition {

    static boolean add() {

        Random rand = new Random(); //instance of random class
        int bound = 10;
        //generate random values from 0-9
        int a = rand.nextInt(bound);
        int b = rand.nextInt(bound);

        System.out.println("Operation: "+a+" + "+b+" =");

        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        scan.close();
        System.out.println("The number entered by user: "+answer);

        boolean result = false;

        if (answer == (a+b)){
            result = true;


        }


        return result;

    }
}
