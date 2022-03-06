public class VectorSpace3D2Norm implements VectorSpace
{
    
    public Vector3D add(Vector3D v1, Vector3D v2) 
    {
        //add the x, y and z components of the two vector respectively
        return new Vector3D2Norm(v1.x+v2.x,v1.y+v2.y,v1.z+v2.z);
    }

    
    public double scalarProduct(Vector3D v1, Vector3D v2) 
    {
        //return scalar product of two vectors
        return (v1.x*v2.x+v1.y*v2.y+v1.z*v2.z);
    }

    
    public double distance(Vector3D v1, Vector3D v2) 
    {
        //difference between vector v2 and vector v1
        return ((v2.x-v1.x)+(v2.y-v1.y)+(v2.z-v1.z));
    }
}