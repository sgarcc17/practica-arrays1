package es.unileon.prg1.arrays;

/**
 * Pasar a limpio la siguiente clase. 
 *
 * Crear clase JuegoArray.java que contenga todo el codigo de esta clase ordenado:
 *  - las funciones max y min que devuelven el valor maximo y minimo de un array(deben retornar valor ) (después ya lo imprimís)
 *  - los atributos que consideres necesarios
 *  - metodo que muestra los elementos del array que se la pasa por parametro
 *
 * Esta clase ClasePrincipal:
 *  - Contendra solamente el main
 *  - Creara los objetos necesarios para probar todas las funciones de vuestra clase JuegoArray
 *
 * Todo debera ser compilado con un build xml (conservar el paquete )
 *
 * Incluir los comentarios necesarios con estilo javadoc
 *
 * Podeis renombrar los metodos o las clases a una politica de naming que os guste mas
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int[] numbersIntSmaller = new int[3] ;
        int[][] listado = new int[3][];
        int sumaElementos = 0, sumaElementos2 = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        // This approach is not used this course
        for (int number: numbers) {
            sumaElementos += number;
        }

        for(int i = 0 ; i < numbers.length ; i++) {
            sumaElementos2 += numbers[i];
        }

        System.out.println("sumaElementos: "+sumaElementos+" -SumaElementos2: "+sumaElementos2);

        StringBuilder miCadena = new StringBuilder("Nueva Cadena");

        System.out.println("StringBuilder       : " + miCadena);
        System.out.println("StringBuilder length: " + miCadena.length());
        System.out.println("StringBuilder capacity: " + miCadena.capacity());

        // get the total number of elements
        int arrayLength = numbers.length;
        int arrayLengthSmaller = numbersIntSmaller.length;

        System.out.println("arrayLength: "+arrayLength+ "- arrayLengthSmaller:"+arrayLengthSmaller);

        for(int f = 0; f<numbers.length;f++ ){
            System.out.println("numbers: [" +f+"] - "+numbers[f]);
        }

        for(int f = 0; f < numbersIntSmaller.length;f++ ){
            numbersIntSmaller[f] = f*2;
            System.out.println("numbers: [" +f+"] - "+numbersIntSmaller[f]);
        }

        // calculate the average
        // convert the average from int to double
        average =  ((double)sumaElementos2 / (double)arrayLength);

        System.out.println("Sum = " + sumaElementos2);
        System.out.println("Average = " + average);

        int a[]={33,3,4,-5};//declaring and initializing an array

        // Prueba de clase JuegoArray;
        JuegoArray miClase = new JuegoArray();
        int minValue = miClase.min(a);
        int maxValue = miClase.max(a);
        System.out.println("min(a): " + minValue);
        System.out.println("max(a): " + maxValue);
        miClase.showArrayValues(a);
    }

}