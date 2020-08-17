
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p = l1;
		
		int l1sum = 0;
		
		int i = 0;
		while (p!=null) {
			l1sum = p.val*(int)(Math.pow(10, i)) + l1sum;
			System.out.println("This is being added to l1sum: "+String.format("%.0f", (double)(p.val*(Math.pow(10, i)))));
			p = p.next;
			i++;
		}
		ListNode q = l2;
		int l2sum = 0;
		int j =0;
		while (q!=null) {
			l2sum = q.val*(int)(Math.pow(10, j)) + l2sum;
			System.out.println("l2sum is: "+l2sum);
			q = q.next;
			j++;
		}
		double sum = l1sum + l2sum;
		System.out.println(sum);
		ListNode headToReturn = new ListNode((int) (sum%10));
		ListNode iterator = new ListNode();
		iterator = headToReturn;
		sum = Math.floor(sum/10);
		int count = 0;
		long res = 0;
        while (sum != 0) {
        	iterator.next = new ListNode((int) (sum%10));
        	sum = sum/10;
        	iterator = iterator.next;
        }
        return headToReturn;
	}
}
