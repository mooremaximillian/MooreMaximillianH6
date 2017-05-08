import java.util.Scanner;
import java.io.Reader;
import java.io.FileReader;

public class Main
{
 public static void main(String[] args) {
        BST bst = new BST();  
        
        System.out.println("Binary Tree Example");
        String filename = "data.txt";
        bst.add(6);
        bst.add(8);
        bst.add(7);
        bst.add(3);
        bst.add(9);
        bst.add(5);
        bst.find(7).print();
        bst.delete(7);
        bst.depth();
        System.out.println("Traversing tree in order");
        bst.inOrder();
        System.out.println();
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
System.out.println("Enter a number: ");
int n = reader.nextInt();
BST bst1 = new BST();  

bst1.add(n);
bst1.print();
     


        

        
        
        try
    {
      Scanner scanner = new Scanner(new FileReader(filename));

      while (scanner.hasNext())
      {
        
      }
      scanner.close();
    }
    catch (Exception e)
    {
      System.err.format("Exception occurred trying to read '%s'.", filename);
      e.printStackTrace();
    }
    } 
  
}