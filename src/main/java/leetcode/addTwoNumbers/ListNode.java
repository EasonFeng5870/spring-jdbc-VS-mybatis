package leetcode.addTwoNumbers;

public class ListNode implements Cloneable {
	
	int val;
	
	ListNode next;
	
	public ListNode() {}
	
	public ListNode(int x){
		val = x;
	}
	
	public Object clone(){
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("LinkNode val= " + val);
		ListNode aNext = (ListNode)next.clone();
		while(aNext != null){
			sb.append(" - > " + next.val);
			aNext = aNext.next;
		}
		return sb.toString();
	}
	
}
