package main;
import java.util.*;
import java.math.BigInteger;

public class fibonacci3473 {
	public static void main(String[] args) {
		BigInteger num;
		ArrayList<BigInteger> numList = new ArrayList<BigInteger>();
		
		for (int i = 0; i < 3473; i++) {
			if (i >= 2) {
				num = numList.get(i-1).add(numList.get(i-2));
				
						
				numList.add(num);
			}
			
			else {
				numList.add(new BigInteger("1"));
			}
			
		}
		System.out.println(numList.get(3472));
	}
}
