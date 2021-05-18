// The idea here is to create a min heap and never have more than k elements in the min heap.
// We will always grab the head of the min heap, since it is equal to k, that means we can just peek.

    public static List<Integer> kth_largest(int k, List<Integer> initial_stream,
        List<Integer> append_stream) {
		//Create our min heap
		PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
		
		// Start off with the initial stream and add elements until we are size k
		// If our min heap size is greater than k, pop off the head element.
        for(int i = 0; i < initial_stream.size(); i++) {
            min_heap.add(initial_stream.get(i));
            if(min_heap.size() > k)
                min_heap.poll();
        }
		
		// With every add to the min heap using our append_stream list, we want to:
		// 1) Add the current iteration 
		// 2) Check if our min heap size is greater than k, if so pop off the head element(see above).
		// 3) Add the head element of the min heap to our result using peek.  Based off our previous logic,
		// Our head element will ALWAYS be the kth largest element.
        List<Integer> result = new ArrayList<Integer>();
    
        for(int i = 0; i < append_stream.size(); i++) {
            min_heap.add(append_stream.get(i));
            
            if(min_heap.size() > k)
                min_heap.poll(); 
            
            if(min_heap.size()==k)
                result.add(min_heap.peek());
        }
		
		// Finally, return the results.
        return result;

    }