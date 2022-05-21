public class Main {
    public static void main(String[] args) {

        String[][] testArray = new String[5][4];

        for(int y = 0; y < testArray.length; y++) {         //Iterates through y, the vertical axis of the array, [y][ ], rows.
            for(int x = 0; x < testArray[0].length; x++) {  //Iterates through x, the horizontal axis ot the array, [ ][x], columns.
                testArray[y][x] = "X";                      //This then goes through each column of the current row and fills it with "X".
            }                                               //When the inner loop is finished and each column of the current row is filled,
        }                                                   //the row is advanced by 1 and the process fills it up again until all columns
                                                            //of the current row are filled again.
        for(int y = 0; y < testArray.length; y++) {
            for(int x = 0; x < testArray[0].length; x++) {  //Same as above, but instead of writing it prints the array field to console.
                System.out.print(testArray[y][x]);          //.print() as part of the horizontal loop so the content is properly shown 1:1
            }                                               //like it would be within an actual coordinate system.
            System.out.println();                           //Empty .println() after each time the horizontal loop is finished and before
        }                                                   //the row is advanced to break the line in the console so the field is displayed
    }                                                       //properly.
}

//array.length is the attribute for the first dimension of the array [y][ ]
//array[0].length for the second dimension [ ][x]
//array[1].length would be for the third dimension and so on and so forth