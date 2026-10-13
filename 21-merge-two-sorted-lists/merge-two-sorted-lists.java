/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode i=list1 , j=list2;
       ListNode list3= new ListNode();
       if(i==null && j==null) return null;
       else if(i==null && j!=null){
        return j;
       }
       else if(j==null && i!=null){
        return i;
       }
       else if(i!=null && j!=null && i.val<j.val ){
        list3.val=i.val;
        i=i.next;
       }
       else{
        list3.val=j.val;
        j=j.next;
       }
       ListNode temp=list3;
       while(i!=null && j!=null){
        ListNode newnode = new ListNode();
        if(i.val<j.val){
            newnode.val=i.val;
            temp.next=newnode;
            temp=temp.next;
            i=i.next;
        }
        else{
            newnode.val=j.val;
            temp.next=newnode;
            temp=temp.next;
            j=j.next;
        }
       }
       while(i!=null){
        ListNode newnode = new ListNode();
        newnode.val=i.val;
        temp.next=newnode;
        temp=temp.next;
        i=i.next;
       }
       while(j!=null){
        ListNode newnode =new ListNode();
        newnode.val=j.val;
        temp.next=newnode;
        temp=temp.next;
        j=j.next;
       }
       return list3;
    }
}