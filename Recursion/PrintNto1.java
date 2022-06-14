public class PrintNto1 {
    static void printToN(int n){
        if(n==0)
        return;
        System.out.print(n+" ");
        printToN(n-1);

    }
    public static void main(String[] args) {
        int n=5;
        printToN(n);
    }
    
}
