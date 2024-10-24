import java.util.*;
public class TrappingWater{
    //width always is equal to 1 for each bar;
    // leftmax ,  rightmax;
    //waterLevel = Min(leftmax,rightmax);
    //trappedWter = waterLevel - height;


    public static void TotalWater(int height[]){
    //auxillary arrays
    int length = height.length;
     int rightMax[] = new int[length]; 
    rightMax[length-1] = height[length-1];
    int leftMax[] = new int[length];
    
    //for leftMax array:-
    leftMax[0] = height[0];
        
     for(int i=1;i<length;i++){
                      leftMax[i] = Math.max(leftMax[i-1],height[i]);
      }

    //for rightMax array:-
   
    for(int j=length-2;j>=0;j--){
        rightMax[j] = Math.max(height[j],rightMax[j+1]);
    }   

   int trappedWater = 0;
   int TotalWater =0;
   int waterLevel=0;
   for(int i=0;i<length;i++){
     waterLevel = Math.min(rightMax[i],leftMax[i]);
    trappedWater = waterLevel - height[i];
    TotalWater = TotalWater + trappedWater;
   }


    System.out.print("the total water ="+TotalWater);


    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        TotalWater(height);
    }
}