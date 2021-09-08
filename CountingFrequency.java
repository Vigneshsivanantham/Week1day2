package week1.day2;

public class CountingFrequency {

	public static void main(String[] args) {
		
	
	int[] arr1 = {3,4,8,4,6,78,55,55,78,3,4,66,6,6,8,3,20,3};
	int[] fre = new int[arr1.length];
	
	int len = arr1.length;
	for(int i = 0; i < len; i++)
	{
		int  a = arr1[i];
		int count = 1;
		for (int j = i+1; j<len; j++)
		{
			if(a == arr1[j])
			{
			count++;
			fre[j] = -1;
			}
		}
	
		if(fre[i]!=-1)
		{
			fre[i] = count;
		}
	}
		for(int i = 0; i<len; i++)
		{
			if(fre[i] >= 1)
		
		System.out.println(arr1[i] + " Occures "+ fre[i]+ " times" );
		}
	}
	
}
