public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix"); //System.out.println() es para Imprimir.

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2; //Puntuacion media de la pelicula

        double media = (8.2 + 6.0 + 9.0) / 3; //sacando la puntuacion media de la pelicula.
        System.out.println(media);

//Aqui va la sinopsis de nuestra pelicula en un bloque de Texto.
        String sinopsis = """ 
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:""" + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2); /*Se tiene que cambiar de tipo de datos asi que se usa el casting, usando la tabla que está en Fundamentos de JAVA*/
        System.out.println(clasificacion);
    }
}
