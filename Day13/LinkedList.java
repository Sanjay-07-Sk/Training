package Day13;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linked{
    Node head;
    public void insertAtStart(int data){
        Node curr=new Node(data);
        curr.next=head;
        head=curr;
    }

    public void insertAtPosition(int pos,int data){
        if(pos==0){
            insertAtStart(data);
            return;
        }
        Node newNode=new Node(data);
        Node curr=head;
        Node prev=null;
        for(int i=0;i<pos;i++){
            if(curr==null)return;
            prev=curr;
            curr=curr.next;
        }
        if(prev!=null){
            newNode.next=curr;
            prev.next=newNode;
        }
    }

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        Node curr=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }

    public void deleteAtPosition(int pos){
        if(head==null)return;
        if(head.next==null)head=head.next;
        Node curr=head;
        for(int i=1;i<pos-1;i++){
            if(curr.next==null)return;
            curr=curr.next;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
    }

    public void deleteAtStart(){
        if(head==null)return;
        head=head.next;
    }

    public void deleteAtEnd(){
        if(head==null)return;
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
    
    public void reverse(){
        Node prev=null;
        Node next=null;
        Node curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }

    public void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Linked l=new Linked();
        l.insertAtStart(5);
        l.insertAtStart(4);
        l.insertAtStart(3);
        l.insertAtStart(2);
        l.insertAtEnd(6);
        l.print();
        l.insertAtPosition(2, 7);
        l.print();
        l.deleteAtPosition(2);
        l.print();
    }
}
