package lab03;

public class FixedArrayFifoQueue extends AbstractQueue implements FifoQueue
{
    private final Object [] data = new Object [capacity];
    private int size = 0;
    private int indexForAdd = 0;
    private int indexForRemove = 0;
    
    protected boolean invariant ()
    {
        // capacity == data.length is known
        return inIndexRange (indexForAdd) && inIndexRange (indexForRemove)
               && (indexForAdd >= indexForRemove && size == indexForAdd - indexForRemove
                   || indexForAdd <= indexForRemove && size == data.length - indexForAdd + indexForRemove);
    }

    private boolean inIndexRange (int index)
    {
        return 0 <= index && index < data.length;
    }
    
    public FixedArrayFifoQueue (int capacity)
    {
        super (capacity);
    }

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
