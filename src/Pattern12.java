import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 17-Jun-2019
*/
public class Pattern12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int space = n - 1;
		int star = 1;

		int row = 1;
		while (row <= n) {

			int csp = 1;
			while (csp <= space) {
				System.out.print("\t");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= star) {
				if(cst%2==0) {
					System.out.print("!\t");
				}
				else {
				System.out.print("*\t");
				}
				cst = cst + 1;
			}
			System.out.println();
			star = star + 2;
			space = space - 1;
			row = row + 1;
		}

	}

}
