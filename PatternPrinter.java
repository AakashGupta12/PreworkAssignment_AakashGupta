import java.util.Scanner;

class PatternPrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in .nextInt();
		patternPrinter(n);
	}

	static void patternPrinter(int n) {
		// write your code here
		for(int i=n;i>0;i--){//n lines
			for(int j=n;j>0;j--){//on each line n to 1 needs to be printed
				for(int k=i;k>0;k--)//each j needs to be repeated i times
					System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}