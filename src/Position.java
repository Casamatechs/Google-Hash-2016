public class Position {

	private int fila;
	private int columna;

	public Position (){
	}

	public Position (int fila, int columna){
		this.fila = fila;
		this.columna = columna;
	}

	public void setFila(int fila){
		this.fila = fila;
	}

	public int getFila(){
		return this.fila;
	}

	public void setColumna (int columna){
		this.columna = columna;
	}

	public int getColumna (){
		return this.columna;
	}
