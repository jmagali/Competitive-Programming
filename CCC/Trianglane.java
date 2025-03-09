package twentyTwentyThree;

import java.util.Scanner;

public class Trianglane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int columns = sc.nextInt(), length = 0;
		
		int[] rowOne = new int [columns];
		int[] rowTwo = new int [columns];
		
		for (int i = 0; i < columns; i++) {
			rowOne[i] = sc.nextInt();
		}
		
		for (int k = 0; k < columns; k++) {
			rowTwo[k] = sc.nextInt();
		}
		
		for (int h = 0; h < columns; h++) {
			if (rowOne[h] == 1)
				length += 3;
			if (rowTwo[h] == 1)
				length += 3;
		}
		
		for (int j = 0; j < columns; j++) {
			
			if (rowOne[j] == 1 && j < columns - 1 && rowOne[j] == rowOne[j + 1])
				length -= 2;
			
			if (rowOne[j] == 1 && rowOne[j] == rowTwo[j])
				length -= 2;
		}
		
		System.out.print (length);
		
		sc.close(); //To close the scanner
	}

}
