package ChapterThree;

import javax.swing.*;

public class NameDialog {
    public static void main(String... args) {
        String name = JOptionPane.showInputDialog("");
        String message =
                String.format("Welcome, %s, to Java Programming!", name);
    }
}
