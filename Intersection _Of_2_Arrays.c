int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int* result = (int*)malloc(sizeof(int) * (nums1Size < nums2Size ? nums1Size : nums2Size));  //If nums1Size is less than nums2Size, it chooses nums1Size as the size of the result array; otherwise, it chooses nums2Size as the size of the result array. Essentially, it selects the smaller of the two sizes to ensure that the result array doesn't have unnecessary extra space.


    int resultSize = 0;

    for (int i = 0; i < nums1Size; i++) {
        for (int j = 0; j < nums2Size; j++) {
            if (nums1[i] == nums2[j]) {
                int found = 0;
                for (int k = 0; k < resultSize; k++) {
                    if (result[k] == nums1[i]) {
                        found = 1;
                        break;
                    }
                }
                if (!found) { //checks whether the current element from nums1 (nums1[i]) is not already present in the result array (result). If it's not found (!found), meaning it's unique
                    result[resultSize++] = nums1[i];
                }
                break;
            }
        }
    }

    *returnSize = resultSize;
    return result;
}
