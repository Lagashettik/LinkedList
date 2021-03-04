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
}
