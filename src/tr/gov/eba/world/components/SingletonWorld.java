/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.components;

/**
 *
 * @author LifeBook
 */
public class SingletonWorld {
    
    private static SingletonWorld instance = new SingletonWorld();
    
    private SingletonWorld(){
        
    }

    public static SingletonWorld getInstance() {
        return instance;
    }   
    
}
