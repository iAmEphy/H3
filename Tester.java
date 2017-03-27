public class Tester
{
  public static void main(String []args)
  {
    LinkedList test = new LinkedList();
    
    System.out.println("The " + test + " is empty: " + test.isEmpty() + "\n");
    
    System.out.println("Adding 1, 2, 3, 4 to the list");
    test.add("A");
    test.add("B");
    test.add("D");
    test.add("E");
  
    System.out.println("The " + test + " is empty: " + test.isEmpty() + "\n");
    
    
    System.out.println("Printed forward: ");
    test.traverseForward();
    
    System.out.println();
    
    System.out.println("Printed backward: ");
    test.traverseBack();
    
    System.out.println();
    System.out.println("Size of method: ");
    System.out.println(test.size());
    
    System.out.println();
    System.out.println("Adding C to the list in alphabetical order.");
    test.alphabetical("C");
  
    System.out.println("The list printed forward is: ");
    test.traverseForward();
    
    System.out.println("Finding node D: ");
    System.out.println(test.findNode("D"));
    
    System.out.println("Deleting node C in the list");
    test.deleteNode("C");
    System.out.println("Printing the new list ");
    test.traverseForward();
    
    System.out.println();
    
    System.out.println("Destroying the list. The list is empty: ");
    test.destroy();
    System.out.println(test.isEmpty());

  }
}