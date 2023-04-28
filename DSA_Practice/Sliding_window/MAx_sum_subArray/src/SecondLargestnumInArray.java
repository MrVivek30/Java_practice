public class SecondLargestnumInArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
//        System.out.println(max);
        int max2=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==max){
                continue;
            }
            if(arr[i]>max2){
                max2=arr[i];
            }if(arr.length==2){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(max2);
    }
}
