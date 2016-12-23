package Lab3InsertionSort;
import java.util.Scanner;
import java.util.Random;

/*Insertion Sort Using Doubly Linked List*/
/*Programmed by A-Shawni Mitchell, September 29, 2016 */
public class Lab3Fall16 {

	private static Scanner in;
	
	/* Main Method */
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		long startTimeInsertion=0;
		long endTimeInsertion=0;
		long totalTimeInsertion=0;
		
		System.out.println("******************WELCOME TO LAB 3 Question 1 **********************");
		System.out.println();
		
		System.out.println("Please enter the size double linked you want to build");
		int n = in.nextInt();
		
		//int[] list = new int[n];
		DoubleLinkedList ins = new DoubleLinkedList();
		Random rand = new Random();
		
		//ins.insertInEmptyList(rand.nextInt(500)+0);
		
		for(int i=0;i<n;i++){
			
			startTimeInsertion=System.nanoTime();
			ins.insert(rand.nextInt(500)+0);
			endTimeInsertion=System.nanoTime();
			totalTimeInsertion+=endTimeInsertion-startTimeInsertion;
		}
		
		ins.displayList();
		
		System.out.println();
		System.out.println("The size of the list is: "+ ins.getSize());
		System.out.println();
		System.out.println("The time taken to make sort is: "+(totalTimeInsertion/n));
	}

}
