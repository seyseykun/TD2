package fr.dauphine.javaance.td2;


public class Main {
	public static void main(String[] args) throws Exception {
		
		Expr val = new Value(1337.0);
		System.out.println(val.eval());
		
		System.out.println(" ");
		
		
		Expr add = new Add(new Value(327.0),val);
		System.out.println(add.eval());
	
		 
		System.out.println(" ");
		 
		Expr e = new Add(new Value(350.0), add);
		
		System.out.println(e.eval()); //affiche 2014.0*/
		
		System.out.println(" ");
		
		Expr multi = new Multiplication(new Value(2),e);
		System.out.println(multi.eval());
		
		System.out.println(" ");
		
		Expr valueTest = new Value(100);
		Expr sqrt = new Squareroot(valueTest);
		System.out.println(sqrt.eval());
	}
}