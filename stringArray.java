package main;
//Didn't have time to fully finish, n cannot be greater than 9//

import java.util.ArrayList;

public class stringArray {
	public static void main(String[] args) {
		
		//----------Input n below----------//
		int n = 7;
		//----------Input n above----------//
		
		
		ArrayList<String> numSplit = new ArrayList<String>();
		
		for (int indx = 0; indx < String.valueOf(n).length(); indx++) {
			for (int i = 0; i < n; i++) {
				
				if (i + 1 >= 1) {
					numSplit.add("ONE");
				}
				if (i + 1 >= 2) {
					numSplit.add("TWO");
				}
				if (i + 1 >= 3) {
					numSplit.add("THREE");
				}
				if (i + 1 >= 4) {
					numSplit.add("FOUR");
				}
				if (i + 1 >= 5) {
					numSplit.add("FIVE");
				}
				if (i + 1 >= 6) {
					numSplit.add("SIX");
				}
				if (i + 1 >= 7) {
					numSplit.add("SEVEN");
				}
				if (i + 1 >= 8) {
					numSplit.add("EIGHT");
				}
				if (i + 1 >= 9) {
					numSplit.add("NINE");
				}
				
			}
			
		}
		
		
		System.out.println(numSplit);
		
	}
}
