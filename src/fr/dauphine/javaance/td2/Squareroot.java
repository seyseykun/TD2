package fr.dauphine.javaance.td2;

public class Squareroot implements Expr{
	private Expr expr;

	

	public Squareroot( Expr exp) {
		 
		this.expr = exp;
	}
	
	@Override
	public double eval() {
		System.out.println("Utilisation de la racine carrée \u221a en cours...");
		double res = Math.sqrt(this.expr.eval());
		return res;
	}

	@Override
	public double getValeur() {
		// TODO Auto-generated method stub
		return 0;
	}

}