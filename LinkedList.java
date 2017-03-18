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
  
  public boolean isEmpty()
  {
    return first == null;
  }
  
  public int size()
  {
    int count = 0;
    Node changeNode = first;
    
    while(changeNode != null)
    {
      count++;
      changeNode = changeNode.next;
    }
    return count;
  }
  
  public void add(String data)
  {
    if(isEmpty())
    {
      last = new Node(data);
      first = last;
    }
    else
    {
      last.next = new Node(data, null, last);
        last = last.next;
    }
  }
  
  public Node findNode(String data)
  {
    Node findNodes = first;
    
    while(findNodes != null)
    {
      if(findNodes.nodes.equals(data))
      {
        return findNodes;
      }
      else
      {
        findNodes = findNodes.next;
      }
    }
    return null;
  }
  
  public void traverseForward()
  {
    Node printNode = first;
    
    while(printNode != null)
    {
      System.out.println(printNode.nodes);
      printNode = printNode.next;
    }
  }
  
  public void traverseBack()
  {
    Node printNode = last;
    
    while(printNode != null)
    {
      System.out.println(printNode.nodes);
      printNode = printNode.before;
    }
  }
  
  public void destroy()
  {
    this.first = null;
    this.last = null;
  }
  
}