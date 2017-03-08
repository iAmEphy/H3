public class LinkedList
{
  private Node first;
  private Node last;
  private class Node
  {
    
    String nodes;
    Node next;
    Node before;
    
    Node(String x, Node y, Node z)
    {
      nodes = x;
      next = y;
      before = z;
    }
    
    Node(String x)
    {
      this(x, null, null);
    }

  }
  
  public LinkedList()
  {
    first = null;
    last = null;
    
  }
  
  public Node getFirst()
  {
    return this.first;
  }
  
  public void setFirst(Node first)
  {
    this.first = first;
  }
  
  public Node getLast()
  {
    return this.last;
  }
  
  public void setLast(Node last)
  {
    this.last = last;
  }
  
  
  
}