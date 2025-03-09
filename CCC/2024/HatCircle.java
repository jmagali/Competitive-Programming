import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int people, counter = 0;
		
		//To get the number of people
		people = sc.nextInt();
		
		int[] hatNum = new int [people];
		
		for (int k = 0; k < people; k++)
			hatNum[k] = sc.nextInt();
		
		for (int i = 0; i < people / 2; i++) {
			if (hatNum[i] == hatNum[i + people / 2])
				counter += 2;
		}
		
		System.out.println(counter);
		
		sc.close(); // To close the scanner
	}

}
