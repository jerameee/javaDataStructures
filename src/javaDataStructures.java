
import java.io.*; 
import java.util.*;
import java.util.LinkedList; 
import java.util.Queue; 

public class javaDataStructures {

	public static void main(String[] args) {
		
//ARRAY- Arrays are defined as the collection of similar type of data items stored at contiguous memory locations.

		//declaration, instantiation and initialization
		
		int a[]={22,2,7,6};
		
		//printing array (where length is the property of array
		
		for(int i=0;i<a.length;i++)
			
		System.out.println(a[i]);
	}
	
/*
 
STACK- A stack is an ordered list in which insertion and deletion can be performed only at one end that is called top.
Stacks are sometimes called as Last-In-First-Out (LIFO) lists i.e. the element which is inserted first in the stack, will be deleted 
last from the stack using the Push and Pop operations.

*/
		
	public static void stack_push(Stack<Integer> stack) { 
		
		// Pushing element on the top of the stack
		 
	        for(int i = 0; i < 5; i++) { 
	            stack.push(i); 
	        } 
	    } 
	      
	    // Popping element from the top of the stack
	
	  public static void stack_pop(Stack<Integer> stack) { 
		  
	        System.out.println("Pop :"); 
	  
	        for(int i = 0; i < 5; i++) {
	        	
	            Integer y = (Integer) stack.pop();
	            
	            System.out.println(y); 
	        } 
	    } 
	  
	    // Displaying element on the top of the stack
	  
	  public static void stack_peek(Stack<Integer> stack) { 
		  
	        Integer element = (Integer) stack.peek();
	        
	        System.out.println("Element on stack top : " + element); 
	    } 
	      
	    // Searching element in the stack 
	  
	   public static void stack_search(Stack<Integer> stack, int element) {
		   
	        Integer pos = (Integer) stack.search(element); 
	  
	        if(pos == -1) 
	            System.out.println("Element not found");
	        
	        else
	            System.out.println("Element is found at position " + pos); 
	    } 
	  
	  public static void main (String[] args) {
		   
	        Stack<Integer> stack = new Stack<Integer>(); 
	  
	        stack_push(stack); 
	        stack_pop(stack); 
	        stack_push(stack); 
	        stack_peek(stack); 
	        stack_search(stack, 2); 
	        stack_search(stack, 6); 
	    }
	  
/*
	  
QUEUE- A queue can be defined as an ordered list which enables insert operations to be performed at one end called REAR and 
delete operations to be performed at another end called FRONT. Queues are referred to as First In First Out list.

*/
	  public static void main(String[] args) {
		  
	  Queue<Integer> q = new LinkedList<>(); 
	  
	    // Adds elements {0, 1, 2, 3, 4} to queue
	  
	    for (int i=0; i<5; i++) 
	     q.add(i); 
	  
	    // Display contents of the queue
	    
	    System.out.println("Elements of queue-"+q); 
	  
	    // To remove the head of queue
	    
	    int removedele = q.remove();
	    
	    System.out.println("removed element-" + removedele); 
	  
	    System.out.println(q); 
	  
	    // To view the head of queue
	    
	    int head = q.peek(); 
	    
	    System.out.println("head of queue-" + head); 
	  
	  
	     
	    //Rest all methods of collection interface,like size and contains can be used with this implementation
	    
	    int size = q.size();
	    
	    System.out.println("Size of queue-" + size); 
	  } 
	  
/*
	  
LINKEDLIST- Linked List can be defined as a collection of objects called nodes that are randomly stored in the memory. A node contains two fields 
i.e. data stored at that particular address and the pointer which contains the address of the next node in the memory. 
The last node of the list contains a pointer to the null.

*/
	  public static void main(String args[]) { 
		  
	        // Creating object of class linked list
		  
	        LinkedList<String> object = new LinkedList<String>(); 
	  
	        // Adding elements to the linked list
	        
	        object.add("A"); 
	        object.add("B"); 
	        object.addLast("C"); 
	        object.addFirst("D"); 
	        object.add(2, "E"); 
	        object.add("F"); 
	        object.add("G"); 
	        
	        System.out.println("Linked list : " + object); 
	  
	        // Removing elements from the linked list 
	        
	        object.remove("B"); 
	        object.remove(3); 
	        object.removeFirst(); 
	        object.removeLast(); 
	        
	        System.out.println("Linked list after deletion: " + object); 
	  
	        // Finding elements in the linked list
	        
	        boolean status = object.contains("E"); 
	  
	        if(status) 
	        	
	            System.out.println("List contains the element 'E' ");
	        
	        else
	        	
	            System.out.println("List doesn't contain the element 'E'"); 
	  
	        // Number of elements in the linked list
	        
	        int size = object.size(); 
	        
	        System.out.println("Size of linked list = " + size); 
	  
	        // Get and set elements from linked list 
	        
	        Object element = object.get(2);
	        
	        System.out.println("Element returned by get() : " + element); 
	        
	        object.set(2, "Y"); 
	        
	        System.out.println("Linked list after change : " + object); 
	    } 
	  
/*
	  
TREE- A Tree is a recursive data structure containing the set of one or more data nodes where one node is designated as the root of the 
tree while the remaining nodes are called the children of the root. The nodes other than the root node are partitioned into the non empty 
sets where each one of them is to be called sub-tree. Nodes of a tree either maintain a parent-child relationship between them or they are sister nodes. 
In a general tree, A node can have any number of children nodes but it can have only a single parent.

*/

