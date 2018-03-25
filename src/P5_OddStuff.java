/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 1.) I predict it will print the number four first and then will take four and divide it by two
// and then return the value.



public class P5_OddStuff {
    public static void main( String[] args ) {
        int number = 4;
        for( int count = 1; count <= number; count++ ) {
            System.out.println( number );
            number = number / 2;
        }
    }
}



// 3.) I was correct! Although I will be honest when I say that I thought twice about it
// because I was missing "count being the declared int.