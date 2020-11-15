/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.*;//Java packages
import javax.swing.*;

    
public class Calculator extends JFrame{
    JButton[]numbers =new JButton[10];//declaring an array for the number buttons 
    
    JButton plus;//declaration of the operand buttons
    JButton minus;
    JButton mult;
    JButton div;
    JButton equals;
    JButton dot;
    JTextField output;//declaration of the input and output text fields
    JTextField operand1;
    JTextField operand2;


public Calculator()
 { super("My Calculator");//name of the GUI window
 numbers = new JButton[10]; 
for(int i = 0; i < 10; i++) //initializing the number buttons within the array
numbers[i] = new JButton("" + i);
plus = new JButton("+");//initializing the operand buttons
minus = new JButton("-"); 
mult = new JButton("x"); 
div = new JButton("/");
equals = new JButton("="); 
dot = new JButton("."); 
operand1 = new JTextField(10); //
operand2 = new JTextField(10);
output = new JTextField(21);

//setSize(300,400);
//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 

JPanel top = new JPanel();
top.setLayout(new GridLayout(2,1));
add(top, BorderLayout.NORTH);
 
JPanel input = new JPanel();
input.add(operand1);
input.add(operand2);
top.add(input);

JPanel results = new JPanel(); 
results.add(output);
top.add(results);

JPanel center = new JPanel();
center.setLayout(new GridLayout(4,1));
center.add(getRow(numbers[7], numbers[8], numbers[9], plus));
center.add(getRow(numbers[4], numbers[5], numbers[6], minus));
center.add(getRow(numbers[1], numbers[2], numbers[3], mult));
center.add(getRow(dot, numbers[0], equals, div));
add(center);

{setSize(225,300);
operand1 = new JTextField(7);
operand2 = new JTextField(7);
output = new JTextField(15);
}

 }
private JPanel 
getRow(JButton b1, JButton b2, JButton b3, JButton b4)
{
	JPanel row = new JPanel();
	row.setLayout(new BoxLayout(row,BoxLayout.X_AXIS));
	row.add(b1);
	row.add(b2);
	row.add(b3);
	row.add(b4);
	return row;
}


private JPanel 
    getRow(JButton b1, JButton b2, JButton b3, JButton b4, Box Glue)
{
	JPanel row = new JPanel();
	row.setLayout(new
	BoxLayout(row,BoxLayout.X_AXIS));
	row.add(Box.createHorizontalGlue());
	row.add(b1);row.add(b2);row.add(b3);row.add(b4);
	row.add(Box.createHorizontalGlue());
	return row;


}





public static void main(String[] args) {

Calculator calc=new Calculator();
 calc.setVisible(true);

}
}

