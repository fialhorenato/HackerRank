package com.tasks.algorithms.PrintLinkedList;

public class PrintLinkedList {

    static class SinglyLinkedListNode {
        public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
            this.data = data;
            this.next = next;
        }

        int data;
        SinglyLinkedListNode next;
    }

    public static void main(String[] args) {
        var node2 = new SinglyLinkedListNode(13, null);
        var head = new SinglyLinkedListNode(16, node2);
        printLinkedList(head);
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
