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

    /**
     * Test of getRoot method, of class BSTree.
     */
    @org.junit.Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BSTree instance = new BSTree();
        BSTreeNode expResult = null;
        BSTreeNode result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class BSTree.
     */
    @org.junit.Test
    public void testGetHeight() {
        System.out.println("getHeight");
        BSTree instance = new BSTree();
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class BSTree.
     */
    @org.junit.Test
    public void testSize() {
        System.out.println("size");
        BSTree instance = new BSTree();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BSTree.
     */
    @org.junit.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BSTree instance = new BSTree();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class BSTree.
     */
    @org.junit.Test
    public void testClear() {
        System.out.println("clear");
        BSTree instance = new BSTree();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class BSTree.
     */
    @org.junit.Test
    public void testContains() {
        System.out.println("contains");
        Comparable entry = null;
        BSTree instance = new BSTree();
        boolean expResult = false;
        boolean result = instance.contains(entry);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class BSTree.
     */
    @org.junit.Test
    public void testSearch() {
        System.out.println("search");
        Comparable entry = null;
        BSTree instance = new BSTree();
        BSTreeNode expResult = null;
        BSTreeNode result = instance.search(entry);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class BSTree.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        Comparable newEntry = null;
        BSTree instance = new BSTree();
        boolean expResult = false;
        boolean result = instance.add(newEntry);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMin method, of class BSTree.
     */
    @org.junit.Test
    public void testRemoveMin() {
        System.out.println("removeMin");
        BSTree instance = new BSTree();
        BSTreeNode expResult = null;
        BSTreeNode result = instance.removeMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMax method, of class BSTree.
     */
    @org.junit.Test
    public void testRemoveMax() {
        System.out.println("removeMax");
        BSTree instance = new BSTree();
        BSTreeNode expResult = null;
        BSTreeNode result = instance.removeMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testInorderIterator() {
        System.out.println("inorderIterator");
        BSTree instance = new BSTree();
        Iterator expResult = null;
        Iterator result = instance.inorderIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testPreorderIterator() {
        System.out.println("preorderIterator");
        BSTree instance = new BSTree();
        Iterator expResult = null;
        Iterator result = instance.preorderIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testPostorderIterator() {
        System.out.println("postorderIterator");
        BSTree instance = new BSTree();
        Iterator expResult = null;
        Iterator result = instance.postorderIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
