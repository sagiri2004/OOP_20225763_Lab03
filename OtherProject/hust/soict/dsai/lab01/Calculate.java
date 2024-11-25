// Calculate.java
// 2.2.5

import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2, sum, difference, product, average;

        strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        average = (num1 + num2) / 2;

        JOptionPane.showMessageDialog(null, "sum: " + sum + "\n" +
                "difference: " + difference + "\n" +
                "product" + product + "\n" +
                "average" + average, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
