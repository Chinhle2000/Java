import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SignupForm frame =new SignupForm();
        frame.setVisible(true);
        frame.setBounds(100,50,550,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(true);
    }
}
