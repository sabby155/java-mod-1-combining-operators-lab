public class Main {
    public static void main(String[] args) {
        // your code here
        boolean truthy = true;
        boolean falsy = false;

        System.out.println("Truth table for && operator:");
        System.out.println("true && true = " + (truthy && truthy));
        System.out.println("true && false = " + (truthy && falsy));
        System.out.println("false && false = " + (falsy && falsy));
        System.out.println("false && true = " + (falsy && truthy));
        
        System.out.println("Truth table for || operator:");
        System.out.println("true || true = " + (truthy || truthy));
        System.out.println("true || false = " + (truthy || falsy));
        System.out.println("false || false = " + (falsy || falsy));
        System.out.println("false || true = " + (falsy || truthy));
    }
}
