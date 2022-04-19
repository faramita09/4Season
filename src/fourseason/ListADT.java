package fourseason;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Supphachai
 */
interface ListADT {

    public void insert(Object e) throws Exception;

    public Object retrieve() throws Exception;

    public boolean isEmpty();

    public void delete() throws Exception;

    public void update(Object e) throws Exception;

    public void findFirst() throws Exception;

    public void findNext() throws Exception;

    public boolean isFull();

    public Object findKey(String key) throws Exception;
    
    
}
