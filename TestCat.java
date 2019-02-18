package course;

import java.util.Scanner;

class TestCat {
	public static void main(String args[]) {	
		Cat co = new Cat();		
		Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter your cat's name:");
		co.setName(input.nextLine());
		
		System.out.println("Enter your cat's breed:");
		co.setBreed(input.nextLine());
		
		System.out.println("How old is your cat?");
		co.setAge(input.nextInt());			
		
		System.out.println(co.toString());
		
		co.eat();
		co.says();
	}
}