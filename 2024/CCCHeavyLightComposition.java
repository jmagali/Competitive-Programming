package twentyTwentyFour;

import java.util.Scanner;

public class HeavyLightComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int lines, letters;

		lines = sc.nextInt();
		letters = sc.nextInt();
		
		String[] words = new String [lines];
		
		for (int i = 0; i < lines; i++)
			words[i] = sc.next();
		
		for (int j = 0; j < lines; j++) {
			
			boolean check = true;
			int[] counter = new int[26];
			boolean[] weight = new boolean[26];
			
			for (char c : words[j].toCharArray()) {
				counter[c - 'a']++;
				
				if (counter[c - 'a'] >= 2)
					weight[c - 'a'] = false;
				else
					weight[c - 'a'] = true;
			}
			
			for (int h = 1; h < letters; h++) {
				if (weight[words[j].charAt(h) - 'a'] == weight[words[j].charAt(h - 1) - 'a']) {
					System.out.println ("F");
					check = false;
					break;
				}
			}
			
			if (check)
				System.out.println ("T");
		
		}
		
		sc.close(); // To close the scanner
	}

}
