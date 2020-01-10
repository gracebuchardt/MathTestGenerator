import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class MathMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random 1qu1=new Random();
		Random 1qu2=new Random();
		
		int diff = 0;
		//Difficulty.
		
			System.out.println("Difficulty?");
			System.out.println("\n1=easy (addition/subtraction)\n2=medium (multiplication/division) \n3=hard (powers/squaring)");
		diff=in.nextInt();

		
		//It should randomly generate 2 numbers, ask you to minus one from the other. 
		//Then, at the end, it uses said saved numbers (as variables) to calculate the correct answer.
		//It then checks to see if what you entered matches. 
		//If it does, it minuses from the total amount of questions (let's say 10 for now).
		//It then prints out your score (variable). And maybe a nice message.
		
			if (diff==1) {
				System.out.print("What is "+(1qu1.nextInt((25-1)+1)+1));
				System.out.println("+"+(1qu2.nextInt((25-1)+1)+1)+"?");
			}
			
			
			
			
			//Possible extension to add. Where you set the # of questions, and an array is used.\
			//An array should probably be ued for this entire code now that I think about it. Oops.
		//if (diff==1) {
			//String[] questions;
			//System.out.println("How many questions?");
			//int size=in.nextInt();
			//in.nextLine();
			//questions=new String[size];
			
			//for (int i = 0; i < questions.length; i++) {
				//System.out.println("Enter a name: ");
				//questions[i] = in.nextLine();
		//	}
			//for (int j = 0; j < questions.length; j++) {
				//System.out.println(questions[j]);
				
			//}
		}
		
	}



//base for array code is brought from previous copied "array tutorial".