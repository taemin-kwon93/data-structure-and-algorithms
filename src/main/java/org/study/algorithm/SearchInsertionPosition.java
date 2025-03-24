package org.study.algorithm;

import java.util.*;

public class SearchInsertionPosition {
    public int searchInsert(int[] nums, int target) {
        int answer = Arrays.binarySearch(nums, target);
        return answer >= 0 ? answer : (answer * -1) - 1;
    }

    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid;
        }
        return low;    }
}
