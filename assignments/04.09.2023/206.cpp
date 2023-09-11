
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        ListNode* d = NULL;
        ListNode* now = head;

        while(now != NULL){
            ListNode* forward = now->next;
            now->next = d;
            d = now;
            now = forward;
        }

    return d;

    }
};