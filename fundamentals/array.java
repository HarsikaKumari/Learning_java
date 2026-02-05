public class array {
    public static void main(String args[]) {
        // Loops
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        int abc = 23523;
        int rev = 0;
        int temp = abc;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println(rev);

        int n = 5;
        int fact = 1;
        do {
            fact *= n;
            n--;
        } while (n > 0);
        System.out.println(fact);

        // Arrays
        int arr[] = { 34, 53, 3, 53, 33, 98, 65 };
        int max = 0;
        int next_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                next_max = max;
                max = arr[i];
            } else if (arr[i] > next_max && arr[i] != max) {
                next_max = arr[i];
            }
        }
        System.out.println(next_max);

        int arr1[] = { 23, 45, 12, 67, 34, 89, 90 };
        int k = 3;
        while (k > 0) {
            int tem = arr1[arr1.length - 1];
            for (int i = arr1.length - 1; i > 0; i--) {
                arr1[i] = arr1[i - 1];
            }
            arr1[0] = tem;
            k--;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        int palin[] = { 1, 2, 3, 2, 1 };
        int last = palin.length - 1;
        boolean flag = false;

        for (int i = 0; i < last / 2; i++) {
            if (palin[i] == palin[last - i]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }

        int m = findMax(43, 54, 65, 75, 54, 334);
        System.out.println("The maximum nuumber is " + m);

        for (int i : twoSum(new int[]{3, 3}, 6)) {
            System.out.print(i + " ");
        }

        int deliciousness[] = {1,3,5,7,9};
        System.out.println("\nNumber of good meal pairs: " + countPairs(deliciousness));


        System.out.println("Median is: " + findMedianSortedArrays(new int[]{1,3}, new int[]{2, 4}));
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]+nums[j] == target && i!=j){
                    result[0] = i;
                    result[1] = j;
                    // break;
                }
            }
        }
        return result;
    }

    public static int countPairs(int[] deliciousness) {
        int count = 0;
        System.out.println("Size of array "+deliciousness.length);
        for(int i=0; i<deliciousness.length -1; i++){
            for(int j=i+1; j<deliciousness.length; j++){
                int sum = deliciousness[i] + deliciousness[j]; 
                if(sum > 0 && (sum & (sum - 1)) == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static int findMax(int... nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int arr[] = new int[size];
        int i=0;
        int j=0;
        int k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[k++] =  nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }

    while (i < nums1.length)
    {
        arr[k++] = nums1[i++];
    }

    while (j < nums2.length)
    {
        arr[k++] = nums2[j++];
    }

    double med;
    int mid = (0 + size) / 2;
    if(size%2 == 0){    
        med = (arr[mid] + arr[mid - 1]) / 2.00;
    }else{
        med = arr[mid];
    }

    return med;
    }
}
