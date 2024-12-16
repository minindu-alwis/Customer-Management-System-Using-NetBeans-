/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

import Customer.Customer;

public class List {
    private Node start;
	
	public boolean add(Customer customer){ //add to the last(Insertion order)->(add  of Queue)
		if(isEmpty()){
			return addFirst(customer);
		}else{
			return addLast(customer);
		}
		//return isEmpty()? addFirst(customer):addFirst(customer);
	}
	public boolean addLast(Customer customer){
		if(isEmpty()){
			return addFirst(customer);			
		}else{
			Node n1=new Node(customer);
			Node lastNode=start;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=n1;
			return true;
		}
	}
	public boolean addFirst(Customer customer){ //push(customer) of stack
		Node n1=new Node(customer);
		n1.next=start;
		start=n1;
		return true;
	}
	public boolean add(int index, Customer customer){
		if(index>=0 && index<=size()){
			if(index==0){
				return addFirst(customer);
			}else{
				int count=0;
				Node temp=start;
				Node n1=new Node(customer);
				while(count<index-1){
					temp=temp.next;
					count++;
				}
				n1.next=temp.next;
				temp.next=n1;
				return true;		
			}
		}
		return false;
	}
	public Customer get(int index){
		if(index>=0 && index<size()){
			int count=0;
			Node temp=start;
			while(count<index){
				count++;
				temp=temp.next;
			}
			return temp.customer;
		}	
		return null;
	}
	public Customer removeFirst(){
		if(!isEmpty()){
			Customer c1=start.customer;
			start=start.next;
			return c1;
		}
		return null;
	}
	public Customer removeLast(){
		if(isEmpty()){
			return null;
		}
		if(start.next==null){ //if(size()==1){}
			Customer customer=start.customer;
			start=null;
			return customer;
		}
		Node temp=start;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		Customer customer=temp.next.customer;
		temp.next=null;
		return customer;
	}
	public Customer remove(int index){
		if(index>=0 && index<size()){
			if(index==0){
				Customer customer=start.customer;
				removeFirst();
				return customer;
			}
			Node temp=start;
			int count=0;
			while(count<index-1){
				temp=temp.next;
				count++;
			}
			Customer customer=temp.next.customer;
			temp.next=temp.next.next;
			return customer;
		}
		return null;
	}
	public boolean remove(Customer customer){
		int index=search(customer);
		return remove(index)!=null;
	}
	public boolean set(int index, Customer customer){ //set-->replace(Customer customer)
		if(index>=0 && index<size()){
			Node temp=start;
			int count=0;
			while(count<index){
				count++;
				temp=temp.next;
			}
			temp.customer=customer;
			return true;
		}
		return false;
	}
	public int search(Customer customer){
		Node temp=start;
		int index=0;
		while(temp!=null){
			if(temp.customer.equals(customer)){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
	public boolean contains(Customer customer){
		return search(customer)!=-1;
	}
	public boolean isEmpty(){
		return start==null;
	}
	public int size(){
		Node temp=start;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public void printList(){
		System.out.println(toString());
	
	}
	public String toString(){
		String list="{";
		Node temp=start;
		while(temp!=null){
			list+=temp.customer.toString()+"; ";
			temp=temp.next;
		}
		return isEmpty()? "{empty}":list+"\b\b}";
	}
	public void clear(){
		start=null;
	}
	public Customer[] toArray(){
		Customer[] tempCustomerArray=new Customer[size()];
		Node temp=start;
		for (int i = 0; i < tempCustomerArray.length; i++){
			tempCustomerArray[i]=temp.customer;
			temp=temp.next;
		}
		return tempCustomerArray;
	}
	class Node{
		private Customer customer;
		private Node next;
		
		private Node(Customer customer){
			this.customer=customer;
		}
	}
}


