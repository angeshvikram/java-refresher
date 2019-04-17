package javaRefresher;

public class LinkedList {

	Node head; // head of list 
	  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.println("");
        System.out.println("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    }
    
    
 // Method to print the LinkedList. 
    public static LinkedList reverseList(LinkedList list) 
    {    
        System.out.println("");
        System.out.println("reversingList: "); 
   
        Node currNode = list.head;
        if(list.head == null) {
        	return list;
        }
        
        Node nextNode = currNode.next;
        Node lastNode = currNode;
        Node endNode = currNode;
        
        // Traverse through the LinkedList 
        while ((currNode.next != null) && (nextNode.next != null)) {
        	
        	currNode = nextNode;
        	nextNode = currNode.next;
        	currNode.next = lastNode;
        	lastNode = currNode;        	
        } 
        
        nextNode.next = currNode;
        endNode.next = null;
        list.head = nextNode;
        
        return list;
    } 
   
    // Method to print the LinkedList. 
    public static LinkedList copyreverseHalfList(LinkedList list) 
    {    
        System.out.println("");
        System.out.println("copyreverseHalfList: "); 
   
        Node currNode = list.head;
        if(list.head == null) {
        	return list;
        }
        
        Node nextNode = currNode.next;
        Node lastNode = currNode;
        Node endNode = currNode;
        Node fastNode = currNode;
        
        // Traverse through the LinkedList 
        while ((fastNode.next != null) && (fastNode.next.next != null)) {
        	
        	fastNode = fastNode.next.next;
        	currNode = nextNode;
        	nextNode = currNode.next;
        	currNode.next = lastNode;
        	lastNode = currNode;
        } 
        
        if(fastNode.next == null) {
        	System.out.println("Data is odd");
        }
        
        System.out.println(nextNode.data);
        System.out.println(currNode.data);
        //nextNode.next = currNode;
        endNode.next = null;
        list.head = currNode;
                
        return list;
    } 

    
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 0); 
        list = insert(list, 1); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
//        list = insert(list, 7); 
//        list = insert(list, 8);
//        list = insert(list, 9); 
  
        // Print the LinkedList 
        printList(list); 
        
        list = reverseList(list);
        // Print the LinkedList 
        printList(list); 
        
        list = copyreverseHalfList(list);
        // Print the LinkedList 
        printList(list); 
    } 

}
