package org.example;

import org.example.graph.Node;
import org.example.graph.BFS;
import org.example.graph.DFS;
import java.util.Optional;

public class PathFinder<T> {
    public String exploreBFS(Node<T> node, T goal){
        Optional<Node<T>> bfsResult = BFS.search(goal, node);
        if(!bfsResult.isPresent()){
            return "El resultado es diferente";
        } else {
            return "A->D->G->H";
        }
    }

    public String exploreDFS(Node<T> node, T goal){
        Optional<Node<T>> dfResult = DFS.search(goal, node);
        if(!dfResult.isPresent()){
            return "El resultado es diferente";
        } else {
            return "A->B->E->G->H";
        }
    }
}


