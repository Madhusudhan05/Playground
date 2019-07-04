import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      if (n==89)
        System.out.println("A");
      else if(n==23)
        System.out.println("Fail");
      else
         System.out.println("Invalid");
	}
}