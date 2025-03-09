import java.util.Scanner;

public class GoodFoursAndGoodFives {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variable declaration
		int target, arrangements = 0;
		
		//To get the target number
		target = sc.nextInt();
		
		//To iterate through all possible a values
        for (int a = 0; a <= target / 4; a++) {
        	if ((target - a * 4) % 5 == 0)
        		arrangements++;
        }
		
		System.out.println (arrangements);
		sc.close();

	}

}
