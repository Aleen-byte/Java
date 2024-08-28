public class teste {
    public static void main(String[] args) {
        int z = 200;
        double x = 52.4455d;
        int y = (int) x;                                         // transforma double em int
        y += 5;                                                  // acrescenta 5 à variável
        String txt = "Hello World ";
        String txt2 = "God is Good";

        System.out.println(x);
        System.out.println(y);
        System.out.println(++y);                                 // acrescenta 1 ao numero da variavel
        System.out.println(txt.length());                        // numero de letras da palavra
        System.out.println(txt.toUpperCase());                   // CAIXA ALTA
        System.out.println(txt + txt2);                          // juntar Strings (palavras)
        System.out.println(txt.concat(txt2));                    // usando um metodo para concatenar duas Strings
        System.out.println(txt.indexOf("W"));                    // indica o posição da letra selecionada
        
        System.out.println(Math.max(z, y));  //Math.max(x, y);   // mostra o maior número entre os dois selecionados
        System.out.println(Math.sqrt(z));                        // raiz quadrada de um número 
        System.out.println(Math.random());                       // número aleatório entre 1 e 0


        // if...else reduzido ((condição)if = ?, else = :)
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result); 

        int i = 1;while(i < 6) {                                 // "enquanto" i < 6, ele irá printar, sistema de loop
            System.out.println(i);i++;                           // printa o i e acrescenta 1 ao valor, depois printa novamente
        }
        
        do {System.out.println(i);i++;}                          // estrutura de repetição tbm, mesmo esquema, "faça...enquanto"
        while (i < 6);

        for(i = 0; i < 5; i++)                                   // usando o "for" como estrutura de repetição, não precisei declarar o int, pois já tenho um "int i"
        {System.out.println("Yes");}                             //... aí, com o i=0 se i < 5 ele vai printar e acrescentar 1 ao i, e assim repetidamente até o i ser = a 5
        
        String[] cars = {"Volvo ", "BMW ", "Ford "};              // fazendo lista com String (Array)
        for (String c : cars)                                     // usando o for para printar listas
        { System.out.println(c);}

        System.out.println(cars[1]);                              // seleciona um membro da lista(Array), começando pelo valor 0

        for ( i = 0; i < 10; i++) {                               
            if (i == 4) {                               
                continue;                                         // pula o número 4 e continua a sequencia até "quebrar"
            }
            System.out.println(i);}






    }
}
