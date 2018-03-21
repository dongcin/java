package com.gudx.binarytree;

/**
 * Created by acer on 2018/3/6.
 */
public class binaryTree {

    public static void main(String[] args) {
        Node a = new Node(Integer.valueOf(1));
        Node b = new Node(Integer.valueOf(2));
        Node c = new Node(Integer.valueOf(3));
        a.left = b;
        a.right = c;
    }
}
class Node {
    public Object data;
    public Node left;
    public Node right;

    public Node(Object d) {
        this.data = d;
    }
}
