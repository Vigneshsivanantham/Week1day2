package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int v1 = 10001;
		int v2 = v1;
	    int rem = 0;
	   
	    while(v1>0)
	    {
	    	rem = (rem*10) + v1%10;
	    	v1 = v1 / 10;
	    
	    }
	    System.out.println(rem);
	    if(v2 == rem)
	    {
	    	System.out.println("Pallindrome:" +rem);
	    }
	    else {
	    	System.out.println("Not a pallindrome:" +rem);
	    }
	}

}
