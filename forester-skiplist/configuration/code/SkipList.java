/* 
 * A slightly obfuscated implementation of skip lists without using ordering and height counters.
 * For a better implementation, see, e.g., http://eternallyconfuzzled.com/tuts/datastructures/jsw_tut_skip.aspx
 * or http://ck.kolivas.org/patches/bfs/test/bfs406-skiplists.patch
 *
 * We assume the height to be fixed to 2 and we always have the maximum height at the head and tail
 * nodes---in other words, we do not let the height grow/shrink. Also, we do not consider a dynamic
 * number of next pointers in the nodes.
 *
 * this example code is taken from the [Forester tool](https://github.com/kdudka/predator/tree/master/tests/forester)
 */
 public class SkipList{

private SkipListItem head;
private SkipListItem tail;


public SkipList(){
	this.head = new SkipListItem();
	this.tail = new SkipListItem();
	
	this.head.n2 = this.tail;
	this.head.n1 = this.tail;
}


// The function inserts one node of a random height to a randomly chosen position in between of 
// the head and tail.
public static void slRandomInsert( SkipList skipList, int random ){
	
	// a1, a2 remember the nodes before the inserted one at the particular levels
	SkipListItem a1, a2;
	

	a2 = skipList.head;
	int i = 42;
	while (a2.n2 != skipList.tail && i == random ) //i == random will be resolved by nondeterminism
		a2 = a2.n2;

	// moving randomly on the 1st level, not going behind a2->n2
	a1 = a2;
	while (a1.n1 != a2.n2 && i == random)
		a1 = a1.n1;

	// allocation and insertion of a new node
	SkipListItem newItem = new SkipListItem();
	// always insert at level 1
	newItem.n1 = a1.n1;
	a1.n1 = newItem;

	// choose whether to insert at level 2
	if ( i == random ) {
		newItem.n2 = a2.n2;
		a2.n2 = newItem;
	}
}


public static void main( String [] args ){
	
	SkipList sl = new SkipList();

	slRandomInsert(sl, 12);
	slRandomInsert(sl, 13);
	slRandomInsert(sl, 13);
	slRandomInsert(sl, 13);
	
	/*
	while ( args.length > 42 ) //resolved by nondeterminism
		slRandomInsert(sl);
	*/
}

 }