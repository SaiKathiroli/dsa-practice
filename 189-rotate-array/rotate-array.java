/*
Best Run-Time Algorithm:
1. REVERSE THE ENTIRE ARRAY
2. REVERSE TILL K-1 FROM 0
3, REVERSE TILL N-1 FROM K
*/
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int i=0;
        int j=n-1;
        rotate(nums,0,n-1);
        rotate(nums,0,k-1);
        rotate(nums,k,n-1);

        
    }
    public static void rotate(int arr[],int i,int j){

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
}