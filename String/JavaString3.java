class JavaString3 {
    public static void main (String [] args ) {
        String name = "Ansh"; // %S
        String country = "India"; 
        int age = 21; // %d
        double gpa = 3.8; // %.f
        // System.out.println("Hello World, I am " + name + ". I am from "+country+", I am " +age+ " year old");
        boolean allTellingTruth = false; // %b
        String formattedString = String.format("I am %s. I am from %s. I am %d year old.And my gpa is %.2f is all are %b claims.",  name, country, age, gpa, allTellingTruth);
        System.out.println(formattedString);
    }
}