package BSTree;

import BSTree.utilities.Iterator;
import BSTree.utilities.BSTreeADT;
import java.util.*;

/**
 * Binary Search Tree implementation based on BSTreeADT. Maintains a reference
 * to the root node and provides various operations on the tree.
 *
 * @param <E> the type of elements stored in the tree, must implement
 * Comparable.
 * @see BSTreeADT
 *
 * @author Heshan Punchihewa
 * @author Patryk Rusak
 */
public class BSTree<E extends Comparable<? super E>> implements BSTreeADT<E> {

    private BSTreeNode<E> root;
    private BSTreeNode<E> min;
    private BSTreeNode<E> max;

    /**
     * Constructor for BSTree
     */
    public BSTree() {
        this.root = null;
    }

    /**
     * BSTreeNode used by BSTree implementation
     *
     * @param <T>
     */
    @Override
    public BSTreeNode<E> getRoot() {
        return root;
    }

    /**
     * Determines the row height of the tree and returns that value as an
     * integer value.
     *
     * @return the height of the tree.
     */
    @Override
    public int getHeight() {
        return recGetHeight(root);
    }

    /**
     * Recursive method to get the height of the tree Private method to be used
     * by getHeight()
     *
     * @param node
     * @return the height of the tree
     */
    private int recGetHeight(BSTreeNode<E> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(recGetHeight(node.getLeft()), recGetHeight(node.getRight()));
        }
    }

    /**
     * The number of elements currently stored in the tree is counted and the
     * value is returned.
     *
     * @return number of elements currently stored in tree.
     */
    @Override
    public int size() {
        return recSize(root);
    }

    /**
     * Recursive method to get the size of the tree Private method to be used by
     * size()
     *
     * @param node
     * @return the size of the tree
     */
    private int recSize(BSTreeNode<E> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + recSize(node.getLeft()) + recSize(node.getRight());
        }
    }

    /**
     * Checks if the tree is currently empty.
     *
     * @return returns boolean true if the tree is empty otherwise false.
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Clears all elements currently stored in the tree and makes the tree
     * empty.
     */
    @Override
    public void clear() {
        root = null;
    }

    /**
     * Checks the current tree to see if the element passed in is stored in the
     * tree. If the element is found in the tree, the method returns true, and
     * if the element is not in the tree, the method returns false.
     *
     * @param entry the element to find in the tree
     * @return returns boolean true if the element is currently in the tree and
     * false if the element is not found in the tree
     * @throws NullPointerException if the element being passed in is null
     */
    @Override
    public boolean contains(E entry) throws NullPointerException {
        // Call a recursive helper method to check for the element
        return containsElement(root, entry);
    }

    /**
     * Recursive helper method to check if the element is in the tree
     *
     * @param node the current node being checked
     * @param entry the element to find in the tree
     * @return true if the element is found, false otherwise
     */
    private boolean containsElement(BSTreeNode<E> node, E entry) {
        if (node == null) {
            return false;
        }

        int compareResult = entry.compareTo(node.getData());

        if (compareResult == 0) {
            return true; // Element found in this node
        } else if (compareResult < 0) {
            return containsElement(node.getLeft(), entry);
        } else {
            return containsElement(node.getRight(), entry);
        }
    }

    /**
     * Retrieves a node from the tree given the object to search for.
     *
     * @param entry element object being searched
     * @return the node with the element located in the tree, null if not found
     * @throws NullPointerException if the element being passed in is null
     */
    @Override
    public BSTreeNode<E> search(E entry) throws NullPointerException {
        // Call a recursive helper method to search for the node
        return searchNode(root, entry);
    }

    /**
     * Recursive helper method to search for the node with the specified element
     *
     * @param node the current node being checked
     * @param entry the element to find in the tree
     * @return the node with the element, null if not found
     */
    private BSTreeNode<E> searchNode(BSTreeNode<E> node, E entry) {
        if (node == null || entry == null) {
            return null;
        }

        int compareResult = entry.compareTo(node.getData());

        if (compareResult == 0) {
            return node; // Element found in this node
        } else if (compareResult < 0) {
            return searchNode(node.getLeft(), entry);
        } else {
            return searchNode(node.getRight(), entry);
        }
    }

    /**
     * Adds a new element to the tree according to the natural ordering
     * established by the Comparable implementation.
     *
     * @param newEntry the element being added to the tree
     * @return a boolean true if the element is added successfully else false
     * @throws NullPointerException if the element being passed in is null
     */
    @Override
    public boolean add(E newEntry) throws NullPointerException {
        // Call a recursive helper method to add the new entry
        root = addNode(root, newEntry);
        return true; // Placeholder, replace with actual implementation
    }

    /**
     * Recursive helper method to add a new node with the specified entry
     *
     * @param node the current node being checked
     * @param newEntry the element to add to the tree
     * @return the updated node
     */
    private BSTreeNode<E> addNode(BSTreeNode<E> node, E newEntry) {
        if (node == null) {
            return new BSTreeNode<>(newEntry);
        }

        int compareResult = newEntry.compareTo(node.getData());

        if (compareResult < 0) {
            node.setLeft(addNode(node.getLeft(), newEntry));
        } else if (compareResult > 0) {
            node.setRight(addNode(node.getRight(), newEntry));
        }

        return node;
    }

    /**
     * Removes the smallest element in the tree according to the natural
     * ordering established by the Comparable implementation.
     *
     * @return the removed element or null if the tree is empty
     */
    @Override
    public BSTreeNode<E> removeMin() {
        if (root == null) {
            return null; // Tree is empty, nothing to remove.
        }

        removeMinNode(root);

        return this.min;

    }

    /**
     * Recursive helper method to remove the minimum element.
     *
     * @param node the current node being checked
     * @return the updated node
     */
    private BSTreeNode<E> removeMinNode(BSTreeNode<E> node) {
        if (node.getLeft() == null) {
            this.min = node;
            return node.getRight();
        }

        node.setLeft(removeMinNode(node.getLeft()));
        return node;
    }

    /**
     * Removes the largest element in the tree according to the natural ordering
     * established by the Comparable implementation.
     *
     * @return the removed element or null if the tree is empty
     */
    @Override
    public BSTreeNode<E> removeMax() {
        if (root == null) {
            return null;
        }
        root = removeMaxNode(root);
        return this.max; 
    }

    /**
     * Recursive helper method to remove the maximum element.
     *
     * @param node the current node being checked
     * @return the updated node
     */
    private BSTreeNode<E> removeMaxNode(BSTreeNode<E> node) {
        if (node.getRight() == null) {
            this.max = node;
            return node.getLeft();
        }

        node.setRight(removeMaxNode(node.getRight()));
        return node;
    }

    /**
     * Generates an in-order iteration over the contents of the tree. Elements
     * are in their natural order.
     *
     * @return an iterator with the elements in the natural order
     */
    @Override
    public Iterator<E> inorderIterator() {
        return new InorderIterator(root);
    }

    /**
     * Generates a pre-order iteration over the contents of the tree. Elements
     * are order in such a way as the root element is first.
     *
     * @return an iterator with the elements in a root element first order
     */
    @Override
    public Iterator<E> preorderIterator() {
        return new PreorderIterator(root);
    }

    /**
     * Generates a post-order iteration over the contents of the tree. Elements
     * are ordered in such a way that the root element is last.
     *
     * @return an iterator with the elements in a root element last order
     */
    @Override
    public Iterator<E> postorderIterator() {
        return new PostorderIterator(root);
    }

    /**
     * Private inner class for implementing the in-order iterator.
     */
    private class InorderIterator implements Iterator<E> {

        private List<E> elements;
        private int index;

        /**
         * Constructs an in-order iterator for the tree.
         *
         * @param root the root of the tree
         */
        public InorderIterator(BSTreeNode<E> root) {
            elements = new ArrayList<>();
            inorderTraversal(root);
            index = 0;
        }

        /**
         * Recursive method to perform in-order traversal of the tree.
         *
         * @param node the current node being traversed
         */
        private void inorderTraversal(BSTreeNode<E> node) {
            if (node != null) {
                inorderTraversal(node.getLeft());
                elements.add(node.getData());
                inorderTraversal(node.getRight());
            }
        }

        /**
         * Checks if there are more elements in the iteration.
         *
         * @return true if there are more elements, false otherwise
         */
        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        /**
         * Retrieves the next element in the iteration.
         *
         * @return the next element
         * @throws NoSuchElementException if there are no more elements
         */
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the iteration");
            }
            return elements.get(index++);
        }
    }

    /**
     * Private inner class for implementing the pre-order iterator.
     */
    private class PreorderIterator implements Iterator<E> {

        private List<E> elements;
        private int index;

        /**
         * Constructs a pre-order iterator for the tree.
         *
         * @param root the root of the tree
         */
        public PreorderIterator(BSTreeNode<E> root) {
            elements = new ArrayList<>();
            preorderTraversal(root);
            index = 0;
        }

        /**
         * Recursive method to perform pre-order traversal of the tree.
         *
         * @param node the current node being traversed
         */
        private void preorderTraversal(BSTreeNode<E> node) {
            if (node != null) {
                elements.add(node.getData());
                preorderTraversal(node.getLeft());
                preorderTraversal(node.getRight());
            }
        }

        /**
         * Checks if there are more elements in the iteration.
         *
         * @return true if there are more elements, false otherwise
         */
        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        /**
         * Retrieves the next element in the iteration.
         *
         * @return the next element
         * @throws NoSuchElementException if there are no more elements
         */
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the iteration");
            }
            return elements.get(index++);
        }
    }

    /**
     * Private inner class for implementing the post-order iterator.
     */
    private class PostorderIterator implements Iterator<E> {

        private List<E> elements;
        private int index;

        /**
         * Constructs a post-order iterator for the tree.
         *
         * @param root the root of the tree
         */
        public PostorderIterator(BSTreeNode<E> root) {
            elements = new ArrayList<>();
            postorderTraversal(root);
            index = 0;
        }

        /**
         * Recursive method to perform post-order traversal of the tree.
         *
         * @param node the current node being traversed
         */
        private void postorderTraversal(BSTreeNode<E> node) {
            if (node != null) {
                postorderTraversal(node.getLeft());
                postorderTraversal(node.getRight());
                elements.add(node.getData());
            }
        }

        /**
         * Checks if there are more elements in the iteration.
         *
         * @return true if there are more elements, false otherwise
         */
        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        /**
         * Retrieves the next element in the iteration.
         *
         * @return the next element
         * @throws NoSuchElementException if there are no more elements
         */
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the iteration");
            }
            return elements.get(index++);
        }
    }
}
