class UsoFraccion{

	static public void main(String args[]){

                Fraccion frac1 = new Fraccion(1,3);
                Fraccion frac2 = new Fraccion(1,2);

                Fraccion fRes = frac1.multiplicar(frac2);

                System.out.println(fRes.getA()+"/"+fRes.getB());
		System.out.println(fRes);
        }
}
