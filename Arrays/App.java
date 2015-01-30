package Arrays;

public class App {

	public static void main(String[] args) {
		int[] n = {1,2,4,5,6,7,8};
		int[] m = new int[4];
		ArrayCopier ar = new ArrayCopier(n, m);
		ar.run();
		ar.printResult();
		

	}

}
