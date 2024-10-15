/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
// A utility function to swap two elements
void swap(struct ListNode** a, struct ListNode** b) {
    struct ListNode* temp = *a;
    *a = *b;
    *b = temp;
}

// A helper function to heapify the tree rooted at index i
void heapify(struct ListNode** heap, int heapSize, int i) {
    int smallest = i; 
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < heapSize && heap[left]->val < heap[smallest]->val)
        smallest = left;

    if (right < heapSize && heap[right]->val < heap[smallest]->val)
        smallest = right;

    if (smallest != i) {
        swap(&heap[i], &heap[smallest]);
        heapify(heap, heapSize, smallest);
    }
}

// Function to build the min-heap
void buildHeap(struct ListNode** heap, int heapSize) {
    for (int i = (heapSize / 2) - 1; i >= 0; i--) {
        heapify(heap, heapSize, i);
    }
}

// Extract the root (minimum) element from the heap
struct ListNode* extractMin(struct ListNode** heap, int* heapSize) {
    struct ListNode* minNode = heap[0];
    heap[0] = heap[*heapSize - 1];
    (*heapSize)--;
    heapify(heap, *heapSize, 0);
    return minNode;
}

struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    if (listsSize == 0) {
        return NULL; // No lists
    }

    // Create a min-heap with all the first nodes of the k lists
    struct ListNode** heap = (struct ListNode**)malloc(sizeof(struct ListNode*) * listsSize);
    int heapSize = 0;

    // Add the first node of each non-empty list to the heap
    for (int i = 0; i < listsSize; i++) {
        if (lists[i] != NULL) {
            heap[heapSize++] = lists[i];
        }
    }

    // Handle edge case: if all lists are empty
    if (heapSize == 0) {
        free(heap);
        return NULL;
    }

    // Build the initial heap
    buildHeap(heap, heapSize);

    // Create a dummy node to make result list creation easier
    struct ListNode* dummy = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* current = dummy;

    while (heapSize > 0) {
        // Extract the smallest node from the heap
        struct ListNode* minNode = extractMin(heap, &heapSize);

        // Add the smallest node to the result list
        current->next = minNode;
        current = current->next;

        // If the extracted node has a next node, add it to the heap
        if (minNode->next != NULL) {
            heap[heapSize++] = minNode->next;
            buildHeap(heap, heapSize); // Rebuild heap after adding new node
        }
    }

    // Get the head of the merged linked list
    struct ListNode* mergedList = dummy->next;
    
    // Free allocated memory
    free(dummy);
    free(heap);

    return mergedList;
}
