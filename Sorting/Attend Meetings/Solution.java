// Attend Meetings problem

// This isn't a great solution -- This is a copied solution converted from C++ -> Java but in Java we would prefer to compare two arrays at one time
// See other solution

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 10};
        int[] arr2 =  {2, 3, 4, 10};
        int[] arr3 = {2, 4, 10};
            
        int[] result = find_intersection(arr1, arr2, arr3);
        for(int i: result){
        if(i != 0) System.out.println(i);
        }
    }
    
    public static int[] find_intersection(int[] arr1, int[] arr2, int[] arr3){
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        int arr3Size = arr3.length;
        int maxSize =  Math.max(Math.max(arr1Size,arr2Size),arr3Size);
        int[] result = new int[maxSize];
        int arr1Index = 0, arr2Index = 0, arr3Index = 0, resultIndex = 0;;
        
        while((arr1Index < arr1Size) && (arr2Index < arr2Size) && (arr3Index < arr3Size)) {
            if((arr1[arr1Index] == arr2[arr2Index]) && (arr2[arr2Index] == arr3[arr3Index])) 
                result[resultIndex++] = arr1[arr1Index]; 
        
        
        int mini = Math.min(Math.min(arr1[arr1Index], arr2[arr2Index]), arr3[arr3Index]);
        if(mini == arr1[arr1Index])
         arr1Index++;
        if(mini == arr2[arr2Index])
         arr2Index++;
        if(mini == arr3[arr3Index])
         arr3Index++;
        
        
        
        }
        return result;
    }
}