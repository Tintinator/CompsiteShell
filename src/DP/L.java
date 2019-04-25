/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

/**
 *
 * @author tinsi
 */

public class L extends P.L{
    
    public L(){
        super();        
//        System.out.println("this is a decorated L instantiating");
    }
    
    public void opA(int i) { 
        System.out.print(" DL.opA() ");
    }
    
    public void opB(int i) {
        System.out.print(" DL.opB() ");
    }

    @Override
    public void add(P.I i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
