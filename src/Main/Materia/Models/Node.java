package Main.Materia.Models;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;
    private int balance;
    

    public Node(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public Node getLeft() {
        return left;
    }


    public void setLeft(Node left) {
        this.left = left;
    }


    public Node getRight() {
        return right;
    }


    public void setRight(Node right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public int getBalance() {
        return balance;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void addNeighbor(Node dest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNeighbor'");
    }


    

    

    
    

    

    
}
