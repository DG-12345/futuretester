package bugspotter;

public class dada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1221;
		int b=a;
		int rem;
		int rev=0;
           
		while (b!=0) {
			
		rem=b%10;
		rev=rev*10+rem;
		b=b/10;
		
		}
		
    if(a==rev) {
    	System.out.println(a+"is palindrome number");
    }
    else {
    	System.out.println(a+"is not palindrome number");
    }
	}

}
