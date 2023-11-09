class Finalise {
    void finalise(){
        System.out.println("Hi from class");
    }
    Finalise(){
        System.out.println("Hi from class");
    }
    
}

public class GarbageCollector {
    public static void main(String[] args) {
        float a = 12;
        float j = 45;
        Finalise t = new Finalise();
        System.out.println(((Object)j).getClass().getSimpleName()); 
        System.gc();
        t = null;
        t.finalise();

    }

}
