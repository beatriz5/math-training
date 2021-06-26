import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Math Training");

        int correctAnswer;
        int answer;

        boolean right = true;
        while (right) {
            System.out.println("\n");

            correctAnswer = Addition.add();
            answer = scan.nextInt();
            right = Addition.addVerify(answer, correctAnswer);

        }

        scan.close();

    }
}
