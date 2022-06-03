public class DivisiorofNum {

    static void printDivisior(int n){
        for(int i=1;i*i<=n;i++){
            System.out.print(i +" ");
            if(i != n/i)
            System.out.print((n/i)+" ");
        }
    }

    public static void main(String[] args) {
        int n = 25;
        printDivisior(n);
        
    }
    
}
