
package BSTree;

/**
 * BSTreeNode used by BSTree implementation
 * 
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
     * @param data
     */
    public BSTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    /**
     * Constructor for BSTreeNode
     * 
     * @param data
     * @param left
     * @param right
     */
    public BSTreeNode(T data, BSTreeNode<T> left, BSTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * Getter for data
     * 
     * @return data
     */
    public T getData() {
        return data;
    }

    /**
     * Setter for data
     * 
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Getter for left
     * 
     * @return left
     */
    public BSTreeNode<T> getLeft() {
        return left;
    }

    /**
     * Setter for left
     * 
     * @param left
     */
    public void setLeft(BSTreeNode<T> left) {
        this.left = left;
    }

    /**
     * Getter for right
     * 
     * @return right
     */
    public BSTreeNode<T> getRight() {
        return right;
    }

    /**
     * Setter for right
     * 
     * @param right
     */
    public void setRight(BSTreeNode<T> right) {
        this.right = right;
    }

}
