package leetcode;

public class median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2};
		int[] nums2= {3,4};
		 int[] c=new int[nums1.length+nums2.length];
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<nums1.length && j<nums2.length){
	            if(nums1[i]<nums2[j]){
	                c[k]=nums1[i];
	                i++;
	                k++;
	            }
	            else{
	                c[k]=nums2[j];
	                k++;
	                j++;
	            }
	        }
	        if(i<nums1.length)c[k++]=nums1[i++];
	        if(j<nums2.length) c[k++]=nums2[j++];
	        double n=0;
	        if(c.length%2!=0){
	            n=c[c.length/2];
	            System.out.println("j");
	        }
	        else{
	            if(c.length==2) {
	            	n=c[0]+c[1];
	            	n=n/2;
	            }
	            else {
	            	System.out.println(c[(c.length/2)-1]);
		            n=(c[(c.length/2)-1]+c[(c.length/2)]);
		            n=n/2;
	            }
	        }
	      System.out.println(n);
	        
	    }

	

}
