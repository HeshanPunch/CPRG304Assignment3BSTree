package BSTree;

import BSTree.utilities.Iterator;
import BSTree.utilities.BSTreeADT;

/**
 * BSTree, or Binary Search Tree implementation based o n BSTreeADT
 * 
 * @author Heshan Punchihewa
 * @author Patryk Rusak
 */

public class BSTree<E extends Comparable<? super E>> implements BSTreeADT<E> {

    /**
     * BSTreeNode used by BSTree implementation
     * 
     * @param <T>
     */
    @Override
    public BSTreeNode<E> getRoot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoot'");
    }

    /**
     * Determines the row height of the tree and returns that value as an integer
     * value.
     * 
     * @return the height of the tree.
     */
    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHeight'");
    }

    /**
     * The number of elements currently stored in the tree is counted and the value
     * is returned.
     * 
     * @return number of elements currently stored in tree.
     */
    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    /**
     * Checks if the tree is currently empty.
     * 
     * @return returns boolean true if the tree is empty otherwise false.
     */
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    /**
     * Clears all elements currently stored in tree and makes the tree empty.
     */
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    /**
     * Checks the current tree to see if the element passed in is stored in the
     * tree. If the element is found in the tree the method returns true and if the
     * element is not in the tree the method returns false.
     * 
     * @param entry the element to find in the tree
     * @return returns boolean true if element is currently in the tree and false if
     *         the element is not found in the tree
     * @throws NullPointerException if the element being passed in is null
     */
    @Override
    public boolean contains(E entry) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    /**
     * Retrieves a node from the tree given the object to search for.
     * 
     * @param entry element object being searched
     * @return the node with the element located in tree, null if not found
     * @throws NullPointerException if the element being passed in is null
     */
    @Override
    public BSTreeNode<E> search(E entry) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    /**
     * Adds a new element to the tree according to the natural ordering established
     * by the Comparable implementation.
     * 
     * @param newEntry the element being added to the tree
     * @return a boolean true if the element is added successfully else false
     * @throws NullPointerException if the element being passed in is null
     */
    @Override
    public boolean add(E newEntry) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    /**
     * Removes the smallest element in the tree according to the natural ordering
     * established by the Comparable implementation.
     * 
     * @return the removed element or null if the tree is empty
     */
    @Override
    public BSTreeNode<E> removeMin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeMin'");
    }

    /**
     * Removes the largest element in the tree according to the natural ordering
     * established by the Comparable implementation.
     * 
     * @return the removed element or null if the tree is empty
     */
    @Override
    public BSTreeNode<E> removeMax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeMax'");
    }

    /**
     * Generates an in-order iteration over the contents of the tree. Elements are
     * in their natural order.
     * 
     * @return an iterator with the elements in the natural order
     */
    @Override
    public Iterator<E> inorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inorderIterator'");
    }

    /**
     * Generates a pre-order iteration over the contents of the tree. Elements are
     * order in such a way as the root element is first.
     * 
     * @return an iterator with the elements in a root element first order
     */
    @Override
    public Iterator<E> preorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preorderIterator'");
    }

    /**
     * Generates a post-order iteration over the contents of the tree. Elements are
     * order in such a way as the root element is last.
     * 
     * @return an iterator with the elements in a root element last order
     */
    @Override
    public Iterator<E> postorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postorderIterator'");
    }

}