package day26;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.add("As");
        deque.add("Bt");
        deque.add("Cu");

        deque.pop();
        deque.push("De");
    }
}
