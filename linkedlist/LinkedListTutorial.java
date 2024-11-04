package me.airbottle.linkedlist;

public class LinkedListTutorial {
    private Node head; // 헤드 노드

    // 생성자 : 링크스 리스트 생성
    public LinkedListTutorial() {
        head = null;
    }

    // 소멸자 역할 메서드 : 모든 노드를 삭제
    public void deleteList() {
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = null; // 메모리 누수 방지를 위해 다음 노드의 포인터를 null로 설정
            current = next;
        }
        head = null; // 리스트의 헤드(첫 노드)를 null로 설정
    }

    // 리스트의 길이값을 반환
    public int size() {
        int size = 0;
        Node current = head;

        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    // 리스트의 끝에 노드를 생성하여 추가
    public void add(int data) {
        Node node = new Node(data); // 새로운 노드를 힙 메모리에 생성

        // 헤드 노드가 없다면 생성한 노드를 헤드로 설정
        if (head == null) {
            head = node;
            return;
        }

        // 헤드 노드가 존재한다면, 모든 노드를 순회 후 마지막에 노드 추가
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    // 해당되는 인덱스의 노드 제거
    public void remove(int index) {
        if (head == null) {
            return;
        }

        int size = size();
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node current = head;
        while (index > 0) {
            prev = current;
            current = current.next;
            index--;
        }
        prev.next = current.next; // 이전 노드의 다음 노드를 제거하려는 다음 노드로 설정
    }

    // 해당되는 인덱스의 값을 반환
    public Node get(int index) {
        if (head == null) {
            return null;
        }

        int size = size();
        if (index < 0 || index >= size) {
            return null;
        }

        Node current = head;
        while (index > 0) {
            current = current.next;
            index--;
        }
        return current;
    }

    // 해당되는 인덱스에 새로운 노드를 생성하여 삽입
    public void add(int index, int data) {
        if (head == null) {
            return;
        }

        int size = size();
        if (index < 0 || index > size) {
            return;
        }

        Node node = new Node(data);
        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node prev = null;
        Node current = head;
        while (index > 0) {
            prev = current;
            current = current.next;
            index--;
        }
        prev.next = node;
        node.next = current;
    }
}
