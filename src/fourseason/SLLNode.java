package fourseason;
/**
 *
 * @author Supphachai Thaicharoen
 * @since Feb 24, 2015
 * @param <E>
 */
public class SLLNode<E> {
    
    private SLLNode nextNode;
    private E data;
    
    public SLLNode(){
        nextNode=null;
        data=null;
    }
    
    public SLLNode(E e){
        nextNode=null;
        data=e;
    }

    /**
     * @return the nextNode
     */
    public SLLNode getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(SLLNode nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * @return the data
     */
    public E getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(E data) {
        this.data = data;
    }
    
    
    
}
