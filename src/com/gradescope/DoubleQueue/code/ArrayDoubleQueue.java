/**
 * Team Members:
 * Adam Smith
 * Markus Elmore
 * Garrett Boling
 * Ivan Brizo-Diaz
 */


package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue implements IDoubleQueue
{
    private Double[] queue;
    private int queueMaxSize;

    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        this.queueMaxSize = maxSize;
        this.queue = new Double[queueMaxSize];

    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if(queue[0]==null) {
            queue[0] = val;
            return;
        }
        for (int i =0; i< this.queueMaxSize-2; i++){
            if (queue[i+1]==null){
                queue[i+1] = val;
                return;
            }
        }
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {
        Double retValue = queue[0];
        // Shift all elements to the left
        for (int i = 0; i < queueMaxSize - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[queueMaxSize - 1] = null; // Set the last element to null
        return retValue;
    }

    @Override
    public int length()
    {
        if (queue[0] == null)
            return 0;
        int count = 1;
        for (int i = 0; i < this.queueMaxSize-2; i++){
            if (queue[i+1] != null){
                count ++;
            }
        }
        return count;
    }

    public String toString()
    {
        String ret = "";
        for(Double d : queue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public Double[] getQueue()
    {
        return this.queue;
    }
}
