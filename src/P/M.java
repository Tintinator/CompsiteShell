package P;

import java.util.LinkedList;


public class M implements I {
    public LinkedList<I> list = new LinkedList<>();
    
    public void add(I child) {
        list.add(child);
    }
    
    public void opA(int j) { 
        System.out.format(" M.opA() %d{ ",j);
        for (I i : list) i.opA( j+1 );
        System.out.format("}%d ",j);
    }
    
    public void opB(int j) {
        System.out.format(" M.opB() %d{ ",j);
         for (I i : list) i.opB(j+1);
         System.out.format("}%d ",j);
    }
    
}
