package fr.dauphine.javaance.td2;

public interface Expr {
	

	public default double eval(){
		return 0;
	}

	public double getValeur();
	

}
