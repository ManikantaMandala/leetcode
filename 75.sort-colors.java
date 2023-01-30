/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        // This is just a sorting function so we can use only sorting technique
        // Arrays.sort(nums);
        // Bubble Sort: popping of the max element of the array for every iteration.
        // TC:O(N^2),SC:O(1);
        int size= nums.length;
        // for(int i=0;i<size;i++){
        //     for(int j=0;j<size-i;j++){
        //         if(nums[j]>nums[j+1]){
        //             nums[j+1]=swap(nums[j],nums[j]=nums[j+1]);
        //         }
        //     }
        // }
        //Quick sort: divide array into two subarrays and sort the two subarrays and combine them by sorting 
        //TC:O(NlogN),SC:O(N);
        // mergeSortDivide(nums,0,size-1);
        // keep the track of 0's 1's 2's
        int low=0,mid=0,high=size-1;
        while(mid<=high){
            if(nums[mid]==0){
                //swap low and mid 
                //and increment both
                nums[mid]=swap(nums[low],nums[low++]=nums[mid++]);
            }
            if(nums[mid]==1){
                //increment mid
                mid++;
            }
            if(nums[mid]==2){
                //swap high and mid
                //and decrement high
                nums[mid]=swap(nums[high],nums[high--]=nums[mid]);
            }
        }
        
    }
    // public static void mergeSortDivide(int[] nums,int left,int right){
    //     if(left>=right) return;
    //     int mid= left+(right-left)/2;
    //     mergeSortDivide(nums,left,mid);
    //     mergeSortDivide(nums,mid+1,right);
    //     mergeSortConquer(nums,left,mid,right);
    // }
    // public static void mergeSortConquer(int[] nums,int left,int mid,int right){
    //     int[] mergeSortedArray= new int[right-left+1];
    //     int index1=left,index2=mid+1,x=0;
    //     while(index1<=mid&&index2<=right){
    //         if(nums[index1]<=nums[index2]){
    //             mergeSortedArray[x++]=nums[index1++];
    //         }
    //         else{
    //             mergeSortedArray[x++]=nums[index2++];
    //         }
    //     }
    //     while(index1<=mid){
    //         mergeSortedArray[x++]=nums[index1++];
    //     }
    //     while(index2<=right){
    //         mergeSortedArray[x++]=nums[index2++];
    //     }
    //     for(int i=0,j=left;i<mergeSortedArray.length;i++,j++){
    //         nums[j]=mergeSortedArray[i];
    //     }
    // }
    public static int swap(int x, int y){
        return x;
    }
}
// @lc code=end

