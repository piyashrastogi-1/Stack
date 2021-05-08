import java.util.Scanner;

 class Node
{
    int data;
    Node next;
}
public class StackExampleLinkedList 
{
    Node top;
    
    StackExampleLinkedList()
    {
        top=null;
    }
    void push()//insert
    {
        System.out.println("Eneter data");
        Scanner in = new Scanner(System.in);
        int newitem=in.nextInt();
        
        Node newnode=new Node();
        newnode.data=newitem;
        newnode.next=top;
        
        top=newnode;
        System.out.println("Data inserted");
        //System.out.println("push fn is working");
    }
    void pop()//delete
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            

        }
        else
        {
            System.out.println("delted element :"+top.data);
            top=top.next;

        }
        //System.out.println("pop fn is working");
    }
    void traverse()//view
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(Node current=top; current!=null; current=current.next)
            {
                System.out.println(current.data);
            }
        }
        //System.out.println("traverse fn is working");
    }
    public static void main(String args[])
    {
        StackExampleLinkedList obj = new StackExampleLinkedList();
 
        while(true)
        {
            
            System.out.println("\nEnter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for traverse");
            System.out.println("Enter 4 for exit");
            
            System.out.println("\nEnter your choice");
            
            Scanner sc = new Scanner(System.in);
            int ch=sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
        
    }
}
 