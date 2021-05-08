import java.util.Scanner;
public class StackExample1 
{
    int arr[];
    int top;
    
    StackExample1()
    {
        arr=new int[5];
        top=-1;
    }
    void push()//insert
    {
        if(top==4)
        {
            System.out.println("Stcak is full");
        }
        else
        {
            System.out.println("Enter Data");
            Scanner in= new Scanner(System.in);
            int data =in.nextInt();
            
            top= top+1;
            arr[top]=data;
            
            System.out.println("Data inserted");
            
        }
        //System.out.println("push fn is working");
    }
    void pop()//delete
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Deleted element :" + arr[top]);
            top=top-1;
        }
        //System.out.println("pop fn is working");
    }
    void traverse()//view
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i =top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
        //System.out.println("traverse fn is working");
    }
    public static void main(String args[])
    {
        StackExample1 obj = new StackExample1();
 
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
