package org.example.structure;

import lombok.AllArgsConstructor;
import lombok.Data;

public class LinkList {
    @Data
    @AllArgsConstructor
    public static class Node<T> {
        private T value;
        private Node<T> next;
    }
    
    public static Node reverseLinkList(Node root){
        Node curr = root;
        Node prev = null;
        Node next;
        while (curr!=null){
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        return prev;
    }
}



