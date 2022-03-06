public class Vector2D2Norm extends Vector3D2Norm{
    
    //Pass 0 for z-components in a 2D vector since the z-component value is zero
    
    public Vector2D2Norm(double x, double y, double z) 
    {
        super(x, y, 0);
    }
}