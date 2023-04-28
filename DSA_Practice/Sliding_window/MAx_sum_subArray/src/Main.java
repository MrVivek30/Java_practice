import javax.management.Query;

public class Main {

    public  static  int findMaxsumArray(int [] arr,int k){

     int    max=0;
        for (int i=0;i<k;i++){
            max+=arr[i];
        }
int c_sum=max;
        for(int i=k;i<arr.length;i++){
            c_sum=c_sum-arr[i-k]+arr[i];
            max=Math.max(max,c_sum);
        }
        return max;
    }
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println(findMaxsumArray( new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0},3));


        Query query="Select * from customers where order =? ";

    }




}