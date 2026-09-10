public class Problemas {

    static public void main(String args[]) {
        PilaArreglo p = new PilaArreglo();

        String pal = "algoritmo";

        for (int i = 0; i < pal.length(); i++) {
            p.apilar(pal.charAt(i));
        }

        String retPal = "";

        for (int i = 0; i < pal.length(); i++) {
            retPal += p.desapilar();
        }

        System.out.println(retPal);

    }
}
