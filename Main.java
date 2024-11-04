package me.airbottle;

import me.airbottle.linkedlist.LinkedListTutorial;

public class Main {
    public static void main(String[] args) {

        LinkedListTutorial list = new LinkedListTutorial();
        System.out.println("Create LinkedList");
        System.out.println("Size: " + list.size());
        System.out.println();

        // 데이터 추가
        System.out.println("Add Data at the end of the list");
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println("Size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: "+ i + ", Value: " + list.get(i).data);
        }
        System.out.println();

        // 새로운 데이터 추가(특정값)
        System.out.println("Add Data at the end of the list with specific value");
        list.add(1000);
        list.add(2000);
        System.out.println("Size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: "+ i + ", Value: " + list.get(i).data);
        }
        System.out.println();

        // 데이터 제거
        System.out.println("Delete Data");
        for (int i = 0; i < 4; i++) {
            list.remove(list.size() - (i + 1));
        }
        System.out.println("Size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: "+ i + ", Value: " + list.get(i).data);
        }
        System.out.println();

        // 새로운 데이터 삽입
        System.out.println("Add Data at specific index with specific value");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.add(i, 7777);
            }
        }
        System.out.println("Size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: "+ i + ", Value: " + list.get(i).data);
        }
        System.out.println();

        // 링크드 리스트 제거
        System.out.println("Delete LinkedList");
        list.deleteList();
        System.out.println("Size: " + list.size());
    }
}