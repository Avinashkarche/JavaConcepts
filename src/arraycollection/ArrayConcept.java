package arraycollection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayConcept {
	public static void main(String[] args) {

//	int a1[] = new int[10];            //Declare with New Keyword
//	
//	a1[0]=1;
//	a1[1]=1;
//	a1[2]=1;
//	a1[3]=1;
//	a1[4]=1;
//	a1[5]=1;
//	a1[6]=1;
//	a1[7]=1;
//	a1[8]=1;
//	a1[9]=1;

		int a[] = { 1, 2, 3, 4, 5 }; // Declare with Without New Keyword

		int a2[] = { 10, 20, 30 };

		for (int i = 0; i < a.length; i++)

		{
			System.out.println(a[i]);

		}

//		for (int j : a) {
//			System.out.println(j);
//		}

		// Array Methods
		int length = a.length;
		System.out.println(length);

		System.out.println(Array.get(a, 0)); // return the value depends on index

		Array.set(a, 0, 100); // ForSet Any value depends on Index

		System.out.println(a[0]);
		System.out.println(a.equals(a2)); // Will compare ref Location of an Array

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++)

		{
			System.out.println(a[i]);

		}

	}

}