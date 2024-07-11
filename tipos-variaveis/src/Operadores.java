public class Operadores {

    public static void main(String[] args) {
       
        int numero = 5;
        //x repetição
        numero = numero + 2;
        numero++;
        // adiciona +1
        System.out.println(numero);


        boolean variavel = false;
        System.out.println(!variavel);


        int a, b;
        a = 5;
        b = 6;
        if(a==b)
         System.out.println("Verdadeiro");
        else
        System.out.println("Falso");


        String resultado = (a==b) ? "verdadeiro" : "false";
         System.out.println(resultado);


        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 != num2;

        System.out.println(num1 + " é diferente de " + num2 + "? " +simNao);

        simNao = num1 > num2;

        System.out.println(num1 + " é maior que " + num2 + "? " +simNao);

    }
    
}
