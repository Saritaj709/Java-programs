class LinkedList2{
static Node head=null;
class Node {
int data;
Node next,prev;
Node(int d) {
data =d;next=prev=null;
} }
void deleteNode(Node head_ref,Node del) {
if(head==null || del==null) {
return;
}
if(head==del) {
head=del.next;
}
if(del.next!=null) {
del.next.prev=del.next;
}
return;
}
void push(Node head_ref,int new_data) {
Node new_node=new Node(new_data);
new_node.prev=null;
new_node.next=(head);
if((head)!=null) {
(head).prev=new_node;
}
(head)=new_node;
}
void printList(Node node) {
while(node!=null) {
System.out.println(node.data + " ");
node=node.next;
}
}
public static void main(String[] args) {
LinkedList2 list=new LinkedList2();
list.push(head,2);
list.push(head,4);
list.push(head,8);
list.push(head,10);
System.out.println("Original Linked List");
list.printList(head);
System.out.println();
list.deleteNode(head,head);
list.deleteNode(head,head.next);
list.deleteNode(head,head.next);
System.out.println("");
System.out.println("Modified Linked List");
list.printList(head);
System.out.println();
}
}

