/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BSTree;

import BSTree.utilities.Iterator;
import static org.junit.Assert.*;

/**
 * JUnit4 Tests for BSTree
 * 
 * @author Heshan Punchihewa
 * @author Patryk Rusak
 */
public class BSTreeTest {

    public BSTreeTest() {
    }

    private BSTree<Integer> getTestIntTree() {
        BSTree<Integer> tree = new BSTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(12);
        tree.add(7);
        tree.add(18);
        tree.add(14);
        tree.add(16);
        tree.add(20);
        tree.add(10);

        return tree;
    }

    /**
     * Test of getRoot method, of class BSTree.
     */
    @org.junit.Test
    public void testGetRoot() {
        BSTree<Integer> instance = new BSTree<>();
        BSTreeNode<Integer> expResult = null;
        BSTreeNode<Integer> result = instance.getRoot();
        assertEquals(expResult, result);

    }

    /**
     * Test of getHeight method, of class BSTree.
     */
    @org.junit.Test
    public void testGetHeight() {
        BSTree<Integer> instance = getTestIntTree();
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class BSTree.
     */
    @org.junit.Test
    public void testSize() {
        BSTree instance = new BSTree();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class BSTree.
     */
    @org.junit.Test
    public void testIsEmpty() {
        BSTree instance = new BSTree();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of clear method, of class BSTree.
     */
    @org.junit.Test
    public void testClear() {
        BSTree instance = new BSTree();
        instance.clear();

    }

    /**
     * Test of contains method, of class BSTree.
     */
    @org.junit.Test
    public void testContains() {
        Comparable entry = null;
        BSTree instance = new BSTree();
        boolean expResult = false;
        boolean result = instance.contains(entry);
        assertEquals(expResult, result);

    }

    /**
     * Test of search method, of class BSTree.
     */
    @org.junit.Test
    public void testSearch() {
        Comparable entry = null;
        BSTree instance = new BSTree();
        BSTreeNode expResult = null;
        BSTreeNode result = instance.search(entry);
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class BSTree.
     */
    @org.junit.Test
    public void testAdd() {
        Comparable newEntry = null;
        BSTree instance = new BSTree();
        boolean expResult = false;
        boolean result = instance.add(newEntry);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeMin method, of class BSTree.
     */
    @org.junit.Test
    public void testRemoveMin() {
        BSTree instance = new BSTree();
        BSTreeNode expResult = null;
        BSTreeNode result = instance.removeMin();
        assertEquals(expResult, result);

    }

    /**
     * Test of removeMax method, of class BSTree.
     */
    @org.junit.Test
    public void testRemoveMax() {
        BSTree instance = new BSTree();
        BSTreeNode expResult = null;
        BSTreeNode result = instance.removeMax();
        assertEquals(expResult, result);

    }

    /**
     * Test of inorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testInorderIterator() {
        BSTree instance = new BSTree();
        Iterator expResult = null;
        Iterator result = instance.inorderIterator();
        assertEquals(expResult, result);

    }

    /**
     * Test of preorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testPreorderIterator() {
        BSTree instance = new BSTree();
        Iterator expResult = null;
        Iterator result = instance.preorderIterator();
        assertEquals(expResult, result);

    }

    /**
     * Test of postorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testPostorderIterator() {
        BSTree instance = new BSTree();
        Iterator expResult = null;
        Iterator result = instance.postorderIterator();
        assertEquals(expResult, result);

    }

}
