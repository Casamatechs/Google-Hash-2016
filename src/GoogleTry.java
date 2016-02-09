import java.io.*;

public class GoogleTry {

    private int N;
    private int M;
    private boolean[][] painting;

    public GoogleTry(int N, int M) {
	this.N = N;
	this.M = M;
	this.painting = new boolean[N][M];	
    }

    public int getRows() {
	return this.N;
    }

    public int getColumns() {
	return this.M;
    }

	
    public void readFile(String path) throws IOException {
	
    }

    public boolean [] [] copy (boolean[][] matriz){
	boolean [][] copy = new boolean [matriz.length][matriz[0].length];
	for (int i = 0; i < matriz.lenth ; i++){
	    for (int j = 0; j < matriz[0].length; i++){
		copy[i][j] = matriz[i][j];
	    }
	}
    }

    public void clean (boolean, boolean [][] matriz){
	boolean [][] copy = new boolean [matriz.length][matriz[0].length];
	copy = copia(matriz);

	
    
}
