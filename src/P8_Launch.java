/*
  	ISYS 320
  	Name(s): Dave Rapp
  	Date: 3/20/18
*/

// 1.) My prediction is that the code will first print the text "T-minus" then using the
// increment decrease it will count down from 5 and then after it hits 1 will print the
// text "Blast off"



public class P8_Launch {
    public static void main( String[] args ) {
        System.out.println("T-minus ");
        for( int i = 5; i >= 1; i-- ) {
            System.out.print( i + ", " );
        }
        System.out.println("Blastoff!");
    }
}



// 3.) I was correct!
// 4.) The text made it pretty east to guess but I can see why the code works as such.