package week2.task1;

public class Task1 {
	public static void main(String args[]) {
		// find UCLN 
		System.out.println("UCLN(1,0) = "+gcd(1,0));
		System.out.println("UCLN(50,30) = "+gcd(50,30));
		System.out.println("UCLN(0,0) = "+gcd(0,0));
		// find fibonacci
		System.out.println("fibonacci(0) = "+fibonacci(0));
		System.out.println("fibonacci(1) = "+fibonacci(1));
		System.out.println("fibonacci(40) = "+fibonacci(40));
	}
	public static int gcd(int a, int b) {
        if (a==0&&b==0) return -1;
        else if (a==0) return b;
        else if (b==0) return a;
        else {
        	while (a!=b) if (a>b) a=a-b; else b=b-a;
        	return a;
        }
    }

    public static int fibonacci(int n) {
    	if (n == 0) return 0;
    	else if (n == 1) return 1;
    	else {
    		int memory1 = 1, memory2 = 0,sum = 0;
    		for (int i=2;i<=n;i++) {
    			sum = memory1 + memory2;
    			memory2 = memory1;
    			memory1 = sum;
    		}
    		return sum;
    	}
    }
}
