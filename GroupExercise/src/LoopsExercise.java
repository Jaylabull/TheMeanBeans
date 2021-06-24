
public class LoopsExercise {

	public static void main(String[] args) {
		int i = 0;
		int[] num = new int[50];
		
		while(i < num.length) {
			num[i] = i;
			//System.out.println("first while " + num[i]);
			i++;
		}//end while
		
		i = 0;
		
		do {
			if((num[i] % 2) > 0 ) {
				num[i] += 5;				
			}// end if
			//System.out.println("odd numbers " + num[i]);
			i++;			
		}while(i < num.length); // while
		
		for(int n=0; n < num.length; n++) {
			if(((num[n] % 4) == 0) && ((num[n] % 6) == 0)){
				
				System.out.println("FOUR!!SIX!!!");
				
			}else if((num[n] % 4) == 0 ) {
				
				System.out.println("FOUR");			
			
			}else if((num[n] % 6) == 0) {
			
				System.out.println("SIX");
				
			}else {
				System.out.println(num[n]);
			} // end if
			
		} // end for
		
	} // end main

} // end LoopsExercise
