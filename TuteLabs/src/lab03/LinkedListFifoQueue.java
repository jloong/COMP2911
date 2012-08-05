package lab03;

import java.util.LinkedList;

public class LinkedListFifoQueue extends AbstractQueue implements FifoQueue
{
    private LinkedList <Object> elements = new LinkedList <Object> ();

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void unsafeAdd(Object x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object unsafeGet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object unsafeRemove() {
		// TODO Auto-generated method stub
		return null;
	}
    
    // TODO implement inherited methods here

    
    // Use eclipse commands to generate code templates:
    // Either
    //   Source > Override/Implement Methods ...
    // or
    //   use QuickFix hint from eclipse at the compile error for the class header
}
