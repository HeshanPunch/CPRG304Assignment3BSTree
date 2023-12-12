
package BSTree;

/**
 * Represents a node in a Binary Search Tree.
 *
 * @param <T> The type of data stored in the node.
 * @author Heshan Punchihewa
 * @author Patryk Rusak
 */
public class BSTreeNode<T> {

    private T data;
    private BSTreeNode<T> left;
    private BSTreeNode<T> right;

    /**
     * Constructor for BSTreeNode
     * 
     * @param data value to be stored in this node
     */
    public BSTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    /**
     * Constructor for BSTreeNode
     * 
     * @param data value to be stored in this node
     * @param left node at left
     * @param right node at right
     */
    public BSTreeNode(T data, BSTreeNode<T> left, BSTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * Getter for data
     * 
     * @return data value stored in this node
     */
    public T getData() {
        return data;
    }

    /**
     * Setter for data
     * 
     * @param data value or data to be set as data for this node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Getter for left
     * 
     * @return left node at left
     */
    public BSTreeNode<T> getLeft() {
        return left;
    }

    /**
     * Setter for left
     * 
     * @param left node to be set as left
     */
    public void setLeft(BSTreeNode<T> left) {
        this.left = left;
    }

    /**
     * Getter for right
     * 
     * @return node at right
     */
    public BSTreeNode<T> getRight() {
        return right;
    }

    /**
     * Setter for right
     * 
     * @param right node to be set as right
     */
    public void setRight(BSTreeNode<T> right) {
        this.right = right;
    }

}
