
package provasiemens;

/**
 *
 * @author mateusnunes
 */
public class Fibonacci {
    static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
  
}
