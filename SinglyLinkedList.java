public class SinglyLinkedList
{
		private ListNode head;
		private static class ListNode{
		    private int data;
		    private ListNode next;
		    public ListNode(int data){
		        this.data=data;
		        this.next=null;
		    }
		}
		public void length(){
         int count=0;
		 ListNode current=head;
         while(current!=null)
         {
            count++;
			current=current.next;
         }
		 System.out.print("\nThe length of the linked list is "+ count);
      }
	  public void insertFirst(int value){
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	  }
	  public void insertLast(int value){
		ListNode newNode= new ListNode(value);
		if(head==null){
			head=newNode;
			return;
		}
		ListNode current=head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=newNode;
	  }
	  public void insert(int position,int value){
		ListNode node=new ListNode(value);
		if(position==1){
			node.next=head;
			head=node;
		}
		else{
			ListNode previous=head;
			int count=1;
			while(count<position-1){
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=node;
			node.next=current;
		}
	  }
	  public ListNode deleteFirst(){
		if(head==null)
		{
			return null;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	  }
	  public void delete(int position){
		if(position==1){
			head=head.next;
		}
		else{
			ListNode previous=head;
			int count=1;
			while(count<position-1){
				previous=previous.next;
				count++;
			}
			ListNode current =previous.next;
			previous.next=current.next;
		}
	  }
      public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.print("Null");
        }
        public static void main(String[] args){
		    SinglyLinkedList sll=new SinglyLinkedList();
		    sll.head=new ListNode(10);
		    ListNode second=new ListNode(1);
		    ListNode third=new ListNode(8);
		    ListNode fourth=new ListNode(11); 
		    
		    sll.head.next=second;
		    second.next=third;
		    third.next=fourth;
			sll.insertFirst(15);
			sll.insertLast(20);
			sll.deleteFirst();
			sll.insert(2, 23);
			sll.delete(2);
			sll.display();
			sll.length();
		}
}