package me.airbottle.linkedlist;

public class Node {
    public int data; // 노드 안의 데이터
    public Node next; // 포인터

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}
