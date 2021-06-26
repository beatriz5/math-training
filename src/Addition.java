import java.util.Random;


class Addition {

    static int add() {

        Random rand = new Random(); //instance of random class
        int bound = 10;
        //generate random values from 0-9
        int a = rand.nextInt(bound);
        int b = rand.nextInt(bound);

        System.out.println("Operation: " + a + " + " + b + " =");


        return a + b;

    }

    static boolean addVerify(int answer, int result) {
        return (answer == result);

    }
}
