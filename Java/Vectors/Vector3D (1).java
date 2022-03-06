public abstract class Vector3D {
    public double x;
    public double y;
    public double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // multiplying a vector by a scalar
    public void multiply(double scalar) {
        x = x * scalar;
        y = y * scalar;
        z = z * scalar;
    }

    public void normalize() throws ArithmeticException {
        // if magnitude of vector is zero then vector is all zero so throw an exception

        if (magnitude() == 0.0) {
            throw new ArithmeticException();
        } else {
            // normalize x, y, z
            x = x / magnitude();
            y = y / magnitude();
            z = z / magnitude();
        }
    }

    // returns three vector components in a double array
    public double[] getVector() {
        return new double[] { x, y, z };
    }

    // Returns true if the vector is all zero
    public boolean isZero() {
        // use magnitude() function because all component are zero then magnitude is
        // zero
        return magnitude() == 0;
    }

    public String toString() {
        return "Your vector has x-component as: " + x + ", y-component as: " + y + " and z-component as: " + z;
    }

    public abstract double magnitude();
}