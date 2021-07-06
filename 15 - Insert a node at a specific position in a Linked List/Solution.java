import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
            throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // SOLUTION
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode currentNode = llist;
        SinglyLinkedListNode nextNode = null;
        int i = 0;

        if (llist == null) {
            return newNode;
        }

        if (position == 0) {
            newNode.next = llist;
            llist = newNode;
        } else {
            while (i < position - 1) {
                i++;
                currentNode = currentNode.next;
            }

            nextNode = currentNode.next;
            currentNode.next = newNode;
            newNode.next = nextNode;
        }

        return llist;

    }
}