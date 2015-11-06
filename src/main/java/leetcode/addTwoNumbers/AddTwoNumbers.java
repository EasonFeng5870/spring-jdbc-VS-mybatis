package leetcode.addTwoNumbers;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		l1.next = new ListNode(9);
		
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(20);
		l2.next.next = new ListNode(9);
		
		ListNode res = addTwoNumbers(l1, l2);
		System.out.print(res.val);
		while (res.next != null) {
			System.out.print(" --> " + res.next.val);
			res = res.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null){
			return null;
		}
		
		ListNode k = new ListNode();
		ListNode ln = k;
		
		int carry = 0;
		ListNode last = null;
		
		while (l1 != null || l2 != null) {
			
			int sum = 0;
			if(l1 != null){
				sum += l1.val;
			}
			if(l2 != null){
				sum += l2.val;
			}
			
			if(carry > 0){
				sum += carry;
				carry = 0;
			}
			
			if(sum >= 10){
				carry = sum /10;
				sum %= 10;
			}
			
			k.next = new ListNode(sum);
			
			if(l1 != null && l2 != null && l1.next == null && l2.next == null) {
				last = k.next;
				break;
			} else {
				if(l1 != null){
					l1 = l1.next;
				}
				if(l2 != null){
					l2 = l2.next;
				}
				
				k = k.next;
				last = k;
			}
			
			
			
		}
		
		if(carry > 0){
			last.next = new ListNode(carry);
		}
		
		return ln.next;
	}

}
