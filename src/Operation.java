import java.util.Random;


class Operation {
    private int correctResult;


    Operation() {
        this.correctResult = 0;
    }

    public void setCorrectResult(int r) {
        this.correctResult = r;
    }

    public int getCorrectResult() {
        return correctResult;
    }


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

    String question(int operator, int lvl) {

        Random rand = new Random(); //instance of random class
        int bound = 10;
        //generate random values from 0-9
        int a = rand.nextInt(bound);
        int b = rand.nextInt(bound);

        //System.out.println("Operation: " + a + " + " + b + " =");

        String question = "Nothing";


        switch (operator) {
            case 1:
                question = "Operation: " + a * lvl + " + " + b * lvl + " =";
                setCorrectResult(a * lvl + b * lvl);
                break;
            case 2:
                question = "Operation: " + a * lvl + " - " + b * lvl + " =";
                setCorrectResult(a * lvl - b * lvl);
                break;
            case 3:
                question = "Operation: " + a * lvl + " * " + b * lvl + " =";
                setCorrectResult((a * lvl) * (b * lvl));
                break;
            case 4:
                question = "Operation: " + (a * lvl) + " / " + (1 + b) + " =";
                setCorrectResult(Math.round((a * lvl) / (1 + b)));
                break;
        }

        return question;

    }
}
