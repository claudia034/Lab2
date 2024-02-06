package org.example.graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class BFS<T> {
    public static <T> Optional<Node<T>> search(T value, Node<T> start) {
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(start);

        Node<T> currentNode;
        Set<Node<T>> closed = new HashSet<>();
        StringBuilder resultBuilder = new StringBuilder();

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            resultBuilder.append(currentNode.getValue());
            if (currentNode.getValue().equals(value)) {
                System.out.println(resultBuilder.toString());
                return Optional.of(currentNode);
            } else {
                closed.add(currentNode);
                for (Node<T> neighbor : currentNode.getNeighbors()) {
                    if (!closed.contains(neighbor) && !queue.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
        return Optional.empty();
    }
}






