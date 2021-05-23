/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author sereg
 */
public class Tree {
    public Node root;
    ArrayList<Integer> rootIndex = new ArrayList<>();

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
    
    public void add(int value) {
        root = addRecursive(root, value);
        rootIndex.add(value);
    }
    
    public ArrayList<Integer> showTree() {
        return rootIndex;
    }
    
    public String nodeIndexList() {
        
        String result = "";
        for(int i=0; i < rootIndex.size(); i++)
            result += "#" + (i + 1) + ": " + rootIndex.get(i) + "; ";
        
        return result;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {

            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private String result1 = "[";
    
    public String traverseInOrder(Node node) {
        
        if (node != null) {
            traverseInOrder(node.left);
            result1 += " " + node.value + ",";
            traverseInOrder(node.right);
        }
        return result1 + "]";
    }
    
    private String result2 = "[";

    public String traversePreOrder(Node node) {
        
        if (node != null) {
            result2 += " " + node.value + ",";
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
        return result2 + "]";
    }

    private String result3 = "[";
    
    public String traversePostOrder(Node node) {
        
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            result3 += " " + node.value + ",";
        }
        return result3 + "]";
    }

    public String traverseLevelOrder(Node root) {
        
        String result = "[";
        
        if (root == null) {
            return "";
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            result += " " + node.value + ",";

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        
        return result + "]";
    }
}
