

public class MatrixTester {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(4, 4);
        Matrix m2 = new Matrix(4, 4);
        m1.showElement();
        Matrix.identtiyMatrix();
        m1.showElement();
        m1.add(m2);
        
        
    }
}
