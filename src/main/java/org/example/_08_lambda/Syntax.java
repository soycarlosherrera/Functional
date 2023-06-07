    package org.example._08_lambda;

    import org.example._06_referenceOperator.NamesUtils;

    import java.util.List;
    import java.util.function.*;

    public class Syntax {

        public static void main(String[] args) {
            List<String> cursos = NamesUtils.getList("Java", "Functional");

            cursos.forEach(curso -> System.out.println(curso));

            usarZero(() -> 2);

            usarPredicado(text -> text.isEmpty());

            usarBiFunction((x, y) -> x * y);

            usarBiFunction((x, y) -> {
                System.out.println("X: " + x + ", Y:" + y);
                return x - y;
            });

            usarNada(() -> {
                System.out.println("Hola Alumno");
            });

            usarBiFunction((Integer x, Integer y) -> x * y);
        }

        static void usarZero(ZeroArgumentos zeroArgumentos) {

        }

        static void usarPredicado(Predicate<String> predicado) {

        }

        static void usarBiFunction(BiFunction<Integer, Integer, Integer> operacion) {

        }

        static void usarNada(OperarNada operarNada) {

        }

        @FunctionalInterface
        interface ZeroArgumentos {
            int get();
        }

        @FunctionalInterface
        interface OperarNada {
            void nada();
        }



        private static void sintaxis() {
            //Una funcion puede ser definida de la siguiente manera:
            Function<String, String> funFunction = s -> "";













        //Y como vimos en la leccion anterior, si queremos ser muy especificos con el tipo:
        Function<String, String> boringFunction = (String s) -> "";












        //Tambien hemos mencionado que si nuestra funcion es muy extensa podemos usar {}
        Function<String, String> notFun = s -> {
            System.out.println("Ejecutando… 1");
            System.out.println("Ejecutando… 2");
            System.out.println("Ejecutando… 3");
            return "";
        };














        //La variante empieza cuando tenemos mas de un parametro, pues nos vemos obligados
        //a agrupar los parametros entre parentesis.
        BiFunction<String, String, Integer> biFunFunction = (xs, s) -> 0;

        //Incluso si ponemos el tipo explisito
        BiFunction<String, String, Integer> notFunBiFunction = (String xs, String s) -> 0;





















        //Si nuestra funcion (un Consumer tambien es una funcion) no hace nada,
        //Java nos exige que usemos { } como cuerpo de nuestra funcion.
        Consumer<String> consumer = s -> { };

















        //Y si nuestra funcion no toma parametros…
        //Java nos exige que usemos () para indicar la ausencia de los mismos:
        Supplier<String> textSupplier = () -> "Hello Carlos";
    }
}

