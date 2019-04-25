
package compositeApp;


public class OriginalCompositeApp {

    public static void main(String[] args) {
        // Create nodes of tree
        P.I l0 = new P.L();
        P.I l1 = new P.L();
        P.I l2 = new P.L();
        P.I l3 = new P.L();
        P.I m1 = new P.M();
        P.I m2 = new P.M();
        P.I m3 = new P.M();
        
        // assemble tree
        m3.add(m2);
        m3.add(l3);
        m2.add(m1);
        m2.add(l2);
        m1.add(l0);
        m1.add(l1);
        
        // now here are the calls
        m3.opA(1);
        System.out.format("\n-----\n");
        m3.opB(1);
        System.out.format("\n\n");
        
    }
    
}
