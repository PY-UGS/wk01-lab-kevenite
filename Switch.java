//Lab 1 Question 2
public class Switch {
    public static void main(String[] args) {
        String module = "CSC1009";
        switch (module) {
            case "CSC1006" -> System.out.println("Mathematics 2");
            case "CSC1007" -> System.out.println("Operating Systems");
            case "CSC1008" -> System.out.println("Data Structures and Algorithm");
            case "CSC1009" -> System.out.println("Object-Oriented Programming");
            case "CSC1010" -> System.out.println("Computer Networks");
            default -> System.out.println("Unknown Modules");
        }
        System.out.println("After switch");
    }
}