	  //Class containing left and right child of current node and key value
	   
	  class Node {
		  
	    int key; 
	    Node left, right; 
	  
	    public Node(int item) {
	    	
	        key = item; 
	        left = right = null; 
	    } 
	} 
	  
	// A Java program to introduce Binary Tree
	  
	class BinaryTree { 
		
	// Root of Binary Tree
		
	    Node root; 
	  
	    // Constructors 
	    
	    BinaryTree(int key) { 
	    	
	        root = new Node(key); 
	    } 
	  
	    BinaryTree() { 
	     
	        root = null; 
	    } 
	  
	    public static void main(String[] args) {
	     
	        BinaryTree tree = new BinaryTree(); 
	  
	        /*create root*/
	        
	        tree.root = new Node(1); 
	  
	        /* following is the tree after above statement 
	  
	              1 
	            /   \ 
	          null  null     */
	  
	        tree.root.left = new Node(2);
	        
	        tree.root.right = new Node(3); 
	  
	        /* 2 and 3 become left and right children of 1 
	               1 
	             /   \ 
	            2      3 
	          /    \    /  \ 
	        null null null null  */
	  
	        tree.root.left.left = new Node(4); 
	        
	        /* 4 becomes left child of 2 
	                    1 
	                /       \ 
	               2          3 
	             /   \       /  \ 
	            4    null  null  null 
	           /   \ 
	          null null 
	         */
	    } 

	}

/*
	  
GRAPH- A graph can be defined as a group of vertices and edges that are used to connect these vertices. A graph can be seen as a cyclic 
tree, where the vertices (Nodes) maintain any complex relationship among them instead of having parent child relationship.
	
*/
	
	public class GFG  { 
	   
	    static class Graph { 
	        
	    	int V; 
	    	
	        LinkedList<Integer> adjListArray[]; 
	          
	        // constructor  
	        
	        Graph(int V) {
	        
	            this.V = V; 
	              
	         // define the size of array as number of vertices 
	            
	            adjListArray = new LinkedList[V]; 
	              
	         // Create a new list for each vertex such that adjacent nodes can be stored 
	            
	            for(int i = 0; i < V ; i++){ 
	                adjListArray[i] = new LinkedList<>(); 
	            } 
	        } 
	    } 
	      
	        // Adds an edge to an undirected graph 
	    
	    static void addEdge(Graph graph, int src, int dest) {
	     
	        // Add an edge from src to dest.
	    	
	        graph.adjListArray[src].add(dest); 
	          
	        // Since graph is undirected, add an edge from dest to src also
	         
	        graph.adjListArray[dest].add(src); 
	    } 
	       
	    // A utility function to print the adjacency list representation of graph 
	    
	    static void printGraph(Graph graph) {
	            
	        for(int v = 0; v < graph.V; v++) {
	         
	            System.out.println("Adjacency list of vertex "+ v); 
	            
	            System.out.print("head"); 
	            
	            for(Integer pCrawl: graph.adjListArray[v]){ 
	            	
	                System.out.print(" -> "+pCrawl); 
	            }
	            
	            System.out.println("\n"); 
	        } 
	    } 
	       
	    // Driver program to test above functions 
	    
	    public static void main(String args[]) {
	     
	    // create the graph given in above figure 
	    	
	        int V = 5; 
	        
	        Graph graph = new Graph(V); 
	        
	        addEdge(graph, 0, 1); 
	        addEdge(graph, 0, 4); 
	        addEdge(graph, 1, 2); 
	        addEdge(graph, 1, 3); 
	        addEdge(graph, 1, 4); 
	        addEdge(graph, 2, 3); 
	        addEdge(graph, 3, 4); 
	       
	     //Print the adjacency list representation of the above graph 
	        
	        printGraph(graph); 
	    } 
	
    }
	
//TRIE- A trie is an ordered tree structure, which takes advantage of the keys that it stores – usually strings.
	
