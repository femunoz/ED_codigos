class Fibonacci{

	static public void main(String ars[]){


		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(7));
		System.out.println(fib(9));
	}

	static public int fib(int n){

		if(n==1 || n==2)
			return 1;

		return fib(n-1)+fib(n-2);

	}

}
