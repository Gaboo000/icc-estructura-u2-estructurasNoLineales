package Main.Materia.Models;

import java.util.List;

public class NodeGraph {

    private List<NodeGraph> neighbors;
    private int value;


    public NodeGraph(List<NodeGraph> neighbors, int value) {
        this.neighbors = neighbors;
        this.value = value;
    }


    public List<NodeGraph> getNeighbors() {
        return neighbors;
    }


    public void setNeighbors(List<NodeGraph> neighbors) {
        this.neighbors = neighbors;
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }

    public void addNeighbor(NodeGraph neighbor){
        this.neighbors.add(neighbor);

    }


    

    

    
    
}
