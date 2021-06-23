// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(50);
        head.next = new SinglyLinkedListNode(10);
        head.next.next = new SinglyLinkedListNode(11);
        
        
        SinglyLinkedListNode another = new SinglyLinkedListNode(3);
        another.next = new SinglyLinkedListNode(7);
        another.next.next = new SinglyLinkedListNode(112);
        
        List<SinglyLinkedListNode> lists = new LinkedList<>();
        lists.add(head);
        lists.add(another);
        SinglyLinkedListNode result = merge_k_lists(lists);
        System.out.println(result.next.next.data);
    }
    
     static class SinglyLinkedListNode {
            public int data;
            public SinglyLinkedListNode next;
        
            public SinglyLinkedListNode(int nodeData) {
                this.data = nodeData;
                this.next = null;
            }
            public void createDynamicNodes(SinglyLinkedListNode node) {
                this.next = node;
            }
        }
    
     public static SinglyLinkedListNode merge_k_lists(List<SinglyLinkedListNode> lists) {
        SinglyLinkedListNode head = null;
        SinglyLinkedListNode tail = null;
        PriorityQueue<SinglyLinkedListNode> minHeap = new PriorityQueue<>((a,b) -> a.data - b.data);
        for(SinglyLinkedListNode node: lists) {
            if(node != null) {
                
                minHeap.add(node);
                
            }
            
        }
        while(!minHeap.isEmpty()) {
            SinglyLinkedListNode current = minHeap.remove();
            //System.out.println(current.data);
            if(head == null) {
                head = tail = current;
            }
            else {
                tail.next = current;
                tail = tail.next;
            }
            if (current.next != null) {
                minHeap.offer(current.next);
            }
        }
        
        return head;
        
    }
}

