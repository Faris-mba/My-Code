public interface VectorSpace {
    Vector3D add(Vector3D v1,Vector3D v2);
    double scalarProduct(Vector3D v1,Vector3D v2);
    double distance(Vector3D v1,Vector3D v2);
}