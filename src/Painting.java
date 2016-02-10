
public class Painting {

    private boolean[][] matrix;

    public Painting(boolean[][] matrix) {
	this.matrix = matrix;
    }
    
    public void PAINT_SQUARE (boolean[][] matrix, int x, int y, int s) {
	if(s==0) { matrix[x][y] = true; }
	else {
	    for (int i = x-s; i<=x+s; i++) {
		for (int j = y-s; j<=y+s; j++) {
		    matrix[i][j] = true;
		}
	    }
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

    public boolean[][] getImagen(){
	return this.matrix;
    }
    
    public void ERASE_CELL (boolean[][] matrix, int x, int y) {
	matrix[x][y] = false;
    }

    public void PAINT_LINE (boolean[][] matrix, int x1, int y1, int x2, int y2) {
	if(y1==y2) {for (int j = x1; j<=x2; j++) { matrix[j][y1] = true; } }
	if(x1==x2) {for (int i = y1; i<=y2; i++) { matrix[x1][i] = true; } }	
	
    }
	    
	    

    public static void main (String args[]) {
	boolean[][] prueba = {{false,false,false,false,false},
			      {false,false,false,false,false},
			      {false,false,false,false,false},
			      {false,false,false,false,false},
			      {false,false,false,false,false}};
	Painting miTest = new Painting(prueba);
	miTest.toStringPaint(miTest.getImagen());
	miTest.PAINT_SQUARE(miTest.getImagen(),2,2,0);
	miTest.PAINT_LINE(miTest.getImagen(),0,0,0,4);
	miTest.PAINT_LINE(miTest.getImagen(),0,0,4,0);
	miTest.PAINT_LINE(miTest.getImagen(),4,0,4,4);
	miTest.PAINT_LINE(miTest.getImagen(),0,4,4,4);
	miTest.PAINT_LINE(miTest.getImagen(),1,1,1,2);
	miTest.ERASE_CELL(miTest.getImagen(),1,1);
	miTest.toStringPaint(miTest.getImagen()); 
    }
}
