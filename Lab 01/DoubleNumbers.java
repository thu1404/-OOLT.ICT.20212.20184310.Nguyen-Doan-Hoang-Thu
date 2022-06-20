// Example 5: DoubleNumbers.java
import javax.swing.JOptionPane;
public class DoubleNumbers{
    public static void main(String[] args){
        String strNum1,strNum2;

        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",
        JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",
        JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum,difference,product,quotient;
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;

        if(num2!=0) { 
            quotient = num1 / num2; 
            JOptionPane.showMessageDialog(null," Sum : " + sum + "\n Difference : " + difference  + "\n Product : " + product + "\n Quotient : " + quotient,"Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
         else{
             JOptionPane.showMessageDialog(null," Sum : " + sum + "\n Difference : " + difference  + "\n Product : " + product + "\n Quotient : Can't calculate ( the second number = 0 ) ","Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }      
    }
}