//package ArrayExamples;
package Array;

public class MultiDimArrayDemoRemove {
    public static void main(String[] args)
    {
       
           
                // Create a two-dimensional array of Objects
                Object[][] array = new Object[3][2];
        
                // Initialize the array with integer and string pairs
                array[0][0] = 1;
                array[0][1] = "First";
                array[1][0] = 2;
                array[1][1] = "Second";
                array[2][0] = 3;
                array[2][1] = "Third";
        
                // Print the contents of the array
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Integer: " + array[i][0] + ", String: " + array[i][1]);
                }
    }
        
        

}
