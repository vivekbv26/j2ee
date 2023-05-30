package second_java;
import java.util.*;
class BookCompare implements Comparator<BOOK>
{
    public int compare(BOOK b1, BOOK b2)
    {
        if(b1.price>b2.price)
        {
            return 1;
        }
        else if(b1.price==b2.price)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
} 

