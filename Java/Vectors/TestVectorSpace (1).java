public class TestVectorSpace {
    public static void main(String[] args) {
        Vector3D2Norm v = new Vector2D2Norm(0,0,0);
        try {
            v.normalize();
            System.out.println("Vector normalization done successfully");
        }
        catch (ArithmeticException exception){
            System.out.println("Division by zero not allowed");
            System.out.println("Stack Trace is: ");
            exception.printStackTrace();
        }
    }
}