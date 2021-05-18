  // Stole this from top attempts.

  // This is a great solution because we use the OVERLOADED find_intersection method to compare two arrays at a time.
  // We compare the first two arrays and store the result.  We then compare the newly created result with the left over third array.
  // We store that result again, and return it for our final answer.

    public static List<Integer> find_intersection(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
  
        // Creating an empty result if we don't find any values in both calls. We return -1 if there aren't any values that intersect
        List<Integer> emptyResult = new ArrayList();
        emptyResult.add(-1);
        
        // Store the compared result of the first two arrays into result.
        List<Integer> result = find_intersection(arr1, arr2);
        if (result.size() < 1) return emptyResult;
        //Store the compared result of the leftover third array and the merged copy of arr1 and arr2.
        List<Integer> result2 = find_intersection(result, arr3);
        if (result2.size() < 1) return emptyResult;
        //Final answer
        return result2;
    }
    
    static List<Integer> find_intersection(List<Integer> arr1,List<Integer> arr2) {
        //Create a merged copy of the two
        List<Integer> result = new ArrayList<>();
        //Indexes for both
        int i = 0;
        int j = 0;
        //While we still have elements -- This will fail once we have ran through one of the arrays.
        while (i < arr1.size() && j < arr2.size()) {
            //Create copies of current elements
            int n1 = arr1.get(i);
            int n2 = arr2.get(j);
            // We found a match, add to result, increment both indexes
            if (n1 == n2) {
                result.add(n1);
                i++; j++;
              // Our lowest element can be thrown out.  The arrays are already sorted so the lower value will never be found.  Throw out the left array's element.
            } else if (n1< n2) {
                i++;
              // See above, throw out the right array's element.
            } else {
                j++;
            }
        }
      // Return our merged copies
        return result;
        
    }
