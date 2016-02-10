import java.io.*;

public class GoogleTry {

	private int N;
	private int M;
	private int contador;
	private boolean[][] painting;

	public GoogleTry(int N, int M) {
		this.N = N;
		this.M = M;
		this.painting = new boolean[N][M];
		this.contador = 0;
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/carlos/prueba.txt"));
			String sCurrentLine = br.readLine();
			String [] cr = sCurrentLine.split(" ");
			int row = Integer.parseInt(cr[0]);
			int column = Integer.parseInt(cr[1]);
			GoogleTry imagen = new GoogleTry(row, column);
			imagen.readFile(br);
			imagen.toStringPaint(imagen.getImagen());
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

	public boolean[][] getImagen(){
		return this.painting;
	}

	public void copy(boolean[][] matriz) {
		boolean[][] copy = new boolean[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				copy[i][j] = matriz[i][j];
			}
		}
	}

	public void readFile(BufferedReader bf) throws IOException {
		String sCurrentLine;
		int i = 0;
		while ((sCurrentLine = bf.readLine()) != null) {
			rellenar(sCurrentLine, i, this.M);
			i++;
		}
	}


	private void rellenar(String cadena, int fila, int columna){
		for(int i = 0; i < columna ; i++){
			if(cadena.charAt(i) == '#') {
				this.painting[fila][i] = true;
				this.contador++;
			}
			else this.painting[fila][i] = false ;
		}
	}

	public void toStringPaint(boolean [] [] matriz){
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[0].length; j++){
				if (matriz[i][j])
					System.out.print("#");
				else
					System.out.print(".");
			}
			System.out.println("");
		}
	}
}
