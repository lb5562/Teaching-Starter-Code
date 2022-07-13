package Nodes;

public interface Inode<E> {

    /**
     * Get the data element in the node.
     *
     * @return the node's element
     */
    E getData();

    /**
     * Get the left child.
     *
     * @return the node's left child
     */
    Inode<E> getLeft();

    /**
     * Get the right child.
     *
     * @return the node's right child
     */
    Inode<E> getRight();

    /**
     * Change the node's left child.
     *
     * @param left the node's new left child
     */
    Inode<E> setLeft();

    /**
     * Change the node's right child.
     *
     * @param right the node's new right child
     */
    Inode<E> setRight();
}
