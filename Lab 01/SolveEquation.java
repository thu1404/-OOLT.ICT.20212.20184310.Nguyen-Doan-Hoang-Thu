// Example 6: SolveEquation.java
import javax.swing.JOptionPane;
public class SolveEquation{
    public static void main(String[] args){
        String choice;
        choice = JOptionPane.showInputDialog(null,"Choose equation to solve: \n 1.First-degree equation with one variable ( a*x + b = 0 ) \n 2.First-degree equation with two variables ( a11 * x1 + a12 * x2 = b1 and a21 * x1 + a22 * x2 = b2 ) \n 3.Second-degree equation with one variable ( a*x*x + b*x +c = 0 and a!=0)","Menu",JOptionPane.INFORMATION_MESSAGE);
        double ch = Double.parseDouble(choice);

        if(ch==1){
            String strNum1,strNum2;

            strNum1 = JOptionPane.showInputDialog(null,"Please input a : ","Input a",
            JOptionPane.INFORMATION_MESSAGE);

            strNum2 = JOptionPane.showInputDialog(null,"Please input b : ","Input b",
            JOptionPane.INFORMATION_MESSAGE);

            double num1 = Double.parseDouble(strNum1);
            double num2 = Double.parseDouble(strNum2);
            double result;
            result = 0 - num1/num2;
            JOptionPane.showMessageDialog(null,"x = " + result, null, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        if(ch==2){
            String strNum11,strNum12,strNum21,strNum22,strSum1,strSum2;

            strNum11 = JOptionPane.showInputDialog(null,"Please input a11 : ","Input a11",
            JOptionPane.INFORMATION_MESSAGE);

            strNum12 = JOptionPane.showInputDialog(null,"Please input a12 : ","Input a12",
            JOptionPane.INFORMATION_MESSAGE);

            strSum1 = JOptionPane.showInputDialog(null,"Please input b1 : ","Input b1",
            JOptionPane.INFORMATION_MESSAGE);

            strNum21 = JOptionPane.showInputDialog(null,"Please input a21 : ","Input a21",
            JOptionPane.INFORMATION_MESSAGE);

            strNum22 = JOptionPane.showInputDialog(null,"Please input a22 : ","Input a22",
            JOptionPane.INFORMATION_MESSAGE);

            strSum2 = JOptionPane.showInputDialog(null,"Please input b2 : ","Input b2",
            JOptionPane.INFORMATION_MESSAGE);

            double num11 = Double.parseDouble(strNum11);
            double num12 = Double.parseDouble(strNum12);
            double num21 = Double.parseDouble(strNum21);
            double num22 = Double.parseDouble(strNum22);
            double sum1 = Double.parseDouble(strSum1);
            double sum2 = Double.parseDouble(strSum2);

            double d,d1,d2;
            d = num11 * num22 - num21 * num12;
            d1 = sum1 * num22 - sum2 * num12;
            d2 = num11 * sum2 - num21 * sum1;

            if(d==0){
                if(d1==0 && d2==0){
                    JOptionPane.showMessageDialog(null,"The system has infinitely many solutions.", "result", JOptionPane.INFORMATION_MESSAGE);
                }
                else{JOptionPane.showMessageDialog(null,"the system has no solution.", "result", JOptionPane.INFORMATION_MESSAGE);}
            }
            else{
                JOptionPane.showMessageDialog(null,"x1 = " + d1/d + "\nx2 = " + d2/d, "result", JOptionPane.INFORMATION_MESSAGE);
            }
           // JOptionPane.showMessageDialog(null,"x = " + result, null, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        if(ch==3){
            String strNum1,strNum2,strNum3;

            strNum1 = JOptionPane.showInputDialog(null,"Please input a : ","Input a",
            JOptionPane.INFORMATION_MESSAGE);

            strNum2 = JOptionPane.showInputDialog(null,"Please input b : ","Input b",
            JOptionPane.INFORMATION_MESSAGE);

            strNum3 = JOptionPane.showInputDialog(null,"Please input c : ","Input c",
            JOptionPane.INFORMATION_MESSAGE);

            double a = Double.parseDouble(strNum1);
            double b = Double.parseDouble(strNum2);
            double c = Double.parseDouble(strNum3);

            if(a==0){System.exit(0);}

            double delta;
            delta = b*b - 4*a*c;

            if(delta==0){
                JOptionPane.showMessageDialog(null,"the equation has double root : " + ( -b / (2*a) ) ,null, JOptionPane.INFORMATION_MESSAGE);
            }
            if(delta > 0){
                JOptionPane.showMessageDialog(null,"the equation has two distinct roots : " + "\nx1 = " +  ( (-b + Math.sqrt(delta)) / (2*a) )   + "\nx2 = " + ( (-b - Math.sqrt(delta)) / (2*a) ) ,null, JOptionPane.INFORMATION_MESSAGE);
            }
            if(delta < 0){
                JOptionPane.showMessageDialog(null,"the equation has no solution. " ,null, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}