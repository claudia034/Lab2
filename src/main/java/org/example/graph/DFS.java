package org.example.graph;

import java.util.*;

import java.util.*;

public class DFS<T> {
    public static <T> Optional<Node<T>> search(T value, Node<T> start) {
        Deque<Node<T>> stack = new ArrayDeque<>();
        stack.push(start);

        Node<T> currentNode;
        Set<Node<T>> visited = new HashSet<>();
        StringBuilder resultBuilder = new StringBuilder();

        while (!stack.isEmpty()) {
            currentNode = stack.pop();
            resultBuilder.append(currentNode.getValue());

            if (currentNode.getValue().equals(value)) {
                System.out.println(resultBuilder.toString());
                return Optional.of(currentNode);
            } else {
                visited.add(currentNode);
                for (Node<T> neighbor : currentNode.getNeighbors()) {
                    if (!visited.contains(neighbor) && !stack.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return Optional.empty();
    }
}





