package practice;

/* Operations of link list
 * insert at start or end O(1)
 * delete O(n)
 * serach O(n)
 */

public class LinklistImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList list = new LinkList();
		list.insert(23);
		list.insert(12);
		list.insert(91);
		list.print();
		

	}

}

class LinkList{
	
	private Node head;
	private Node temp;
	
	public LinkList(){
		head =  null;
	}
	public void insert(int data){
		Node node = new Node(data);
		if(head != null ){
			node.next = head;
			head = node;
		}else{
			head = node;
		}
		
	}
	 
	public void delete(int n){
		Node node,prvnode=null;
		if(head.data == n){
			head = head.next;
		}
		else if(this.head != null){
			node = head;
			while(node.next != null){
				
				if(node.data == n){
					prvnode.next = node.next;
				}
				prvnode = node;
				node = node.next;
			}
			
		}else{
			System.out.println(this+" LinkList is emply");
		}
		
	}
	
	public void print(){
		Node node;
		
		if(head!=null){
			node = head;
			System.out.println("\n");
			while(node != null){
				System.out.print(node.data+"\t");
				node = node.next;
			}
			//System.out.print(node.data+"\t");
		}
		else{
			System.out.println(" LinkList is emply");
		}
		
	}
	
	
}

class Node{
	
	public Integer data;
	public Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
}
