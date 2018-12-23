
/**
 * Quang Tran
 * 29393809
 *
 * This is the main class which runs whole program
 * 
 */
import java.util.*;
import java.io.*;
public class Main
{
    //create variables for first number, list of typed numbers,list of final pairs, interface
    private int firstNum;
    private ArrayList<Integer> list;
    private Interface UI;
    private ArrayList<Pair> result;
    public Main()
    {
        // initialise instance variables
        firstNum = 0;
        list = new ArrayList<Integer>();
        result = new ArrayList<Pair>();
        UI = new Interface();
   
    }
    
    //run the program
    public void run()
    {
        UI.requestInfo(this);
        findPairs(list, firstNum);
        UI.printResult(result, firstNum);
        //reset the list of typed numbers and results
        list.clear();
        result.clear();
    }
    // set value for the first number
    public void setFirstNum(int num)
    {
        // put your code here
        firstNum = num;
    }
    
    //set values for list of numbers
    public void createList(String[] info)
    {
        for(int i = 0; i < info.length; i++)
        {
            int num = Integer.parseInt(info[i]);
            list.add(num);
        }
    }
    
    //find all pairs in the list which has sum equal to first numbers, not duplicated and not the same numbers
    public void findPairs(ArrayList<Integer> list, int firstNum)
    {
        //check all the cases of sum of any numbers in the list
        for(int i = 0; i < list.size() - 1; i++)
        {
            int x = list.get(i);
            for(int j = i + 1; j < list.size(); j++)
            {
                int y = list.get(j);
                int sum = x + y;
                //if sum of these two numbers equal to the first number and they're not the same
                if(sum == firstNum && x != y)
                {
                    // create result pair
                    Pair pair = new Pair(list.get(i), list.get(j));
                    //if the list is empty, add this pair
                    if(result.size() == 0)
                        result.add(pair);
                    //if the pair has never appeared in the list before, add it
                    else
                    {
                        if(!pair.duplicate(result))
                            result.add(pair);
                    }
                }
            }
        }
    }
    
}
