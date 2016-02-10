public class Fill {

	private Fachada fachada;

	private Position posicion;
	private Position ultima_pintada;

	private boolean haySiguienteCasilla(){
		return (posicion.getFila <= fachada.getFilas())
			&& (posicion.getColumna() < fachada.getColumnas());
	}

	public Position siguienteCasilla(){
		if (haySiguienteCasilla) {
			if (posicion.getColumna()<fachada.getColumnas())
				return new Position(posicion.getFila(), posicion.getColumna()++);
			else
				if (posicion.getFila() < fachada.getFilas())
					return new Position(posicion.getFila()++, 0);
			
		}
	}
}
