/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import linked.list.structure.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LibraryTest {
  @Test void linkedListTest (){
    SinglyLinkedList first = new SinglyLinkedList();
    // empty linked list
    assertEquals(first.size(),0);
    assertEquals("Null" , first.toString());

    // insert into the linked list
    first.insert("H");
    assertEquals(first.size(),1);

    assertTrue(first.includes("H"));
    // head point to the first node in the linked list
    assertEquals("{ H } -> Null" , first.toString());

    //Insert multiple nodes into the linked list
    first.insert("E");
    first.insert("L");
    first.insert("L");
    first.insert("O");
    assertEquals("{ O } -> { L } -> { L } -> { E } -> { H } -> Null" , first.toString());

    // return false when searching for a value in the linked list that does not exist
    assertFalse(first.includes("M"));
    //finding a value within the linked list that exists
    assertTrue(first.includes("L"));


    //return a collection of all the values that exist in the linked list
    assertEquals("{ O } -> { L } -> { L } -> { E } -> { H } -> Null" , first.toString());

  }
  @Test void appendTest (){
    SinglyLinkedList ll = new SinglyLinkedList();
    //Add a node to the end of the linked list
    assertEquals(0,ll.size());
    ll.append("Sleepy!");
    assertEquals(1,ll.size());
    System.out.println(ll);
  }

  @Test void multiAppendTest (){
    SinglyLinkedList ll = new SinglyLinkedList();
    //add multiple nodes to the end of a linked list
    assertEquals(0,ll.size());
    ll.append("A");
    ll.append("B");
    ll.append("C");
    assertEquals(3,ll.size());
    System.out.println(ll);
  }
  @Test void beforeInsertTest (){
    SinglyLinkedList ll = new SinglyLinkedList();
    // empty linked list
    assertEquals(0,ll.size());
    ll.append("10");
    ll.append("20");
    ll.append("40");
    System.out.println(ll);
    //insert a node before a node located i the middle of a linked list
    ll.insertBefore("40","5555");
    System.out.println(ll);

    // insert a node before the first node of a linked list
    ll.insertBefore("AA","00");
    System.out.println(ll);
  }

  @Test void afterInsertTest (){
    SinglyLinkedList ll = new SinglyLinkedList();
    //insert a node before a node located i the middle of a linked list
    assertEquals(0,ll.size());
    ll.append("WW");
    ll.append("XX");
    ll.append("YY");
    ll.append("ZZ");
    //Insert after a node in the middle of the linked list
    ll.insertAfter("YY","55");
    assertEquals(4,ll.size());
    System.out.println(ll);
    //insert a node after the last node of the linked list
    ll.insertAfter("ZZ","00000");
    assertEquals(4,ll.size());
    System.out.println(ll);
  }
}


