package Lab3InsertionSort;

/* Doubly Linked List Class */
/*Programmed by A-Shawni Mitchell, September 29, 2016 */

public class DoubleLinkedList {
	
	private Node start;
	public int size;
	
    //Constructor
	public DoubleLinkedList(){
		
		start=null;
		size=0;
	}
    
	/* isEmpty Method */
	public boolean isEmpty(){
		return start==null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void sort(){
		
		Node curr=start;
		while(curr!=null){
			insert(curr.item);
			curr=curr.next;
		}
	}
	
    /*Insertion Method */
	public void insert(int i){
		
		Node nItem = new Node(i,null,null);
		Node temp, p;
		
		boolean insert = false;
		
		if(start==null)
			start=nItem;
		
		else if(i<=start.item) //if item is less than first place at beginning
			insertBeginning(i);
		
		else{
			temp=start;
			p=start.next;
			
			while(p!=null){
				
				if(i >= temp.item && i <= p.item){ //insert after current item
					insertAfter(i,temp.item);
					insert=true;
					break;
				} else { // move to next item
					temp=p;
					p=p.next;
				}
			}
			if(!insert){ //insert at end
				insertAtEnd(i);
			}
			
		}
		size++;
		
	}
	
	/*Display List*/
	public void displayList(){
		
		Node p;
		if(start==null){
			System.out.println("The List is empty");
			return;
		}
		
		p=start;
		System.out.println("The List is: \n");
		while(p!=null){
			System.out.print(p.item + " ");
			p=p.next;
		}
	}
	
    /*insertAtBeginning Method */
	public void insertBeginning(int data){
		
		Node temp=new Node(data,null,null);
		temp.next=start;
		start.prev=temp;
		start=temp;
	}
	
    /* insert in empty list */
	public void insertInEmptyList(int data){
		
		Node temp = new Node(data,null,null);
		start=temp;
	}
	
    /* insertAtEnd Method */
	public void insertAtEnd(int data){
		
		Node temp = new Node(data,null,null);
		
		Node p = start;
		while(p.next!=null){
			p=p.next;
		}
		p.next=temp;
		temp.prev=p;
	}
	
    /*insertAfter Method */
	public void insertAfter(int data,int n){
		
		Node temp = new Node(data,null,null);
		Node p=start;
		
		while(p!=null){
			
			if(p.item==n)
				break;
			p=p.next;
		}
		
		if(p==null)
			System.out.println(n + " is not present in the list");
		else{
			temp.prev=p;
			temp.next=p.next;
			if(p.next != null)
				p.next.prev=temp;
			p.next=temp;
		}
	}
	
    /*insert Before Method */
	public void insertBefore(int data,int n) {
		
		if(start==null){
			System.out.println("The list is empty");
			return;
		}
		
		if(start.item==n){
			Node temp=new Node(data,null,null);
			temp.next=start;
			start.prev=temp;
			start=temp;
			return;
		}
		
		Node p = start;
		while(p!=null){
			if(p.item==n)
				break;
			p=p.next;
		}
		
		if(p==null)
			System.out.println(n + " is not present in the list");
		else{
			Node temp = new Node(data,null,null);
			temp.prev=p.prev;
			temp.next = p;
			p.prev.next=temp;
			p.prev=temp;
		}
	}
}
