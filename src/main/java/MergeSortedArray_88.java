import java.util.Arrays;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m==0) {
            n--;
            while (n>=0) {
                nums1[n] = nums2[n];
                n--;
            }
            return;
        }

        n--;
        m--;
        while (n >= 0 && m >= 0) {
            if (nums2[n] >= nums1[m]) {
                nums1[m + n+1] = nums2[n];
                n--;
            } else {
                nums1[m + n+1] = nums1[m];
                m--;
            }

        }

        while (n>=0) {
            nums1[n] = nums2[n];
            n--;
        }

    }
}
