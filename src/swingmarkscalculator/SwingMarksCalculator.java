package swingmarkscalculator;

import javax.swing.*;

public class SwingMarksCalculator {

    public static void main(String[] args) {
        String temp;
        temp = JOptionPane.showInputDialog(null, "Mathamatics Marks");
        float a = Float.parseFloat(temp);
        temp = JOptionPane.showInputDialog(null, "Science Marks");
        float b = Float.parseFloat(temp);
        temp = JOptionPane.showInputDialog(null, "Sinhala Marks");
        float c = Float.parseFloat(temp);
        temp = JOptionPane.showInputDialog(null, "History Marks");
        float d = Float.parseFloat(temp);
        temp = JOptionPane.showInputDialog(null, "English Marks");
        float e = Float.parseFloat(temp);
        JOptionPane.showMessageDialog(null, ("Total is : " + (a + b + c + d + e))
                + ("\nAverage is : " + (a + b + c + d + e) / 5));
    }
}