	    // Java implementation of search and insert operations on Trie 
	
	public class Trie { 
	      
	    // Alphabet size (# of symbols) 
		
	    static final int ALPHABET_SIZE = 26; 
	      
	    // trie node
	    
	    static class TrieNode {  
	    
	        TrieNode[] children = new TrieNode[ALPHABET_SIZE]; 
	       
	    //isEndOfWord is true if node represents end of word 
	        
	        boolean isEndOfWord; 
	          
	        TrieNode(){ 
	        	
	        
	            isEndOfWord = false; 
	            
	            for (int i = 0; i < ALPHABET_SIZE; i++) 
	            	
	                children[i] = null; 
	        } 
	    }; 
	       
	    static TrieNode root;  
	      
	    // If not present, inserts key into trie, If the key is prefix of trie node, just marks leaf node
	    
	    static void insert(String key)  {
	    
	        int level; 
	        int length = key.length(); 
	        int index; 
	       
	        TrieNode pCrawl = root; 
	       
	        for (level = 0; level < length; level++)  {
	        
	            index = key.charAt(level) - 'a'; 
	            
	            if (pCrawl.children[index] == null) 
	                pCrawl.children[index] = new TrieNode(); 
	       
	            pCrawl = pCrawl.children[index]; 
	        } 
	       
	     // mark last node as leaf 
	        
	        pCrawl.isEndOfWord = true; 
	    } 
	       
	    // Returns true if key presents in trie, else false 
	    
	    static boolean search(String key) {
	     
	        int level; 
	        int length = key.length(); 
	        int index; 
	        TrieNode pCrawl = root; 
	       
	        for (level = 0; level < length; level++) {
	         
	            index = key.charAt(level) - 'a'; 
	       
	            if (pCrawl.children[index] == null) 
	                return false; 
	       
	            pCrawl = pCrawl.children[index]; 
	        } 
	       
	        return (pCrawl != null && pCrawl.isEndOfWord); 
	    } 
	       
	    // Driver 
	    
	    public static void main(String args[]) { 
	     
	    // Input keys (use only 'a' through 'z' and lower case) 
	    	
	        String keys[] = {"the", "a", "there", "answer", "any", 
	                         "by", "bye", "their"}; 
	       
	        String output[] = {"Not present in trie", "Present in trie"}; 
	       
	       
	        root = new TrieNode(); 
	       
	    // Construct trie
	        
	        int i; 
	        for (i = 0; i < keys.length ; i++) 
	            insert(keys[i]); 
	       
	    // Search for different keys 
	        
	        if(search("the") == true) 
	            System.out.println("the --- " + output[1]); 
	        else System.out.println("the --- " + output[0]); 
	          
	        if(search("these") == true) 
	            System.out.println("these --- " + output[1]); 
	        else System.out.println("these --- " + output[0]); 
	          
	        if(search("their") == true) 
	            System.out.println("their --- " + output[1]); 
	        else System.out.println("their --- " + output[0]); 
	          
	        if(search("thaw") == true) 
	            System.out.println("thaw --- " + output[1]); 
	        else System.out.println("thaw --- " + output[0]); 
	         
	    } 

	}
	
//HASHTABLE- A hash table maps keys to values. Any non-null object can be used as a key or as a value.
	
	// Java code illustrating clear() and clone() methods 
	
	class hashTabledemo { 
		
	
	    public static void main(String[] arg) {
	     
	    // creating a hash table 
	    	
	        Hashtable<Integer, String> h = 
	                      new Hashtable<Integer, String>(); 
	  
	        Hashtable<Integer, String> h1 = 
	                      new Hashtable<Integer, String>(); 
	  
	        h.put(3, "Geeks"); 
	        h.put(2, "forGeeks"); 
	        h.put(1, "isBest"); 
	  
	    // create a clone or shallow copy of hash table h
	        
	        h1 = (Hashtable<Integer, String>)h.clone(); 
	  
	    // checking clone h1 
	        
	        System.out.println("values in clone: " + h1); 
	  
	    // clear hash table h
	        
	        h.clear(); 
	  
	    // checking hash table h
	        
	        System.out.println("after clearing: " + h); 
	    } 

	}
}
	

	


