package matrix;

public class App {

	public static void main(String[] args) {

		
//		Matrix mx = new Matrix(3,4);
//		mx.setRow(2, "2,22,222,222");
//		mx.setColumn(3, "3,33,333");
//		
//		mx.prettyPrint();
//		
//		System.out.println(mx.toString());
		Matrix mx = new Matrix();
		mx.setMatrix("1,2,3;11,22,33;111,222,333");
		mx.prettyPrint();
		
		
	}

}
