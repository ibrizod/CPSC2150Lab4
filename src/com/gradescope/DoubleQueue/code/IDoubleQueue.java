package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: that the queue is created in an empty state
 *
 *@defines: a queue that allows elements to be both added and removed from both ends
 *
 *@constraints: elements added should be non null and
 * removing on an empty queue should return null
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     * Removes and returns a value from the queue
     *
     *@return the value of the element removed from the queue
     *
     *@pre the queue is not empty
     *
     *@post the head of the queue is removed and returned . Length -=1
     *
     */
    public Double dequeue();

    /**lengthContract
     * Returns the number of elements inside the queue
     *
     *@return the number of elements in a queue
     *
     *@pre The queue is initialized properly
     *
     *@post the length returned accurately represents the number of elements in the queue
     * length >= 0
     *
     */
    public int length();

    /**toStringContract
     * Converts the queue into a string
     *
     *@return a string representation of the elements in a queue
     *
     *@pre the queue is initialized properly
     *
     *@post the returned string accurately represents the elements in the queue
     *
     */
    public String toString();
}
