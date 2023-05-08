package org.example.structure;

import org.junit.jupiter.api.Test;
import org.example.structure.LinkList.Node;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {

    public static List<Object> list = Arrays.asList(1, 2, 3);

    private Node builtLinkedList(){
        if(list.isEmpty()) return null;
        Node root = null;
        for (int i = list.size()-1; i>=0; i--) {
            root = new Node<>(list.get(i), root);

        }
        return root;
    }

    @Test
    void reverseLinkList() {
        Node root = builtLinkedList();
        Node reverseList = LinkList.reverseLinkList(root);
        System.out.println(root);
        System.out.println(reverseList);
        checkReverseList(reverseList);
    }

    private void checkReverseList(Node reverseList) {
        if(reverseList != null){

            for(int i = list.size()-1;i>=0;i--){
                assertNotNull(reverseList, "reverseList < list.size()");
                assertEquals(reverseList.getValue(), list.get(i));
                reverseList = reverseList.getNext();
            }
            assertNull(reverseList, "reverseList > list.size()");

        } else assertNotNull(null, "null element into root");

    }


}