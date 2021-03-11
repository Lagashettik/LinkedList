import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void searchInLinkedListTrue(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(56);
        linkedList.append(70);
        linkedList.insert(1, 30);
        boolean check = linkedList.search(30);
        Assert.assertEquals(true,check);
    }

    @Test
    public void searchInLinkedListFalse(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(56);
        linkedList.append(70);
        linkedList.insert(1, 30);
        boolean check = linkedList.search(50);
        Assert.assertEquals(false,check);
    }

    @Test
    public void insertDataAfterKey(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(56);
        linkedList.append(70);
        linkedList.insert(1, 30);

        linkedList.insertAfterKey(40,30);
        linkedList.display();
    }

    @Test
    public void deletingElement(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(70);
        linkedList.deleteElement(40);
        System.out.println("Linked list size is" + linkedList.size());
        linkedList.display();
    }

}
