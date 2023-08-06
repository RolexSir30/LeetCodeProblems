package LeetCodeJava;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

import java.util.List;

//Notice that the solution set must not contain duplicate triplets.


class Solution {
	
	
	
	public static void main(String[] args) {
		int[] intArray = new int[]{ 1,2,3,4,-90,6,7,-7,9,10,0,-9,6,-8,-2,-5 };		
		threeSum(intArray);
		
	}
	
	
	
	
    public static List<List<Integer>> threeSum(int[] nums) {
        int size=nums.length;
        List<Integer> nombres;
        //int triplet_solution=new int[3];
        for(int i=0;i<size;i++){
            for(int j =i+1;j<size;j++){
                for(int k=j+1;k<size;k++){
                        if(nums[i] + nums[j] + nums[k] == 0){
                            
                            System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                        }
                            
                }
                                
                }
                
                }
		return null;
    }
}
