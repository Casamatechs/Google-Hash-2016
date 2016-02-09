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
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/carlos/prueba.txt"));
			String sCurrentLine = br.readLine();
			String [] cr = sCurrentLine.split(" ");
			int row = Integer.parseInt(cr[0]);
			int column = Integer.parseInt(cr[1]);
			GoogleTry imagen = new GoogleTry(row, column);
			int i = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				imagen.rellenar(sCurrentLine, i, imagen.getColumns());
				i++;
			}
			br.close();
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
		int i = 0;
		BufferedReader br = new BufferedReader(new FileReader(path));
		while ((sCurrentLine = br.readLine()) != null) {
			rellenar(sCurrentLine, i, getColumns());
			i++;
		}
		br.close();
	}

	public void rellenar(String cadena, int fila, int columna){
		for(int i = 0; i < columna ; i++){
			if(cadena.charAt(i) == '#') this.painting[fila][i] = true;
			else this.painting[fila][i] = false ;
		}
	}

}
