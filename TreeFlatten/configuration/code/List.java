public class List<E>{
	
	private Element head = null;
	private Element tail = null;

	public void add(E value){
		Element tmp = new Element();
		tmp.value = value;
		
		if(tail == null){
			tail = tmp; 
			head = tmp;
		}else{
			tail.next = tmp;
			tail = tail.next;
		}
	}
	
	public void push(E value){
		Element tmp = new Element(); 
		tmp.next = head;
		tmp.value = value;
		head = tmp;
		if(tail == null)
			tail = head;
	}
	
	public E pop(){
		Element tmp = head; 
		head = head.next;
		if(head == null)
			tail = null;
		return tmp.value;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public static void main(String[] args) {
        Data data = new Data();
        
        List<Data> result = new List<Data>();
        
        result.push(data);
    }
	
}