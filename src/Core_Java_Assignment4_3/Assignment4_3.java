package Core_Java_Assignment4_3;

public class Assignment4_3 {

																										
		public static void main(String[] args) {																						
			System.out.println("\nThe Below Program will display the use of final keyword with class, "									
					+ "with a variable, with the method and with the constructor\n");
			 Square square = new Square(5,5);																							
	         Rectangle rectangle = new Rectangle(5,7);																					
	         Circle circle = new Circle(2);																								
	         Color color = new Color("DEFAULT");																						
	         System.out.println("Area of square : " + square.area());																	
	         System.out.println("Area of rectangle : " + rectangle.area());																
	         System.out.println("Area of circle : " + circle.area());																	
	         System.out.println("As the Value of Pi is constant. It is declared as Final Variable in Shape Class"+						
	        		 			"\nAnd area() is taken as a final method in Square, Retangle and Circle Classes"+
	        		             "\n\nWhen a class is inherited, the subclass inherits the methods and variables of super class but not constructors."+ 
	                             "\nFor this reason, constructors are not members of class; only variables and methods are members of a class." +
	                             "\nfinal is used by super class not to inherit its members by subclass as done in Square, Retangle and Circle Classes"+
	                             "\nA constructor cannot be final as it is never inherited.");
	      }																																
	}																																	