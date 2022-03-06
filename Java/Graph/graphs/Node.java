// In collaboration with 2613065y, 2614579a, 2615938b
package graphs;

import java.util.ArrayList;
import java.util.List;

/*
 * define a class that can be used to store a node in a directed graph
 * represented as an adjacency list. A Node should have an ID (an integer), as
 * well as a list of its neighbours.
 */

public class Node {
    private int id;
    private ArrayList<Node> neighbours;

    public Node(int id) {
        this.id = id;
        neighbours = new ArrayList<Node>();
    }

    /** Adds the given node to this node’s adjacency list */
    public void addNeighbour(Node node) {
        neighbours.add(node);
    }

    /** Returns all of the nodes in the current adjacency list */
    public List<Node> getNeighbours() {
        return neighbours;
    }

    /** Returns this node’s ID (as set in the constructor) */
    public int getID() {
        return id;
    }

    @Override
    /** Returns node ID as string */
    public String toString() {
        return Integer.toString(id);
    }

    @Override
    /** Returns true if the given object is equal to this node */
    public boolean equals(Object o) {
        if (o instanceof Node) {
            Node n = (Node) o;
            return n.getID() == id;
        }
        return false;
    }

    @Override
    /** Returns hash code of this node */
    public int hashCode() {
        return id;
    }
}