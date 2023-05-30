package second_java;

import java.util.*;
class BOOK
{
    String title,author,publisher;
    double price;
    BOOK(String x, String y, String z,double p)
    {
        title=x;
        author=y;
        publisher=z;
        price=p;
    }
    public String toString()
    {
        return title+"    "+author+"   "+publisher+"   "+price;
    }
}

