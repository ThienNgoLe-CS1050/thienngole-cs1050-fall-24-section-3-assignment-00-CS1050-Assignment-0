import javax.swing.JOptionPane;

public class Karl_Luppold_Assignment2 {

	public static void main(String[] args) {
		// Designate my Variables
		String firstName;
		char  middleInitial;
		String lastName;
		int age;
		double grossAnnualPay , taxRate , netAnnualPay;
		 
		//obtain and read in user input to put into our variables
		
		firstName = JOptionPane.showInputDialog("What Is your First Name?");
		middleInitial = JOptionPane.showInputDialog("What is your Middle Initial").charAt(0);
		lastName = 	JOptionPane.showInputDialog("What is your Last Name?");	
		age = Integer.parseInt(JOptionPane.showInputDialog("What's your Age?"));
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("What is your Gross Annual Pay?"));
		taxRate = Double.parseDouble(JOptionPane.showInputDialog("What is the Tax Rate?"));
		
		
		// Process user input data 
		
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		// Display the output 
		
		System.out.println("Hello " + firstName+ " " + middleInitial+ ". " +lastName);
		System.out.println("you are " + age + " years old now");
		System.out.println("It is amazing that you made " + (int)grossAnnualPay + " this year");
		System.out.println("With the tax rate of " + taxRate + " you can take home " + (int)netAnnualPay);
		
		
		
		

	}

}
