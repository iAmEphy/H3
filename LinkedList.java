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
  
  public void add(int index, String data)
  {
    if( index < 0 || index > size())
    {
      System.out.println("The index is outside of the bounds.");
      return;
    }
    if(index == 0)
    {
      Node prevFirst = first;
      first = new Node(data, prevFirst, null);
      
      if(prevFirst != null)
      {
        prevFirst.before = first;
      }
      if(last == null)
      {
        last = first;
      }
      return;
    }
    
    
    Node before1 = first;
    
    for(int x = 1; x <= index - 1; x++)
    {
      before1 = before1.next;
    }
    
    Node after1 = before1.next;
    Node middle = new Node(data, after1, before1);
    after1.next = middle;
    
    if(after1 == null)
    {
      last = middle;
    }
    else
    {
      after1.before = middle;
    }
  }
  
  public void alpha(String data)
  {
    if(isEmpty())
    {
      last = new Node(data);
      first = last;
    }
    else
    {
      int index = 0;
      
      Node different = first;
      
      while(different.nodes.compareTo(data) < 0)
      {
        index++;
        different = different.next;
      }
      
      this.add(index, data);
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
  
  public void deleteNode(String data)
  {
    if(isEmpty())
    {
      System.out.println("Empty list");
    }
    
    Node deleteNode = first;
    
    while(deleteNode != null && !deleteNode.nodes.equals(data))
    {
      deleteNode = deleteNode.next;
    }
    
    
    if(deleteNode == null)
    {
      System.out.println("There is no node to delete.");
    }
    
    Node before1 = deleteNode.before;
    Node after1 = deleteNode.next;
    
    if(before1 == null)
    {
      first = after1;
    }
    else 
    {
      before1.next = after1;
    }
    
    if(after1 == null)
    {
      last = before1;
    }
    else
    {
      after1.before = before1;
    }
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