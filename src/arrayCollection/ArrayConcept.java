package arrayCollection;

public class ArrayConcept {
	public static void main(String[] args) {

	int a[] = new int[10];
	
	a[0]=1;
	a[1]=1;
	a[2]=1;
	a[3]=1;
	a[4]=1;
	a[5]=1;
	a[6]=1;
	a[7]=1;
	a[8]=1;
	a[9]=1;
	
	
	for(int i=0;i<a.length;i++) 
	{
		System.out.println(a[i]);
		
	}

	for(int j:a) 
	{
		System.out.println(j);
	}
	
}
	
	
	
}