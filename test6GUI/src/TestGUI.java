import javax.swing.*;

public class TestGUI {
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestGUI");
        frame.setContentPane(new TestGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
