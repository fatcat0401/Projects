
/**
 * This class is used to create and modify user interface
 *
 * Quang Tran
 * 29393809
 */
import java.util.*;
public class Interface
{
    
    public Interface()
    {
        // initialise instance variables
    }
    
    //create the interface to help user input information
    public void requestInfo(Main main)
    {
        
        String list;
        int num;
        Scanner parser = new Scanner(System.in);
        System.out.println("First number: ");
        num = parser.nextInt();
        main.setFirstNum(num);
        parser.nextLine();
        System.out.println("Please input the list of numbers (separate by ,): ");
        list = parser.nextLine();
        //filled in number will be separated by ","
        String[] info = list.split(",");
        
        main.createList(info);
    }
    
    //create the interface of final result
    
    public void printResult(ArrayList<Pair> list, int firstNum)
    {
        System.out.println("The list of all pair add up to " + firstNum);
        for(int i = 0; i < list.size(); i++)
        {
            list.get(i).print();
        }
    }
}
