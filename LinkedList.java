package practiceEx;

import java.util.Stack;

public class LinkedList {
		
		
		// The LinkedList Node class
		private class Node{
			
			int data;
			Node next;
			
			Node(int gdata){
				this.data = gdata;
				this.next = null;
			}
			
		}
		
		// The LinkedList fields
		Node head;
		
		// Constructor
		LinkedList(int gdata){
			
			this.head = new Node(gdata);
		}
		
		
		public void Insertend(int gdata) {
			Node current = this.head;

			while(current.next!= null) {
				current = current.next;
			}
			
			Node newnode = new Node(gdata);
			
			current.next = newnode;
			
		}
		
		public void Listprint() {
			Node current = this.head;

			while(current!= null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			
			System.out.println();
			
		}
		
		public void Removemin() {
			//current will traverse through the linked list
			Node current = this.head;
			Node min = this.head;
			Node beforeMin = this.head;
			
			while(!(current.next == null)) {
				
				//beforeMin will keep track of the node before the minimum node
				
				//this condition will see which node is less than current than set it to the new min
				
				if(min.data > current.next.data) {
					beforeMin = current;
					min = current.next;
				}
				
				//after we check the condition go onto the next node
				current = current.next;
				
			}
			
			/*
			since we kept track of the node before min, we set the next value of it to the 
			next value of min, this removes it from the linked list. 
			*/
			
			beforeMin.next = min.next;
		}
		
		 public Node reverseList(Node head) {
			 
		        Stack<Node> s = new Stack<Node>();
		        while(head != null){
		            s.push(head);
		            head = head.next;
		        }
		        
		        Node temp = new Node(-1);
		        head = temp;
		        while(!(s.isEmpty())){
		            Node current = s.pop();
		            head.next = new Node(current.data);
		            head = head.next;
		        }
		        
		        return temp.next;
		        
	} 
		
		public static void main(String[] args) {
			
			LinkedList exlist = new LinkedList(8);
			
			exlist.Insertend(1);
			exlist.Insertend(5);
			exlist.Insertend(2);
			exlist.Insertend(7);
			exlist.Insertend(10);
			exlist.Insertend(3);
			
			exlist.Listprint();
			//output: 8 1 5 2 7 10 3
			
			exlist.Removemin();
			
			exlist.Listprint();
			//output should be: 8 5 2 7 10 3
			
			Node curr = exlist.reverseList(exlist.head);
			while(curr != null) {
				System.out.print(curr.data + " ");
				curr = curr.next;
			}
			
			
		}
		
		
		

	}


