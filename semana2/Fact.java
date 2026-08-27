class Fact{

	static public void main(String args[]){

		System.out.println(fact(4));
	}

	public static int fact(int n){

		// CASO BASE:
		if (n==1)
			return 1;

		// CASO RECURSIVO:
		return n*fact(n-1);
	}
}
