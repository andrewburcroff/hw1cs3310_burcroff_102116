package burcroffLinkedListPackage;

public class burcroffLinkedListClass {
	
	private int n =0;
	private burcroffNodeClass head = null;
	private burcroffNodeClass tail;
	
	public void decreasing() {
		
		for(int i =0; i < length();i++){
		burcroffNodeClass temp = head;
		while(temp.next !=null){
			//System.out.println(temp.value);
			if(temp.value < temp.next.value){
				swap(temp);
			}
			temp = temp.next;
			if (temp == null){
				break;
			}
		}
		}
	}
	
	public int length(){
		burcroffNodeClass temp = head;
		int total =0;
		while(temp != null){
			total++;
			temp = temp.next;	
		}
		return total;
	}
	
	
	public void swap(burcroffNodeClass temp){
		//intialize a, b,c,d
		burcroffNodeClass a = temp.previous;
		burcroffNodeClass b = temp;
		burcroffNodeClass c = temp.next;
		burcroffNodeClass d = temp.next.next;
		//case 1 where temp not equal to head and c is not null
				//Connect a to c
				//Connect c to b
				// connect b to d
		if(temp!= head && d !=null){
			a.next = c;
			c.previous = a;
			c.next = b;
			b.previous = c;
			b.next = d;
			d.previous = b;
		}
		//case 2 where temp equals to head and c not null
				//connect c to b
				//connect b to d
				//head to c
		else if(temp ==head && d != null){
			c.next = b;
			b.previous = c;
			b.next = d;
			d.previous = b;
			head = c;
		}
		//case 3 where c of next is null and temp  not equal to head
		//conect a to c
		//connect c to b
		else if(c.next == null && temp != head){
			a.next = c;
			c.previous = a;
			c.next = b;
			b.previous = c;
			b.next = null;
			//temp = d;
		}
		//case 4 temp equals to head and c of next is null
		// conect c to b
		//head to c
		else if(temp ==head && c.next ==null){
			c.next = b;
			b.previous = c;
			b.next = null;
		}
	}

	public void increasing() {
		//System.out.println(length());
		for(int i =0; i < length();i++){
		burcroffNodeClass temp = head;
		while(temp.next !=null){
			if(temp.value < temp.next.value){
				swap(temp);
			}
			temp = temp.next;
			if (temp == null){
				break;
			}
		}
		}
    }
	
	public void printList() {
		//System.out.println(length());
		burcroffNodeClass temp;
		temp = head;
		while(temp != null){
			System.out.println(temp.value);
			temp = temp.next;	
		}
	}

	public boolean search() {
		int total = 0;
		burcroffNodeClass temp = head;
		while(temp != null){
			if(temp.value >= 50){
				total++;
			}
			temp = temp.next;	
		}
		//System.out.println(total);
		if (total >= 5) {
			return true;
		} else
			return false;	
	}

	public void delete(int index) {
		int counter =0;
		burcroffNodeClass temp = head;
		while(temp != null){
			if(counter == index){
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
			}
			temp = temp.next;
			counter++;
		}
	}
	
	public void addition(int value, int place){
		burcroffNodeClass temp = head;
		int counter =0;	
		burcroffNodeClass c = new burcroffNodeClass(value);
		while(temp!= null){	
			if (counter == place){
				burcroffNodeClass a = temp;
				burcroffNodeClass b = temp.previous;
				if(b == null){
					c.previous = b;
					a.previous = c;
					head = c;
				}
				else if(b != null && a != null){
					a.previous = c;
				c.next = a;
				b.previous = c;
				b.next = c;	
				}
				else if(a == null){
					b.next =c;
					c.previous =b;
				}				
			}
			temp = temp.next;
			counter++;
		}
		
	}

	public void add(int value) {
		if(head == null){
			head = new burcroffNodeClass(value);
			head.next = null;
			head.previous = null;
		}
		else{
			burcroffNodeClass temp;
			temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new burcroffNodeClass(value);
			temp.next.previous = temp;
		}
	}

}
