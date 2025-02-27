package edu.luke.AnatomyClasses;
public class AnatomyOfCLass {
    public static void main(String[] args) {
        String firstName = "João";
        String lastName = "Silva";

        String fullName = completeName(firstName, lastName);
        
        System.out.println(fullName);
    }
    
    public static String completeName (String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
