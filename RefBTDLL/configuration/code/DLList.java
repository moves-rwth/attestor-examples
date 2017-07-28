
public class DLList {


    private DLList nextAlt;
    private DLList prevAlt;
    
    public DLList(){
        this.nextAlt = null;
        this.prevAlt = null;
    }
    
    public DLList(DLList cur) {
    
        this.nextAlt = cur;
        this.prevAlt = null;
        cur.prevAlt = this;
    }
    
    public static DLList traverse(DLList l) {
    
        while(l.nextAlt != null){
        
            l = l.nextAlt;
        }
        
        return l;
    }
    
    public static DLList buildList(){
        DLList list = new DLList();
        for( int i = 0; i < 10; i++ ){
            list = new DLList( list );
        }
        return list;
    }
    
    public static void main(String[] args) {
    
        DLList head = buildList();
        traverse(head);
    }
    
}
