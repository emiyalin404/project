import java.util.ArrayList;

public class listnoded {
    int val;
    ListNode next;
    public listnoded(){}
    public listnoded(int val){
        this.val = val;
    }
    public listnoded(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public static void main(String[] args){
        // ListNode l1=new ListNode(2);
        // ListNode l2=new ListNode(3);
        // ListNode l3=new ListNode(4,l2);
        // ListNode l4=new ListNode(1,l3);
        // ListNode l5=new ListNode(2,l1);
                   
        //     ListNode ln2 = l4.next;
        //     while (ln2 != null) {
        //         System.out.print(ln2.val + ", ");
        //         ln2 = ln2.next;
        //     }
        // System.out.print(l4.val + ", ");
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(3,l1);
        ListNode l3=new ListNode(4,l2);
        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(3,l4);
        ListNode l6=new ListNode(1,l5);
        ArrayList<Integer> list=new ArrayList<>();
        ListNode aa= addTwoNumbers(l3,l6);
        int count=0;
        while (aa != null) {
            list.add(count,aa.val);
            aa=aa.next;
            count+=1;        
            }
        System.out.println(aa);

        // ListNode l2[]={
        //     new ListNode(5,
        //     new ListNode(6,
        //     new ListNode(4)))            
        // };
    //     ListNode aa=addTwoNumbers(l1,l2);}

    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}

