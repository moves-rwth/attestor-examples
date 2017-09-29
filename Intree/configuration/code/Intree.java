class Intree{
	
	Intree parent;
	
	public Intree(){
		this.parent = this;
	}
	
	public static Intree find(Intree elem){
		
		while(elem != elem.parent){
			elem = elem.parent;
		}
		
		return elem;
	}
	
	public static Intree union(Intree elem1, Intree elem2){
		Intree elem1Root;
		Intree elem2Root;
		
		elem1Root = find(elem1);
		elem2Root = find(elem2);
		
		elem1Root.parent = elem2Root;
		
		return elem2Root;
	}
	
	public static void main(String[] args) {
    
    }
	
	
}