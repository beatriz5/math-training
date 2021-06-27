import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.border.*;


public class MathTraining extends JFrame {
    Operation operation;


    //CREATING ALL OBJECTS
    //radio buttons
    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7;
    ButtonGroup typeGroup = new ButtonGroup();
    ButtonGroup levelGroup = new ButtonGroup();

    //labels
    JLabel questionLabel = new JLabel("Question:");
    JLabel answerLabel = new JLabel("Answer:");
    JLabel shownLabel = new JLabel("Question will be shown :");
    JLabel countLabel = new JLabel("Correct count be shown");
    JLabel toLabel = new JLabel(" to ");
    JLabel correctAnswer = new JLabel("0");
    JLabel wrongAnswer = new JLabel("0");

    //textfields
    JTextField input = new JTextField(50);

    //jbuttons
    JButton startButton = new JButton("Start");
    JButton stopButton = new JButton("Stop");

    //variables
    int num1, num2, operator, interval;
    int correctCount, wrongCount = 0;
    double result;
    String question;

    //invisible panel of selecting intervals
    JPanel panel4 = new JPanel();

    //New Frame objects
    JPanel panel6 = new JPanel();
    JPanel panel61 = new JPanel();
    JPanel panel62 = new JPanel();

    //ours design elements
  /*this.createdFont = false;
        this.fontSerializedDataVersion = 1;
        this.name = var1 != null ? var1 : "Default";
        this.style = (var2 & -4) == 0 ? var2 : 0;
        this.size = var3;
        this.pointSize = (float)var3;*/
    Font font = new Font("Verdana", Font.BOLD, 50);
    Color backgroundOfPanel4 = new Color(73, 175, 205);
    Color backgroundOfPanel61 = new Color(64, 173, 95);
    Color backgroundOfPanel62 = new Color(212, 42, 42);

    //creating new frame
    JFrame gameOver = new JFrame();


