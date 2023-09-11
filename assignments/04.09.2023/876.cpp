
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
       
        ListNode* count = head;
        int count1 =1;
        while(count->next != NULL){
            count = count->next;
            count1++;
        }
        int i=0;
         ListNode* startn = head;
        while(i != count1/2){
            startn =startn->next;
            i++;
        }
        return startn;
    }
};