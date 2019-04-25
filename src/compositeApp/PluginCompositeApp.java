
package compositeApp;


public class PluginCompositeApp {
    
    static interface Factory {
        P.I L ();
        P.I M ();
    }
    
    static class PFactory implements Factory {
        public P.I L () { return new P.L(); }
        public P.I M () { return new P.M(); }
    }
    
    static class DPFactory implements Factory  {
        public P.I L () { return new DP.L(); }
        public P.I M () { return new DP.M(); }
    }

    public static void main(String... args) { 
        //TO DO
        
    }
    
}
