public class Matrix {
    private static int row;
    private static int col;
    private static int[][] matrix;

    public Matrix(int row, int col){
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
        addElement();
    }
    public static void addElement(){
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                matrix[i][j] = j;
            }
        }
    }
    public void showElement(){
        System.out.println("Matrix Elements");
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void identtiyMatrix(){
        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[i].length; j ++){
                if(i == j){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }                
    }
    public void add(Matrix m){
        System.out.println("Matrix Addition");
        int[][] result = new int[row][col];
        for(int i = 0; i < result.length; i ++){
            for(int j = 0; j < result[i].length; j ++){
                result[i][j] = matrix[i][j] + m.matrix[i][j];
            }
        }
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
