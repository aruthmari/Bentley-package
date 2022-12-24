package com.bentley.system;

public class StringBoolean {

	public static void main(String[] args) {
		String S = "aaabb";
		int bInd = S.indexOf('b');
		int aInd = S.lastIndexOf('a');
		if(aInd > bInd && aInd >=0 && bInd >=0) 
			System.out.println("false");
		else
			System.out.println("true");
	}

}
