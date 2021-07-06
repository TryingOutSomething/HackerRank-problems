import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
            throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    /*
     * For your reference:
     *
     * DoublyLinkedListNode { int data; DoublyLinkedListNode next;
     * DoublyLinkedListNode prev; }
     *
     */

    // SOLUTION
    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        DoublyLinkedListNode currentNode = llist;
        DoublyLinkedListNode previousNode = null;

        if (llist == null) {
            return newNode;
        }

        if (data <= currentNode.data) {
            newNode.next = llist;
            llist.prev = newNode;

            return newNode;
        }

        while (currentNode.next != null && data > currentNode.data) {
            currentNode = currentNode.next;
        }

        if (currentNode.next == null && data > currentNode.data) {
            // reached the tail of the list
            currentNode.next = newNode;
            newNode.prev = currentNode;
        } else {
            // before the tail of the list
            previousNode = currentNode.prev;
            previousNode.next = newNode;
            newNode.next = currentNode;
            newNode.prev = previousNode;

            currentNode.prev = newNode;
        }

        return llist;
    }
}