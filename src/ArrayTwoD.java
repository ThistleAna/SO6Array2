public class ArrayTwoD {
    public static void main (String [] args){
        //Multidimensional array =  multiple rows and multiple cols
        String [][] myArray = {{"Harry", "Ron", "Hermione"},
                                {"Potter", "Weasley", "Granger"}};
        // printing multiD array
        System.out.println(myArray[0][0]);
        System.out.println(myArray[0][1]);
        System.out.println(myArray[0][2]);
        System.out.println(myArray[1][0]);
        System.out.println(myArray[1][1]);
        System.out.println(myArray[1][2]);
        //System.out.println(myArray[1][3]); this is index outofbound case
        // change data
        myArray[1][2] = "Weasley";
        System.out.println("New data: ");
        // for loops to access all data
        for (int i=0; i< myArray.length; i++){// index i access the rows
            for (int j=0; j < myArray[i].length; j++){ // index j access the col
                System.out.println(myArray[i][j]);
            }
        }
    }
}
