
import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {
    public int[] plusOne(int[] digits) {

        int temp[] = new int[(digits.length)];

        for (int j = 0; j < digits.length; j++) {

            if (j != (digits.length - 1)) {
                temp[j] = digits[j];
            }

            if (j == (digits.length - 1)) {

                temp[j] = digits[j] + 1;

            }

        }
        return temp;

    }

    public int[] getConcatenation(int[] nums) {

        int j = 0;

        int temp[] = new int[2 * nums.length];
        for (int i = 0; i < 2 * nums.length; i++) {
            if (i < nums.length) {

                temp[i] = nums[i];

            }

            if (i >= nums.length) {
                temp[i] = nums[j];
                j++;
            }
        }
        return temp;
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int temp[] = new int[m + n];
        int i = 0; // pointer for nums1
        int j = 0; // pointer for nums2
        int k = 0; // pointer for temp

        // Merge both arrays in sorted order
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < m) {
            temp[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < n) {
            temp[k++] = nums2[j++];
        }

        return temp;
    }

    public String longestCommonPrefix(String[] strs) {

        String temp = " ";

        for (int i = 0; i < strs.length; i++) {

            for (int j = 0; j < strs[i].length(); j++) {

                char c = strs[i].charAt(i);
                char h = strs[i + 1].charAt(j);
                if (c == h) {

                    temp += c;

                }
            }
        }
        return temp;
    }

    public int maxProfit(int[] prices) {

        int min = prices[0];
        int start = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
                start++;

            }
        }
        int max = prices[start];
        for (int i = start + 1; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];

            }
        }
        int profit = max - min;

        if (profit < 0) {
            return 0;
        }
        return profit;
    }

    public int singleNumber(int[] nums) {

        int n1 = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    n1 = nums[j];
                }
            }
        }

        return n1;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }
            ListNode head = new ListNode();
            ListNode temp = head;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;

            }
            temp.next = (list1 == null) ? list1 : list2;
            return head.next;
        }

        public int[][] construct2DArray(int[] original, int m, int n) {

            int arr[][] = new int[m][n];
            for (int i = 0; i <= m; i++) {
                for (int j; j < n; j++)
                    arr[i][j] = original[i];
            }

            printArray(arr);
            return arr;
        }

        public static void main(String[] args) {

            Solution1 n = new Solution1();

            // int arr1 [] = {1,2,3,0,0,0};
            // int arr2 [] ={2,5,6};
            // n.printArray(n.getConcatenation(arr));
            // n.printArray(n.merge(arr1 ,3,arr2,0));
            int arr[] = { 4, 1, 2, 1, 2 };
            n.construct2DArray(arr, 2, 2);

            // test
            Solution1 s = new Solution1();
            int[] test = { 1, 2, 3 };
            int[] result = s.plusOne(test);
            // print result
        }
    }
}
