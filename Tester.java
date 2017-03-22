public class Tester
{
  public static void main(String []args)
  {
    LinkedList test = new LinkedList();
    
    System.out.println("The " + test + " is empty: " + test.isEmpty() + "\n");
    
    System.out.println("Adding 1, 2, 3, 4 to the list");
    test.add("1");
    test.add("2");
    test.add("3");
    test.add("4");
    
    System.out.println("The " + test + " is empty: " + test.isEmpty() + "\n");
    
    
    System.out.println("Printed forward: ");
    test.traverseForward();
    
  }
}