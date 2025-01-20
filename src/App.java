import org.w3c.dom.Node;

import Main.Materia.Controllers.ArbolAVL;
import Main.Materia.Controllers.ArbolBinario;
import Main.Materia.Controllers.ArbolRecorridos;
import Main.Materia.Controllers.Graph;
import Main.Materia.Models.NodeGraph;

public class App {
    public static void main(String[] args) throws Exception {
        //runArbolBinario();
        //runEjercicio3();
        //runArbolAvl();
        runGraph();
    }
    public static void runArbolBinario(){
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40,20,60,10,30,50,70,5,15,55};

        for(int cont : valores){
            arbolBinario.insert(cont);
        }
        arbolBinario.printTree();

        ArbolRecorridos arbolRecorrido = new ArbolRecorridos();
        System.out.println("Recorrido Preorder: ");

        arbolRecorrido.preORderIterativo(arbolBinario.getRoot());
        System.out.println("\nRecorrido PreOrder Recursivo");
        arbolRecorrido.preOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido InOrder Recursivo");
        arbolRecorrido.inOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido PosOrder Recursivo");
        arbolRecorrido.postOrderRecursivo(arbolBinario.getRoot());
    }
    
   /*  public static void runEjercicio3(){
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();
        int[] valores = { 4, 2, 7, 1, 3, 6, 9 };

        // Insertar valores en el árbol binario
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        // Imprimir el árbol binario
        arbolBinario.printTree();

        // Obtener lista de niveles
        List<List<Node>> lista = levels.listLevels(arbolBinario.getRoot());

        // Imprimir los niveles
        System.out.println("Niveles del árbol:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("Nivel " + i + ": ");
            for (Node node : lista.get(i)) {
                System.out.print(node.getValue() + " ");
            }
            System.out.println();
        }
    }*/

    private static void runArbolAvl(){
        ArbolAVL arbolAVL = new ArbolAVL();
        int [] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};

        for(int valor : values){
            arbolAVL.insert(valor);
        }

        arbolAVL.printTree();
    }

    private static void runGraph(){
        Graph grafo = new Graph();
        NodeGraph node0 = grafo.addNode(0);
        NodeGraph node1 = grafo.addNode(1);
        NodeGraph node2 = grafo.addNode(2);
        NodeGraph node3 = grafo.addNode(3);
        NodeGraph node4 = grafo.addNode(4);
        NodeGraph node5 = grafo.addNode(5);

        grafo.addEdgeUni(node0, node5);
        grafo.addEdgeUni(node0, node3);
        grafo.addEdgeUni(node3, node2);
        grafo.addEdgeUni(node3, node4);
        grafo.addEdgeUni(node2, node1);


        grafo.addEdgeUni(node1, node0);



        //grafo.addEdge(node1, node2);



        grafo.addNode(5);
        grafo.addNode(7);
        grafo.addNode(9);
        grafo.addNode(11);
        grafo.addNode(3);

        grafo.getDFS(node0);
        grafo.getBFS(node0);







        grafo.printGraph();




    }

}
 