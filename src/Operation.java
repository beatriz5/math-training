import java.util.Random;


class Operation {
    private int correctResult;
    private int operation;
    private int level;


    Operation() {
        this.correctResult = 0;
        this.operation = 1;
        this.level = 1;
    }

    void setCorrectResult(int r) {
        this.correctResult = r;
    }

    int getCorrectResult() {
        return correctResult;
    }

    void setOperation(int r) {
        this.operation = r;
    }

    int getOperation() {
        return operation;
    }

    void setLevel(int r) {
        this.level = r;
    }

    int getLevel() {
        return level;
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

    String question() {

        Random rand = new Random(); //instance of random class
        int bound = 10;
        //generate random values from 0-9
        int a = rand.nextInt(bound);
        int b = rand.nextInt(bound);

        //System.out.println("Operation: " + a + " + " + b + " =");

        String question = "Nothing";


        switch (operation) {
            case 1:
                question = "" + a * level + " + " + b * level + " =";
                setCorrectResult(a * level + b * level);
                break;
            case 2:
                question = "" + a * level + " - " + b * level + " =";
                setCorrectResult(a * level - b * level);
                break;
            case 3:
                question = "" + a * level + " * " + b * level + " =";
                setCorrectResult((a * level) * (b * level));
                break;
            case 4:
                question = "" + (a * level) + " / " + (1 + b) + " =";
                setCorrectResult(Math.round((a * level) / (1 + (b * level))));
                break;
        }

        return question;

    }
}
