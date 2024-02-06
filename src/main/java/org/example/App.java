package org.example;

import org.example.graph.Node;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var a = new Node<String>("A");
        var b = new Node<String>("B");
        var c = new Node<String>("C");
        var d = new Node<String>("D");

        a.connect(d);
        a.connect(b);
        a.connect(c);


        System.out.println(a.getNeighbors());

    }


}


