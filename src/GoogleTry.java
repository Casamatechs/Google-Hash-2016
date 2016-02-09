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
}
