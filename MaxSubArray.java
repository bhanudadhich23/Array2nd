import java.util.*;
public class MaxSubArray{

    public static int MaxSubArray(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                  int sum=0;
                  for(int k=i;k<=j;k++){
                         sum = sum+arr[k];
        
                  }

                  if(sum>maxSum){
                    maxSum=sum;
                  }

            }

        }
        return maxSum;
    }
    public static void main(String args[]){
           int array[]={1,2,3,4};
          int result = MaxSubArray(array);
          System.out.print(result);
    }
}