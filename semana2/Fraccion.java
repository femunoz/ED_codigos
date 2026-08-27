class Fraccion{

	// estamos representando la fracción a/b
	private int a;
	private int b;

	public Fraccion(int num, int den){

		this.a = num;
		b= den;
	}

	public Fraccion multiplicar(Fraccion f1){

		return new Fraccion(f1.a*this.a, f1.b * this.b);
	}

	public int getA(){
		return this.a;
	}

	public int getB(){
		return this.b;
	}
	
	public String toString(){
		return this.a+"/"+this.b;
	}
}
