// in place Recursive
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m + n <= 0) return;
        if (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                merge(nums1, m - 1, nums2, n);
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                merge(nums1, m, nums2, n - 1);
            }
        } else if (m > 0) {
            nums1[m + n - 1] = nums1[m - 1];
            merge(nums1, m - 1, nums2, n);
        } else if (n > 0) {
            nums1[m + n - 1] = nums2[n - 1];
            merge(nums1, m, nums2, n - 1);
        }
    }
}