package Main.Materia.Controllers;
import Main.Materia.Models.Node;
import Main.Materia.Models.NodeGraph;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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

    public void getDFS(NodeGraph start){
        Set<NodeGraph> visitados = new HashSet<>();
        System.out.println("DFS desdde el node "+ start.getValue()+ " : ");
        getDFSUtil(start, visitados);

    }
    private void getDFSUtil(NodeGraph node, Set<NodeGraph>visitados){
        if(visitados.contains(node)){
            return;
        }

        System.out.println(node.getValue()+ " ");

        for( NodeGraph neighbor : node.getNeighbors()){

            getDFSUtil(neighbor, visitados);


        }

    } 
    public void getBFS(NodeGraph start){

        Set<NodeGraph> visitados = new HashSet<>();

        Queue<NodeGraph> cola = new LinkedList<>();

        System.out.println("BFS desde el nodo "+start.getValue()+": ");
        cola.add(start);
        visitados.add(start);


        while (!cola.isEmpty()) {
            NodeGraph actual = cola.poll();
            System.out.println(actual.getValue()+" ");

            for( NodeGraph neighbor : actual.getNeighbors()){
                if(!visitados.contains(neighbor)){
                    visitados.add(neighbor);
                    cola.add(neighbor);
                }
            }
            
        }


        
    }

    public int[][] getAdjancencyMatrix(){
        return null;
    }

    public void printAdjancencyMatrix(){

    }

    public void addEdgeUni (NodeGraph src, NodeGraph des){

    }



    
    
}
