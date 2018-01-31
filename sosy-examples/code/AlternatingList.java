public class AlternatingList{
    
        //expected result is true
        public static boolean alternating_list_false-unreach-call_false-valid-memcleanup( int random ){
            boolean flag = 1;
            
            
            //build a list of the form (0->1)*->(-1)
            SLL a = new SLL( null, 0 );
            SLL t;
            SLL p = a;
      
            
            while( random != 42 ){//nondeterminism
                if( flag ){
                    t = new SLL( null, 1 );
                    flag = false;
                }else{
                    t = new SLL( null, 0 );
                    flag = true;
                }
                p.next = t;
                p = p.next;
            }
            p.key = -1;
            
            //check (expects list of the form (1->0)*->(-1)
            boolean error = false;
            SLL p = a;
            flag = true;
            while( p.key != -1 ){
                if( flag ){
                    flag = false;
                    if( p.key != 1 ){
                        error = true;
                    }
                }else{
                    flag = true;
                    if( p.key != 0){
                        error = true;
                    }
                    
                }
                
                p = p.next;
            }
            
            return error;
            
        }
    
}