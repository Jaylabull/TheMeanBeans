package labs;

import java.util.Arrays;

public class LoopsLab {
	public static void main(String[] args) {
		int index = 0;
		int val = 1;
		int[] loop = new int[50];
		
		while (index < loop.length) {
			loop[index] = val;
			System.out.println(loop[index]);
			index++;
			val++;
		}		
		index = 0;
		
		do {
			int up = loop[index];
			if (up %2 == 1) {
				up = up + 5;
				loop[index] = up;
				}
			System.out.println(up);
			index++;
		} while (index < loop.length);

		index = 0;
		
		for (index = 0; index < loop.length; index++) {
			int up = loop[index];
			if (up % 4 == 0 && up % 6 == 0) {
				System.out.println("FOUR!!SIX!!!");
			}
			else if (up % 4 == 0) {
				System.out.println("FOUR!!");
			}
			else if (up % 6 == 0) {
				System.out.println("SIX!!!");
			}
			else {
				System.out.println(up);
			}
		}	
	}
}

