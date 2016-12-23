package Lab3InsertionSort;
 
/*Node Class*/
/*Programmed by A-Shawni Mitchell, September 29, 2016 */

public class Node {
	
	public int item;
	public Node prev;
	public Node next;
	 
    /* Constructor */
	public Node(){
		item=0;
		prev=null;
		next=null;
	}
	
	public Node(int i,Node p,Node n ){
		item=i;
		prev=p;
		next=n;
	}
	
    /* Setters */
	public void setNext(Node n){
		next=n;
	}
	
	public void setPrev(Node p){
		prev=p;
	}
	
	public void setItem(int i){
		item=i;
	}
	
    /* Getters */
	public Node getNext(){
		return next;
	}
	
	public Node getPrev(){
		return prev;
	}
	
	public int getItem(){
		return item;
	}
}
