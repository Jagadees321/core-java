package leetcode;

import java.util.Arrays;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];

        // Calculate left products
        int lp = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = lp;
            lp *= nums[i];
          // System.out.println(leftProducts[i]);
        }
        //System.out.println(Arrays.toString(leftProducts));
        // Calculate right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProducts[i] = rightProduct;
            rightProduct *= nums[i];
        }
        System.out.println(Arrays.toString(rightProducts));
        // Calculate the final result
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }
    public static int[] p2(int[] a) {
    	int total=1;
    	for(int b:a) {
    		total*=b;
    	}
    	for(int i=0;i<a.length;i++) {
    		a[i]=total/a[i];
    	}
    	return a;
    }

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();

        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.println(Arrays.toString(result1)+"  hello  "); // Output: [24, 12, 8, 6]
        System.out.println(Arrays.toString(p2(nums1)));
//        int[] nums2 = {-1, 1, 0, -3, 3};
//        int[] result2 = solution.productExceptSelf(nums2);
//        System.out.println(Arrays.toString(result2)); // Output: [0, 0, 9, 0, 0]
        String a="";
        System.out.println(a.length());
    }
}

