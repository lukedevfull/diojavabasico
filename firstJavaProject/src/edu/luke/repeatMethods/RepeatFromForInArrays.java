package edu.luke.repeatMethods;

public class RepeatFromForInArrays {
    public static void main(String[] args) {
        String[] names = {"João", "Maria", "Pedro", "Ana", "Lucas","Victor", "Gabriel","Matheus","Larissa","Isabella"};
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println("Nome de indice " + (i + 1) + ": " + names[i] + ".");
        // }

        // Utilizando foreach
        for (String name : names) {
            System.out.println("Usuario: " + name);
        }
    }
}
