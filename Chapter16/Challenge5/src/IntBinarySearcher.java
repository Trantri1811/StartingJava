/**
 * Author: Andrew Laing
 * Email:  parisianconnections@gmail.com
 * Date:   20/01/2017.
 */
public class IntBinarySearcher
{
    public static int search(int[] array, int value)
    {
        int first;          // first element of array being searched
        int last;           // last element ...
        int middle;         // mid point of search
        int position;       // position of search value
        boolean found;      // flag

        // set the initial values
        first = 0;
        last = array.length-1;
        position = -1;          // sentinel value
        found = false;

        while(!found && first <= last)
        {
            // calculate mid point
            middle = (first + last)/2;

            if(array[middle] == value)
            {
                found = true;
                position = middle;
            }
            // if the value is in the lower half
            else if(array[middle] > value)
            {
                last = middle -1;
            }
            // else if the value is in the upper half
            else
            {
                first = middle + 1;
            }
        }

        // return the position of the value or the sentinel
        return position;
    }
}

