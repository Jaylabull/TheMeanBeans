
public class LoopsExercise {

	public static void main(String[] args) {
		int i = 0;
		int[] num = new int[50];
		
		while(i <= num.length - 1) {
			num[i] = i;
			System.out.println("first while " + num[i]);
			i++;
		}//end while
		
		i = 0;
		
		do {
			if((num[i] % 2) > 0 ) {
				num[i] += 5;				
			}// end if
			System.out.println("odd numbers " + num[i]);
			i++;			
		}while(i <= num.length -1); // while
		
		for(int n=0; n <= num.length -1; n++) {
			if(((Integer.valueOf(num[n]) % 4) > 1) || ((Integer.valueOf(num[n]) % 6) > 1)){
				System.out.println("not a product of four or six " + Integer.valueOf(num[n]));
			}
		} // end for
		
	} // end main

} // end LoopsExercise
