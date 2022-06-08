//check kth bit is set or not
//Method 1 (Using Left Shift)

public class CheckKthBit {
    public static void isKthBitSet(int n, 
    int k) 
{ 
if ((n & (1 << (k - 1))) == 1) 
System.out.print("SET"); 
else
System.out.print("NOT SET"); 
} 

    public static void main(String[] args) {
        int n = 5, k = 1; 
		isKthBitSet(n, k); 
        
    }
    
}
