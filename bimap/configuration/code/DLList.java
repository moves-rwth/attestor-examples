
public class DLList {


    private DLList next;
    private DLList prev;
    int key;
    
    public DLList(DLList next, DLList prev, int key) {
    
        this.next = next;
        this.prev = prev;
        this.key = key;
    }
    
    public static DLList traversal(DLList l) {
    
        l = l.next;
        DLList x = l;
        l = l.next;
        
        return x;
    }
    
    public static DLList search(DLList l, DLList r, int key) {
    
        while(l.key != key && r.key != key && l.next != null && r.next != null) {
        
            l = l.next;
            r = r.next;
        }
        
        if(l.key == key) {
            return l;
        } else if(r.key == key) {
            return r;
        }
        
        return null;
    }
    
    public static DLList insert(DLList l, DLList r, int key, int value) {
    
        while(l.next != null && r.next != null) {
            l = l.next;
            r = r.next;
        }
        
        DLList n = new DLList(null,l,42);
        l.next = n;
        l.key = key;
        
        DLList p = new DLList(null,r,17);
        r.next = p;
        r.key = value;
        
        return n;
        
    }
    
    public static boolean delete(DLList l, DLList r, int key, int value) {
    
        while(l.next != null && r.next != null) {
        
            if(l.key == key && r.key == value) {
            
                deleteNode(l);
                deleteNode(r);
                return true;
            }
        
            l = l.next;
            r = r.next;
        }
        
        return false;
    }
    
    private static void deleteNode(DLList l) {
    
        DLList lp = l.prev;
        if(lp != null) {
            lp.next = l.next;
        }
        
        DLList ln = l.next;
        if(ln != null) {
            ln.prev = l.prev;
        }
    }
    
    
    
    public static void main(String[] args) {
    
        traversal(new DLList(null, null, 42));
    }
    
}
