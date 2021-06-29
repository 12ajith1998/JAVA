import java.util.*;
class LinearSearchArray {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9,10};
    int flag=0;
    Scanner sc=new Scanner(System.in);
    int item=sc.nextInt();
    for(int i=0;i<10;i++)
    {
        if(arr[i]==item)
        {
            flag=i+1;
            break;
        }else
        {
            flag=0;
        }
    }
        if(flag!=0)
        
        {
            System.out.println("Item found:"+flag);
        }else
        {
            System.out.println("Item not found");
        }
    
    }
}
