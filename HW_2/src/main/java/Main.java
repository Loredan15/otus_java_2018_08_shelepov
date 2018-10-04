import java.lang.instrument.Instrumentation;

public class Main{


    public static void main(String[] args) throws InterruptedException {
        Instrumentation instrumentation;
        long heapSize = Runtime.getRuntime().totalMemory();
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        long heapFreeSize = Runtime.getRuntime().freeMemory();
        long useMemory = heapSize - heapFreeSize;

        System.out.println("max memory: " + heapMaxSize);
        System.out.println("total memory: " +heapSize);
        System.out.println("free memory: " + heapFreeSize);
        System.out.println("used memory: " + getMemory());
        System.out.println("______________________________");

        int SIZE = 1_000_000;
        long memory = getMemory();
        Object[] array = new Object[SIZE];
        long memory2 = getMemory();
        System.out.println("size ref: " + ((memory2 - memory)/ array.length));

        for (int i = 0; i <array.length ; i++) {
            array[i] = new String(" ");
        }
        long memory3 = getMemory();
        System.out.println("size object:" + (memory3 - memory2) / array.length);
    }

    public static long getMemory() throws InterruptedException {
        System.gc();
        Thread.sleep(100);
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}