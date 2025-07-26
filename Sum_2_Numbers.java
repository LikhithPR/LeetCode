import java.util.*;
public class Sum_2_Numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter te total number of elements :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        } 
        System.out.println("Enter the target :");
        int target=sc.nextInt();
        int arr2[]=new int[2];
        twoSum(arr,target,arr2);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }
    public static void twoSum(int[] arr, int target,int arr2[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    arr2[0]=arr[i];
                    arr2[1]=arr[j];
                }
            }
        }
    }
}

