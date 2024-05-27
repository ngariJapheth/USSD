package japhie;

import java.util.Date;


public class primitives {

	public static void main(String[] args) {
		byte theByte= -128;
		short theShort= 32_000;
		int theInt=45;
		long theLong= 325_789_654_123L;
        float pi=3.14F;
		double doublePi=3.1415;
		char nameinitial='P';
		boolean isreference=false;
		Date now=new Date();
		String message="Hello world" +"!!";
		int[] intarray=new array[5];
		int [] numbers=new int[5];
		numbers[0] = 56;
		numbers[1] = 32;
		numbers[2] = 48;
		numbers[3] = 40;
		numbers[4] = 24;
		
		
	
		System.out.println(theByte);
		System.out.println(theShort);
		System.out.println(theInt);
		System.out.println(pi);
		System.out.println(doublePi);
		System.out.println(nameinitial);
		System.out.println(isreference);
		Reference r = new Reference();
		System.out.println(r.name.toUpperCase());
		System.out.println (new Date());
		System.out.println(message);
		System.out.println(message.toUpperCase());
		for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);}
		
		
	}

}


class Reference{
String name=new String("Japhie");

}

