import java.io.*;

class Fachada {

    private int filas;
    private int columnas;
    private int contador;
    private boolean[][] fachada;

    public Fachada (String fichero){
	try {
	    BufferedReader br = new BufferedReader(new FileReader(fichero));
	    String sCurrentLine = br.readLine();
	    String [] cr = sCurrentLine.split(" ");
	    int row = Integer.parseInt(cr[0]);
	    int column = Integer.parseInt(cr[1]);

	    this.filas = row;
	    this.columnas = column;
	    this.fachada = new boolean [row][column];

	    int i = 0;
	    while ((sCurrentLine = br.readLine()) != null) {
		rellenar(sCurrentLine, i, this.getColumnas());
		i++;
	    }
	    br.close();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}	
    }

    public int getFilas(){
	return this.filas;
    }

    public int getColumnas(){
	return this.columnas;
    }

    private void rellenar(String cadena, int fila, int columna){
	for(int i = 0; i < columna ; i++){
	    if(cadena.charAt(i) == '#') {
		this.fachada[fila][i] = true;
		this.contador++;
	    }
	    else this.fachada[fila][i] = false ;
	}
    }
	
    public Fachada (int filas, int columnas){
	this.filas = filas;
	this.columnas = columnas;
	this.fachada = new boolean [filas][columnas];
    }

    public String toString(){
	String toString = "";
	for (int i = 0; i < this.fachada.length; i++){
	    for (int j = 0; j < this.fachada[0].length; j++){
		if (fachada[i][j])
		    toString += "#";
		else
		    toString += ".";
	    }
	    toString += "\n";
	}
	return toString;
    }

    public static void main (String[] args){
	Fachada test = new Fachada(args[0]);

	System.out.println(test);
    }
}
