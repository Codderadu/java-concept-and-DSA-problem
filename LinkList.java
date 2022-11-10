public class LinkList {
     node head;
    class node{
        int data;
        node next;
       
       node(int data)
       {
        this.data=data;
        this.next=null;
    
       }
    }
    public void addfirst(int data){
        node newNode=new node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast (int data) {
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        } 
        node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
         }
         public void printList(){
            if(head==null){
                System.out.println("list is empty");
            }
            node currNode=head;
            while(currNode.next!=null){
                System.out.print(currNode.data +"->");
                currNode=currNode.next;
                  }
                System.out.println("null");
                }
                public void reverseList(){
                    if(head==null||head.next==null)
                    {
                        return;
                    }
                    node prevnode=head;
                    node currnode=head.next;
                    while(currnode!=null){
                        node nextnode=currnode.next;
                        currnode.next=prevnode;
                        prevnode=currnode;
                        currnode=nextnode;
                    }
                    head.next=null;
                    currnode=prevnode;
                }
    public static void main(String[] args) {
        LinkList ll=new LinkList();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(5);
        ll.addfirst(6);
        ll.printList();
        ll.reverseList();
        ll.printList();
    }
    
}
