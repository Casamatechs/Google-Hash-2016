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

	public static void main(String[] args) {
		GoogleTry t = new GoogleTry(10, 10);
		try {
			t.readFile("/home/carlos/prueba.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getRows() {
		return this.N;
	}

	public int getColumns() {
		return this.M;
	}

	public void copy(boolean[][] matriz) {
		boolean[][] copy = new boolean[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; i++) {
				copy[i][j] = matriz[i][j];
			}
		}
	}

	public void readFile(String path) throws IOException {
		String sCurrentLine;
		BufferedReader br = new BufferedReader(new FileReader(path));
		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}
		br.close();
	}

}
