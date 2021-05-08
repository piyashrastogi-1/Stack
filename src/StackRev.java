import java.util.Scanner;
public class StackRev 
{
    int arr[];
    int top=0;
    StackRev()
    {
        arr=new int[5];
        top=-1;
    }
    void push()
    {
        if(top==arr.length-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Enter Data");
            Scanner sc = new Scanner(System.in);
            int data=sc.nextInt();
            top=top+1;
            arr[top]=data;
            System.out.println("Data Inserted");
            
        }
    }
    void pop()
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
    }
    void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[])
    {
        StackRev obj=new StackRev();
        
        while(true)
        {
           
            
            System.out.println("\nEnter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for traverse");
            System.out.println("Enter 4 for exit\n");
            System.out.println("Enter your choice\n");
            
            Scanner in =new Scanner(System.in);
            int ch=in.nextInt();
            
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
