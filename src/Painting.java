
public class Painting {

    public void PAINT_SQUARE (boolean[][] matrix, int x, int y, int s) {
	if(s==0) { matrix[x][y] = true; }
	else {
	    for (int i = x-s; i<x+s; i++) {
		for (int j = y-s; j<y+s; j++) {
		    matrix[i][j] = true;
		}
	    }
	}
    }

    public void ERASE_CELL (boolean[][] matrix, int x, int y) {
	matrix[x][y] = false;
    }

    public void PAINT_LINE (boolean[][] matrix, int x1, int x2, int y1, int y2) {
	if(x1==x2)  for (int i = y1; i<y2; i++) { matrix[x1][i] = true; } 
	else if (y1==y2)  for (int i = x1; i<x2; i++) { matrix[i][y1] = true; } 
    }
}