    public MathTraining(Operation op) {
        //frame layout

        this.operation = op;


        setLayout(new BorderLayout());
        Font font = new Font("Verdana", Font.BOLD, 24);
        setFont(font);

        //creating panels
        JPanel panel1 = new JPanel(); // types + levels
        JPanel panel11 = new JPanel(); // types
        JPanel panel12 = new JPanel(); // levels
        JPanel panel2 = new JPanel(); //  question + answer + label of input + input + start & stop buttons
        JPanel panel21 = new JPanel(); // question + answer
        JPanel panel211 = new JPanel(); // question
        JPanel panel212 = new JPanel();  // answer
        JPanel panel22 = new JPanel();  // label of input + input
        JPanel panel23 = new JPanel();  // start & stop button
        JPanel panel3 = new JPanel(); // correct count + time spent
        JPanel panel31 = new JPanel();  // correct count
        JPanel panel32 = new JPanel();  // time spent
        //we create panel4 outside of constructor
        JPanel panel5 = new JPanel(); //invisible panel4 + panel2

        //setting panel4 to invisible
        panel4.setVisible(false);

        //adding borders to panels
        panel11.setBorder(new TitledBorder("Choose a type"));
        panel12.setBorder(new TitledBorder("Choose a level"));
        panel31.setBorder(new TitledBorder("Correct Count"));

        //designing titles, panel backgrounds and font colors

        TitledBorder titledBorder = new TitledBorder(
                "Choose a level"); // the object named "title" is created
        titledBorder.setTitleColor(Color.BLUE); // the color is added to the object "title".
        panel4.setBorder(titledBorder); // titled border is set to panel4.

        panel4.setBackground(backgroundOfPanel4);
        toLabel.setForeground(Color.white);

        //layouts (the others are flow layout by default)
        panel1.setLayout(new GridLayout(1, 2));
        panel11.setLayout(new GridLayout(4, 1));
        panel12.setLayout(new GridLayout(4, 1));
        panel2.setLayout(new GridLayout(3, 1));
        panel21.setLayout(new GridLayout(1, 2));
        panel211
                .setLayout(new FlowLayout(FlowLayout.LEFT));
        panel212
                .setLayout(new FlowLayout(FlowLayout.LEFT));
        panel3.setLayout(new GridLayout(1, 2));
        panel5.setLayout(new BorderLayout());

        //defining objects
        radioButton1 = new JRadioButton("Add");
        radioButton2 = new JRadioButton("Subtract");
        radioButton3 = new JRadioButton("Multiply");
        radioButton4 = new JRadioButton("Divide");

        radioButton5 = new JRadioButton("Starter");
        radioButton6 = new JRadioButton("Intermediate");
        radioButton7 = new JRadioButton("Advanced");

        //adding objects to group
        typeGroup.add(radioButton1);
        typeGroup.add(radioButton2);
        typeGroup.add(radioButton3);
        typeGroup.add(radioButton4);

        levelGroup.add(radioButton5);
        levelGroup.add(radioButton6);
        levelGroup.add(radioButton7);

        //adding objects to panel
        panel11.add(radioButton1);
        panel11.add(radioButton2);
        panel11.add(radioButton3);
        panel11.add(radioButton4);
        panel12.add(radioButton5);
        panel12.add(radioButton6);
        panel12.add(radioButton7);

        panel211.add(questionLabel);
        panel212.add(answerLabel);

        panel22.add(shownLabel);
        panel22.add(input);
        panel23.add(startButton);
        panel23.add(stopButton);

        panel31.add(countLabel);

        //adding nested panels
        panel1.add(panel11);
        panel1.add(panel12);

        panel21.add(panel211);
        panel21.add(panel212);
        panel2.add(panel21);
        panel2.add(panel22);
        panel2.add(panel23);

        panel3.add(panel31);
        panel3.add(panel32);

        panel5.add(panel4, BorderLayout.NORTH);
        panel5.add(panel2, BorderLayout.SOUTH);

        //adding panel to frame
        add(panel1, BorderLayout.NORTH);
        add(panel5, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

        //START OF NEW FRAME
        //designing new frame (colors, font, etc...)
        correctAnswer.setFont(font);
        correctAnswer.setForeground(Color.white);
        wrongAnswer.setFont(font);
        wrongAnswer.setForeground(Color.white);
        panel61.setBackground(backgroundOfPanel61);
        panel62.setBackground(backgroundOfPanel62);

        //titled borders of new frame
        TitledBorder titledBorder2 = new TitledBorder("Correct Answer");
        titledBorder2.setTitleColor(Color.WHITE);
        panel61.setBorder(titledBorder2);

        TitledBorder titledBorder3 = new TitledBorder("Wrong Answer");
        titledBorder3.setTitleColor(Color.WHITE);
        panel62.setBorder(titledBorder3);

        //layout of new frame's panel
        panel6.setLayout(new GridLayout(1, 2, 10, 10));

        //adding objects to panel and panel to frame
        panel61.add(correctAnswer);
        panel62.add(wrongAnswer);
        panel6.add(panel61);
        panel6.add(panel62);
        gameOver.add(panel6);

        //frame settings
        gameOver.setTitle("Game Over");
        gameOver.setVisible(false);
        gameOver.setSize(500, 150);
        gameOver.setLocationRelativeTo(null);
        //END OF NEW FRAME

        //Register a listener for the radio buttons.
        radioButton1.addActionListener(new addListener());
        radioButton2.addActionListener(new subListener());
        radioButton3.addActionListener(new multipyListener());
        radioButton4.addActionListener(new divideListener());
        radioButton5.addActionListener(new starterListener());
        radioButton6.addActionListener(new intermediateListener());
        radioButton7.addActionListener(new advancedListener());

        input.addKeyListener(new enterListener());
        startButton.addActionListener(new startListener());
        stopButton.addActionListener(new stopListener());

    }


    class starterListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            interval = 1; // for generating random numbers after first progress is completed
        }
    }

    class intermediateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            interval = 11; // for generating random numbers after first progress is completed
        }
    }

    class advancedListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            interval = 35; // for generating random numbers after first progress is completed
        }
    }

    class addListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            operator = 1;  // for generating formula to calculate correct answer
        }
    }

    class subListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            operator = 2;  // for generating formula to calculate correct answer
        }
    }

    class multipyListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            operator = 3;  // for generating formula to calculate correct answer
        }
    }

    class divideListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            operator = 4;  // for generating formula to calculate correct answer
        }
    }

    class startListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            shownLabel.setText(operation.question(operator, interval)); // changing question label

            // clearing counts after re-play
            correctCount = 0;
            wrongCount = 0;
            countLabel.setText("Correct count be shown");

        }

    }

    // implements key listener because of reading action of enter from keyboard
    class enterListener implements KeyListener {

        public void keyPressed(KeyEvent e) {

            // checking enter action
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                double doubleOfInput = Double.parseDouble(input.getText()); // getting string to double

                // checking answer is correct or wrong
                if (doubleOfInput == operation.getCorrectResult()) {
                    correctCount++; // increasing counter
                } else {
                    wrongCount++; // increasing wrong counter
                }
                String stringCount = Integer.toString(correctCount); // getting integer to string
                String total = Integer.toString(correctCount + wrongCount);
                countLabel.setText(stringCount + "/" + total);

                input.setText(""); // clearing input after user entered answer
                shownLabel.setText(operation.question(operator, interval));//setting new question

            }
        }

        // implementation
        //other method1 for key release
        public void keyReleased(KeyEvent e) {
        }

        //other method2 for key entered
        public void keyTyped(KeyEvent e) {
        }
    }

    //after user press stop button
    class stopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            correctAnswer.setText("" + correctCount); // showing correct for both jframes
            wrongAnswer.setText("" + wrongCount);// showing correct for new jframes

            input.setText(""); // clearing input after user pressed stop button
            shownLabel
                    .setText("Question will be shown here when started :"); // clearing label after user pressed stop button
            gameOver.setVisible(true); //showing game over frame

        }

    }

    public static void main(String[] args) {

        Operation op = new Operation();
        final MathTraining frame = new MathTraining(op);

        Font font = new Font("Verdana", Font.BOLD, 24);
        frame.setFont(font);

        frame.pack();
        frame.setTitle("Math Training");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
