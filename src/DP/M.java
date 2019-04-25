/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

import P.I;

/**
 *
 * @author tinsi
 */
public class M extends P.M{
    public M(){
        super();
//        System.out.println("this is a decorated M instantiating");
    }
    
    public void opA(int j) { 
        System.out.format(" DM.opA() %d{ ",j);
        for (I i : list) i.opA( j+1 );
        System.out.format("}%d ",j);
    }
    
    public void opB(int j) {
        System.out.format(" DM.opB() %d{ ",j);
         for (I i : list) i.opB(j+1);
         System.out.format("}%d ",j);
    }
}
