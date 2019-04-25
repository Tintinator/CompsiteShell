package P;

public class L implements I {
    
    public void opA(int i) { 
        System.out.print(" L.opA() ");
    }
    
    public void opB(int i) {
        System.out.print(" L.opB() ");
    }

    @Override
    public void add(I i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
