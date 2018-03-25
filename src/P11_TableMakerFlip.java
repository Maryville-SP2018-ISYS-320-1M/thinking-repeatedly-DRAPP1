/*
  	ISYS 320
  	Name(s): Dave Rapp
  	Date: 3/20/18
*/

public class P11_TableMakerFlip {

	public static void main(String[] args) {
		for( int rowNumber = 5; rowNumber <= 10; rowNumber++ ) {
			for( int columnNumber = 1; columnNumber <= 10; columnNumber++) {
				System.out.print( (rowNumber * columnNumber ) + "\t");
			}
			System.out.println();
		}
	}

}









