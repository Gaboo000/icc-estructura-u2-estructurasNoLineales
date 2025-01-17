package Main.Materia.Controllers;
import Main.Materia.Models.Node;
import Main.Materia.Models.NodeGraph;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    
    
    private List <NodeGraph> nodes ;

    //Contructor

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeGraph addNode (int value){
        NodeGraph nodeGraph = new NodeGraph(nodes,value);
        nodes.add(nodeGraph);
        return nodeGraph;
    }

    
    public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);

    }

    public void printGraph(){
        for(NodeGraph nodeGraph : nodes){
            System.out.print("Vertice "+nodeGraph.getValue()+": ");
            for(NodeGraph nei : nodeGraph.getNeighbors()){
                System.out.print(nei.getValue()+" - ");
            }
            System.out.println();
        }

    }

    public void getDFS(Node startNode){

    }
    private void getDFSUtil(Node node, boolean []visited){

    } 
    public void getBFS(Node startNode){
        
    }

    public int[][] getAdjancencyMatrix(){
        return null;
    }

    public void printAdjancencyMatrix(){

    }



    
    
}
