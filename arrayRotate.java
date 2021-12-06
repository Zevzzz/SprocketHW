package main;
import java.lang.Math;
import java.lang.System.*;
import java.util.Arrays;

public class arrayRotate {
	public static void main(String[] args) {
		
		//----------INPUT ARRAY & n BELOW----------//
		long[] array = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L};
		int n = 2;
		//----------INPUT ARRAY & n ABOVE----------//
		
		long[] tempArray = new long[array.length];
		
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		
		for(int i = 0; i >= -n+1; i--) {
			array[n+i-1] = array[array.length+i-1];
		}
		
		for (int i = 0; i < array.length - n; i++) {
			array[n+i] = tempArray[i];
			
		}
		
		System.out.println(Arrays.toString(array));

		
	}
}
