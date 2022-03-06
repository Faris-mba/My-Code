// In collaboration with 2613065y, 2614579a, 2615938b
package graphExploration;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import graphs.Node;

public class GraphExplorer {

    /**
     * creates a reachability tree from the first node in nodes array and writes to
     * a file at path
     */
    public static void writeTree(Node[] nodes, Path path) throws IOException {

        /* converting first element to a size 1 array so I can use Arrays.asList */
        Node[] firstelm = { nodes[0] };
        List<Node> nodesQeue = new LinkedList<>(Arrays.asList(firstelm));
        List<Node> checkedNodes = new ArrayList<Node>();
        List<int[]> tree = new ArrayList<int[]>();

        /* follows algorithm specifed in lab file */
        while (!nodesQeue.isEmpty()) {
            Node currentNode = nodesQeue.get(0);
            nodesQeue.remove(0);

            List<Node> nodeNeighbours = currentNode.getNeighbours();

            for (Node neighbour : nodeNeighbours) {
                if (!checkedNodes.contains(neighbour)) {
                    /* stops it from adding an extra line where "<LAST_NODE> <FIRST_NODE>" */
                    if (neighbour.getID() == 1) {
                        continue;
                    }
                    tree.add(generateEdge(currentNode.getID(), neighbour.getID()));
                    checkedNodes.add(neighbour);
                    nodesQeue.add(neighbour);
                }
            }

        }

        // write results to file
        try {
            FileWriter f0 = new FileWriter(path.getFileName().toString());
            String newLine = System.getProperty("line.separator");
            f0.write("Reachability Tree from Node 1:" + newLine);
            for (int[] edge : tree) {
                f0.write(edge[0] + " " + edge[1] + newLine);
            }
            f0.close();
        } catch (Exception e) {
            /* throw new IOException("Error writing to file"); */
        }

    }

    /** Generates an edge from two node ids */
    private static int[] generateEdge(int node1, int node2) {
        int[] edge = new int[2];
        edge[0] = node1;
        edge[1] = node2;
        return edge;
    }
}
