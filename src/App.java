import Main.Materia.Controllers.ArbolBinario;
import Main.Materia.Controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) throws Exception {
        runArbolBinario();
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


}
 