import java.util.Scanner;
class lsearch{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array");
        int i=0;
        int n=in.nextInt();
        int[] arr= new int[n];
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        System.out.println("enter the key to find ");
        int key=in.nextInt();
        int index=lsearch(arr,key);
        
        if(index<0)
            System.out.println("element is not found ");
            else
            System.out.println("element is found at index "+index);
    }
    static int lsearch(int[] array,int num)
       {
           for(int i=0;i<array.length;i++)
              if(num==array[i])
                  return i;
         return -1;
       }
}
