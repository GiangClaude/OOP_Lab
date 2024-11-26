import javax.swing.JOptionPane;
public class Bai225{
	public static void main(String[] args){
		String strNum;
		strNum = JOptionPane.showInputDialog("Please enter first number:");
		double num1 = Double.parseDouble(strNum);
		strNum = JOptionPane.showInputDialog("Please enter second number:");
		double num2 = Double.parseDouble(strNum);
		
		JOptionPane.showMessageDialog(
			 null,"Sum: " + (num1 + num2) + "\nMinus: " + (num1 - num2) + "\nProduct: " + (num1*num2) + "\nQuotient: " + (num1/num2)
);
		System.exit(0);
	}
}