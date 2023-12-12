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
        BSTree<Integer> instance = new BSTree<>();
        BSTreeNode<Integer> expResult = null;
        BSTreeNode<Integer> result = instance.getRoot();
        assertEquals(expResult, result);
        instance.add(3);
        instance.add(2);
        instance.add(12);
        instance.add(1);
        result = instance.getRoot();
        assertEquals(3, result.getData().intValue());
    }

    /**
     * Test of getHeight method, of class BSTree.
     */
    @org.junit.Test
    public void testGetHeight() {
        BSTree<Integer> instance = new BSTree<>();
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        instance.add(3);
        instance.add(2);
        instance.add(12);
        instance.add(1);
        result = instance.getHeight();
        assertEquals(3, result);
    }

    /**
     * Test of size method, of class BSTree.
     */
    @org.junit.Test
    public void testSize() {
        BSTree<Integer> instance = new BSTree<>();

        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

        instance.add(3);
        instance.add(2);
        instance.add(12);
        instance.add(1);
        result = instance.size();
        assertEquals(4, result);
    }

    /**
     * Test of isEmpty method, of class BSTree.
     */
    @org.junit.Test
    public void testIsEmpty() {
        BSTree<Integer> instance = new BSTree<>();

        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

        instance.add(3);
        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of clear method, of class BSTree.
     */
    @org.junit.Test
    public void testClear() {
        BSTree<Integer> instance = new BSTree<>();
        instance.add(3);
        instance.add(2);
        instance.add(12);

        instance.clear();
        assertEquals(0, instance.size());
        assertEquals(null, instance.getRoot());
        assertEquals(0, instance.getHeight());

    }

    /**
     * Test of contains method, of class BSTree.
     */
    @org.junit.Test
    public void testContains() {
        BSTree<Integer> instance = new BSTree<>();
        instance.add(3);
        instance.add(2);
        instance.add(12);

        boolean expResult = true;
        boolean result = instance.contains(3);
        assertEquals(expResult, result);

        expResult = false;
        result = instance.contains(1);
        assertEquals(expResult, result);

    }

    /**
     * Test of search method, of class BSTree.
     */
    @org.junit.Test
    public void testSearch() {
        BSTree<Integer> instance = new BSTree<>();
        instance.add(3);
        instance.add(2);
        instance.add(12);

        BSTreeNode<Integer> expResult = null;
        BSTreeNode<Integer> result = instance.search(1);
        assertEquals(expResult, result);

        expResult = new BSTreeNode<>(3);
        result = instance.search(3);
        assertEquals(expResult.getData(), result.getData());
    }

    /**
     * Test of add method, of class BSTree.
     */
    @org.junit.Test
    public void testAdd() {
        BSTree<Integer> instance = new BSTree<>();
        instance.add(3);
        assertEquals(3, instance.getRoot().getData().intValue());

        instance.add(2);
        instance.add(12);

        assertEquals(3, instance.size());
        assertEquals(2, instance.getHeight());

    }

    /**
     * Test of removeMin method, of class BSTree.
     */
    @org.junit.Test
    public void testRemoveMin() {
        BSTree<Integer> instance = new BSTree<>();
        instance.add(3);
        instance.add(2);
        instance.add(12);
        instance.add(1);
        BSTreeNode<Integer> expResult = new BSTreeNode<>(1);
        BSTreeNode<Integer> result = instance.removeMin();
        assertEquals(expResult.getData(), result.getData());

    }

    /**
     * Test of removeMax method, of class BSTree.
     */
    @org.junit.Test
    public void testRemoveMax() {
        BSTree<Integer> instance = new BSTree<>();
        instance.add(3);
        instance.add(2);
        instance.add(12);
        instance.add(1);
        BSTreeNode<Integer> expResult = new BSTreeNode<>(12);
        BSTreeNode<Integer> result = instance.removeMax();
        assertEquals(expResult.getData(), result.getData());

    }

    /**
     * Test of inorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testInorderIterator() {
        BSTree<Integer> instance = new BSTree<>();
        Iterator<Integer> iterator = instance.inorderIterator();

        instance.add(3);
        instance.add(2);
        instance.add(12);
        instance.add(1);

        int[] expectedOrder = { 1, 2, 3, 12 };
        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expectedOrder[i], iterator.next().intValue());
            i++;
        }

    }

    /**
     * Test of preorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testPreorderIterator() {
        BSTree<Integer> instance = new BSTree<>();
        Iterator<Integer> iterator = instance.preorderIterator();

        instance.add(3);
        instance.add(2);
        instance.add(12);
        instance.add(1);

        int[] expectedOrder = { 3, 2, 1, 12 };
        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expectedOrder[i], iterator.next().intValue());
            i++;
        }
    }

    /**
     * Test of postorderIterator method, of class BSTree.
     */
    @org.junit.Test
    public void testPostorderIterator() {
        BSTree<Integer> instance = new BSTree<>();
        Iterator<Integer> iterator = instance.postorderIterator();

        instance.add(3);
        instance.add(2);
        instance.add(12);
        instance.add(1);

        int[] expectedOrder = { 1, 2, 12, 3 };
        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expectedOrder[i], iterator.next().intValue());
            i++;
        }

    }

}
