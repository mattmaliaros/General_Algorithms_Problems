// Attend Meetings problem

// This isn't a great solution -- This is a copied solution converted from C++ -> Java but in Java we would prefer to compare two arrays at one time
// See other solution

public class Main {
    public static void main(String[] args) {
        //Create the test cases
        int[] arr1 = {2, 5, 10};
        int[] arr2 =  {2, 3, 4, 10};
        int[] arr3 = {2, 4, 10};
        // Run the function and store into result
        int[] result = find_intersection(arr1, arr2, arr3);
        // Print values from the result that aren't 0.  0 values are filled into the array automatically.
        for(int i: result){
        if(i != 0) System.out.println(i);
        }
    }
    
    public static int[] find_intersection(int[] arr1, int[] arr2, int[] arr3){
        //Set up all index for 4 arrays (4th array is the result array)
        int arr1Index = 0, arr2Index = 0, arr3Index = 0, resultIndex = 0;
        //Grab the sizes of the arrays and the minSize to determine the size of our final result. (Can't be more than the amount of elements in smallest array)
        int arr1Size = arr1.length, arr2Size = arr2.length, arr3.length;
        int minSize =  Math.min(Math.min(arr1Size,arr2Size),arr3Size);
        int[] result = new int[minSize];
        
        // While all of our arrays still have elements -- This will end once we have finished an array
        while((arr1Index < arr1Size) && (arr2Index < arr2Size) && (arr3Index < arr3Size)) {
            // If the value is equal in all 3 arrays, store it in the result and increment index.  We can grab from any array.
            if((arr1[arr1Index] == arr2[arr2Index]) && (arr2[arr2Index] == arr3[arr3Index])) 
                result[resultIndex++] = arr1[arr1Index]; 
        
        //This determines what the smallest value is and stores it in mini.  We only increment the smallest because it means it wasn't located in all 3.
        int mini = Math.min(Math.min(arr1[arr1Index], arr2[arr2Index]), arr3[arr3Index]);
        if(mini == arr1[arr1Index])
         arr1Index++;
        if(mini == arr2[arr2Index])
         arr2Index++;
        if(mini == arr3[arr3Index])
         arr3Index++;
        
        
        
        }
        // Finally return the result array with any common values in all 3 arrays.
        return result;
    }
}
