package practice;

import java.util.HashSet;

public class KthLastElemt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList1 list1 = new LinkList1();
		LinkList1 list2 = new LinkList1();
		list1.insert(1);
		list1.insert(1);
		list1.insert(8);
		list1.print();
		list2.insert(7);
		list2.insert(3);
		list2.insert(4);
		list2.print();
		
		LinkList1 list = LinkList1.addLinkList(list1, list2);
		//list.insert(5);
		//list.insert(3);
		//list.insert(2);
		//list.insert(5);
		//list.insert(10);
		//list.partition(5);
		//System.out.println("lenght of the LinkList: "+(Node1.cnt-1)/2);
		list.print();
		//System.out.println("is link list palindrome: "+list.isPalindrom());
		//Node1 node = list.findKthLastelemet(2);
		//list.deleteM();
		//list.print();
		//System.out.println("\nkth Last element: "+node.data);
		//list.removeDuplicate();
		//list.print();
		//System.out.println("lenght of the LinkList: "+list.length());
		
	}

}


class LinkList1{
	 private  Node1 head;
	 private int len;
	 
	public LinkList1(){
		 head =null;
	 }
	public void insert(int data){
	Node1 node = new Node1(data);
		if(head != null){
			node.next = head;
			head = node;
		}else{
			head = node;
		}
		len++;
	}
	
	public int length(){
		return Node1.cnt;
	}
	
	public int size(){
		return (this.len-1);
	}
	
	public Node1 findKthLastelemet(int k){
		int n;
		Node1 node;
		if(head != null){
			n = Node1.cnt- k +1;
			node = head;
			while(n>1){
				node = node.next;
				n--;
			}
			return node;
		}else{
			System.out.println("empty List");
			return null;
		}
		
	}
	
	public void deleteM(){
		int n = Math.floorDiv(Node1.cnt,2)+1 ;
		Node1 node;
		Node1 pvnode=null;
		if(n>1){
			node = head;
			while(n>1){
				pvnode = node;
				node = node.next;
				n--;
			}
			pvnode.next = node.next;
			Node1.cnt--;
		}else{
			System.out.println("Can't delete the node");
		}
	}
	
	public void removeDuplicate(){
		HashSet<Integer> hash = new HashSet<Integer>();
		Node1 node = null;
		Node1 prvnode = null;
		if(head != null){
			node = head;
			while(node != null){
				if(!hash.contains(node.data)){
					hash.add(node.data);
				}else{
					prvnode.next = node.next;
					Node1.cnt--;
				}
				prvnode = node;
				node = node.next;
			}
			
		}else{
			System.out.println("empty List");
		}
	}
	
	public void delete(int n){
		Node1 node =null;
		Node1 prvnode = null;
		if(head.data == n){
			head = head.next;
		}else if(head != null){
			node = head;
			while(node != null){
				
				if(node.data == n){
					prvnode.next = node.next;
					Node1.cnt--;
				}
				prvnode = node;
				node = node.next;
			}
		}else{
			System.out.println("empty List");
		}
	}
	
	public void partition(int n){
		
		Node1 temp = head;
		Node1 node = head;
		int t=0;
		
		while(node != null){
			if(node.data < n){
				if(node != temp){
					t = temp.data;
					temp.data = node.data;
					node.data =t;
					temp = temp.next;
				}else{
				temp = temp.next;
				}
			}
			node = node.next;
		}
		
	}
	
	public boolean isPalindrom(){
		int[] arr = new int[Node1.cnt/2];
		int i =0;
		int l = Node1.cnt/2;
		int flag =0;
		System.out.print("\n");
		if(head != null){
			Node1 node = head;
				while(i<l){
				arr[i]=node.data;
				System.out.print(arr[i]+" "+node.data+"\t");
				i++;
				node = node.next;
				}
				if(l%2 != 0){
					node = node.next;
				}
				while(i>0){
					System.out.println(i);
					
					i--;
					if(arr[i] != node.data){
						return false;
					}
					
					node = node.next;				
			}
		}
		
		return true;
	}
	
	public static LinkList1 addLinkList(LinkList1 list1, LinkList1 list2){
		int l1= 0;//list1.size();
		int l2 = 0;//list2.size();
		Node1 node1 = list1.head;
		Node1 node2 = list2.head;
		int temp1 =0, temp2 =0,sum = 0;
		
		while(node1 != null){
		    temp1 = (int) (temp1 + node1.data * Math.pow(10, l1));
		    //l1--;
		    l1++;
		    node1 = node1.next;
		}
		while(node2 != null){
		    temp2 = (int) (temp2 + node2.data * Math.pow(10, l2));
		    //l2--;
		    l2++;
		    node2 = node2.next;
		}
		sum = temp1 + temp2;
		System.out.println(temp1+"\t"+temp2+"\t"+sum);
		sum = reversDigits(sum);
		reversDigits(sum);
		LinkList1 list3 = new LinkList1();
		int n;
		while(sum != 0){
			n = sum%10;
			list3.insert(n);
			sum = sum/10;
		}
		return list3;
		
	}
	
	public static int reversDigits(int num)
	{
	    int rev_num = 0;
	    while(num > 0)
	    {
	        rev_num = rev_num*10 + num%10;
	        num = num/10;
	    }
	    return rev_num;
	}
	
	
	public void print(){
		Node1 node;
		
		if(head!=null){
			node = head;
			System.out.println("\n");
			while(node != null){
				System.out.print(node.data+"\t");
				node = node.next;
			}
		}
		else{
			System.out.println(" LinkList is emply");
		}
		
	}
}

class Node1{
	public Node1 next;
	public int data;
	public static int cnt;
	
	public Node1(int data){
		this.data =data;
		this.next =null;
		cnt++;
	}
}
