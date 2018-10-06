import java.util.Random;

public class checkpoint_module2 {
	public static void main(String[] args) {
		
	
//	Random Checkpoint
//	On paper, write code that does the following: 
//	1. Get a random whole number that is less than 1,000.
	
	
	
	Random Rand = new Random();
int i=	Rand.nextInt(1000);
	System.out.println(i);
//	2. Get another random whole number that is less than 900.
int x = Rand.nextInt(900);	
	System.out.println(x);
	
	
	
//	3. Print:
//	          a) What happens when you add the numbers , e.g. 99 + 64 = 163 
//	          b) What happens when you subtract the numbers , e.g. 99 ­ 64 = 35 
	System.out.println(i-x);
	System.out.println(i+x);
}
}
