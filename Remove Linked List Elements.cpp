/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* removeElements(struct ListNode* head, int val) {
    // Handle the case where the head nodes have the value to remove
   while(head!=NULL && head->val==val){
    struct ListNode *temp=head; // Save the current head
    head=head->next; // Move the head to the next node
    free(temp);  // Free the removed node

   }

   // Initialize the current and previous pointers
   struct ListNode *curr=head;
   struct ListNode *prv=NULL;

    // Traverse through the list
   while(curr!=NULL){
    if(curr->val==val){
        // Remove the current node
        prv->next=curr->next;  // Skip the current node
        free(curr);   // Free the memory of the current node
        curr=prv->next;  // Move to the next node
    }else{
         // Move to the next node
        prv=curr;
        curr=curr->next;
    }
   }

   //return the header
   return head;
}
