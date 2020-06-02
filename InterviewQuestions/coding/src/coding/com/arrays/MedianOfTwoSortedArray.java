package coding.com.arrays;

import java.util.LinkedList;
import java.util.List;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int firstLength = nums1.length;
           int secondLength = nums2.length;
           List<Integer>list = new LinkedList<Integer>();
           int first =0;
           int second = 0;
           
           while(first<firstLength && second < secondLength){
           if(nums1[first]<nums2[second]){
               list.add(nums1[first]);
               first++;

   }else{
    list.add(nums2[second]);
               second++;
   }
               
   }
           while(first<firstLength)
           {
        	   
        	   list.add(nums1[first]);
        	   first++;
           }
           while(second<secondLength) {
        	   list.add(nums2[second]);
        	   second++;
           }
           if(list.size()%2==0){
       double result;
       double mid=list.get(list.size()/2);
       double midLeft = list.get((list.size()-1)/2);
       return (mid + midLeft)/2;
           }
           else{
               return list.get(list.size()/2);

           }
		//return 0.0;
           
       }
	

	public static void main(String[] args) {
		int num1[] = {1,3};
		int num2[] = {2};
		System.out.println(findMedianSortedArrays(num1,num2));
	}

}
