import java.util.Scanner;
 
public class TowersOfHanoi {
 
	public void solveTowersOfHanoi(int n, String sourcePeg, String middlePeg, String lastPeg)
	{
		// If only 1 disk, make the move and return.
		if(n==1)
		{
			System.out.println(sourcePeg+" --> "+lastPeg);
			return;
		}
		
		// Move top n-1 disks from A to B using C as middlePegiliary.
		solveTowersOfHanoi(n-1, sourcePeg, lastPeg, middlePeg);
		
		//Move remaining disks from A to C
		System.out.println(sourcePeg+" --> "+lastPeg);
		
		// Move n-1 disks from B to C using A as middlePegiliary
		solveTowersOfHanoi(n-1, middlePeg, sourcePeg, lastPeg);
		
	}
	
	public static void main(String args[])
	{
		TowersOfHanoi obj = new TowersOfHanoi();
		
		System.out.println("Enter number of disks :- ");
	    
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println("Move disks in order following the directions below.");
		obj.solveTowersOfHanoi(n, "A", "B", "C");
		
	}	
}