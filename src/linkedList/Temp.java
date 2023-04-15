package src.linkedList;

import java.util.Scanner;

public class Temp {

    Node<Integer> insertData(){

        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();

        while (data!=-1){

            Node<Integer> newNode = new Node<>(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }else {
                tail.next = newNode;
                tail = newNode;
            }

            data = sc.nextInt();

        }

        return head;




    }

    void print(Node<Integer> head){

        if(head==null){
            System.out.println("there is no element in linked list");
        }else{

            Node<Integer> test = head;

            while (test!=null){

                System.out.println(test.data);
                test = test.next;

            }

        }
        
    }
    
    Node<Integer> insertAtPosition(int pos,Node<Integer> head,int data){

        Node<Integer> newnode = new Node<>(data);
        if(head==null){
            System.out.println("Empty LL");
            return head;
        } else if (head.next==null && pos==1) {

            head.next =  newnode;
            return head;
        }else{

            Node<Integer> temp = head;
            int count = 0;

            while (temp!=null && count<pos){

                if(count == pos-1){
                    newnode.next=temp.next;
                    temp.next = newnode;
                    break;
                }

                temp = temp.next;
                count++;
            }

        }

        return head;




    }
    

    public static void main(String[] args) {

        Temp temp = new Temp();
       Node<Integer> head = temp.insertData();

       temp.print(head);
       
       head = temp.insertAtPosition(2,head,8);
        temp.print(head);

    }
}
