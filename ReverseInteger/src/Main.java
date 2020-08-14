import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));
	}
	public static int reverse(int x) {
		long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
public static boolean isPalindrome(int x) {
	if(x<0) {
		return false;
	}
	long res = 0;
	int y= x;
    while (y != 0) {
        res = res * 10 + y % 10;
        y = y / 10;
    }
    System.out.println(res);
    System.out.println((int)res == x );
    if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
        return false;
    } else if((int)res == x ){
        return true;
    }
    else {
	return false;
    }
}
}