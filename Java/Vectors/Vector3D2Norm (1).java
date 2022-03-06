public class Vector3D2Norm extends Vector3D{

    public Vector3D2Norm(double x, double y, double z) 
    {
        super(x, y, z);
    }

    
    public double magnitude() 
    {
        /*
        The Euclidean norm is square root of sum of squares of each component
         */
        return Math.sqrt((x*x)+(y*y)+(z*z));
    }
}