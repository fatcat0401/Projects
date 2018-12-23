
/**
 * This class defines a structure of a pair and all neccessary methods
 *
 * Quang Tran 
 * 29393809
 * 
 */
import java.util.*;
import java.io.*;
public class Pair
{
    
    //the only varible is the list of two integers
    private int[] list;
    /**
     * Constructor for objects of class Pair
     */
    public Pair(int x, int y)
    {
        // initialise instance variables
        list = new int[2];
        list[0] = x;
        list[1] = y;
    }

    //set value for pair
    public void set(int x, int y)
    {
        // put your code here
        list[0] = x;
        list[1] = y;
    }
    
    //get value of this pair
    public int[] get()
    {
        return list;
    }
    
    //get the number inside this pair
    public int get(int index)
    {
        return list[index];
    }
    
    // check to the another pair whether it's duplicated or not
    public boolean equalTo(Pair another)
    {
        if(this.list[0] == another.list[0])
        {
            if(this.list[1] == another.list[1])
            {
                return true;
            }
        }
        else if(this.list[0] == another.list[1]) 
        {
            if(this.list[1] == another.list[0])
            {
                return true;
            }
        }
        return false;
    }
    
    //check if this pair is duplicated with any pairs in a list of pairs
    public boolean duplicate(ArrayList<Pair> array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if(this.equalTo(array.get(i)))
                return true;
        }
        return false;
    }
    
    // print structure of a pair to user
    public void print()
    {
        System.out.println("["+ list[0] + "," + list[1] + "]");
    }
}
