public interface Stack <Item>
 {
  Item pop(); 
  void push(Item itm);
  boolean isEmpty();
  int size(); 
 }
public class ArrayStack <Item> implements Stack <Item>
 {
   private Item inputarray[];
   private int top;
   public ArrayStack ()
   {
     inputarray = (Item[]) new Object [10];
     top = -1; 
   }
  public boolean isEmpty()
  {
   return (top == -1);
   }
  public Item pop()
  {
   if (top == -1)
   return null;
   return inputarray[top--];
   }
  public void push(Item itm)
  {
   inputarray[++top] = itm;
  }
  public int size()
  {
   return (top + 1);
 }
}
class ArrayStackTest
 {
  public static void main (String a[])
   {
     ArrayStack <Integer> s = new ArrayStack<Integer>();
     s.push(20);
     s.push(30);
     s.push(40);
      s.push(50);
	s.push(60);
	s.push(70);
	System.out.println("Size of the stack: " + s.size());
	System.out.println("Following items are poped from Integer stack:");
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	ArrayStack <String> c = new ArrayStack<String>();
	c.push("India");
	c.push("China");
	c.push("USA");
	System.out.println("Following items are poped from String stack:");
	System.out.println(c.pop());
	System.out.println(c.pop());
	System.out.println(c.pop());
      }
}