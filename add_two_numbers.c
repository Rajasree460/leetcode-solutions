/*
Create a dummy node which is the head of new linked list.
Create a node curr, initialise it with dummy.
Initialize carry to 0.
Loop through lists l1 and l2 until you reach both ends, and until carry is present.
Set sum = l1.val+ l2.val + carry.
Update carry = sum/10.
Create a new node with the digit value of (sum%10) and set it to temp node’s next.
Advance both l1 and l2.
Return dummy’s next node.
*/

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummyHead = new ListNode(-1);
        ListNode* curr = dummyHead;
        ListNode* temp1 = l1;
        ListNode* temp2 = l2;
        int carry = 0;

        while(temp1!=NULL || temp2!=NULL){
            int sum = carry;
            if(temp1!=NULL) sum += temp1->val;
            if(temp2) sum += temp2->val;

            ListNode* newNode = new ListNode(sum%10);
            carry = sum/10;

            curr->next = newNode;
            curr = curr->next;

            if(temp1) temp1 = temp1->next;
            if(temp2) temp2 = temp2->next;
        }
        if(carry!=0){
            ListNode* newNode = new ListNode(carry);
            curr->next = newNode;
        }
        return dummyHead -> next;
    }
};
