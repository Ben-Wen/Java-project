import javax.swing.JOptionPane;
/**
 * This program converts the temperature to Fahrenheit if Celsius is entered, or to Celsius if Fahrenheit is entered by using JOptionPane.
 * @author wenjiawei
 * Homework project 2 for Chapter 3.
 * Last Changed: June 4, 2019.
 */
public class temperature2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temp;
		
		String tempString = JOptionPane.showInputDialog (								//显示对话框，上面显示一行文字并且下面有一个填空格
				 "Please enter the numerical temperature.");			
		String unitString = JOptionPane.showInputDialog (								//显示第二个对话框，上面显示一行文字并且下面有一个填空格
				 "Then enter the unit of the temperature in C or F.");
		temp = Float.parseFloat(tempString);											//填空格内填入的字默认是String，此行将填入的数字转为Float
		
		if (unitString.equalsIgnoreCase ("C")) {
					temp = (9*(temp)/5 + 32);
					JOptionPane.showMessageDialog (null, 
			                "You are changing from degrees celsius to degrees fahrenheit, result is " + temp + " degrees fahrenheit.");
						  	System.exit(0);
		}				
		else if (unitString.equalsIgnoreCase ("F")) {
					temp = 5*(temp - 32)/9;
					JOptionPane.showMessageDialog (null, 
			                "You are changing from degrees fahrenheit to degrees celsius, result is " + temp + " degrees celsius.");
						  	System.exit(0);
		}
		 	 else 
					JOptionPane.showMessageDialog (null, "" + 
	                "The unit you put in is not correct.");
				  	System.exit(0);
		
	}

}
