public class Homework7 {
    public static void main(String[] args) {
        // Initialisation
        int workDay = 8; //hours in a working day
        int secInHour = 3600; //seconds in one hour

        // Generate random integer representing remaining seconds
        int n = (int) (Math.random() * (workDay * secInHour + 1)); // [0;28800] inclusive

        // Display seconds
        System.out.println(n);

        // Calculate & display hours
        int hours = n / secInHour;
        if (hours < 1)
            System.out.println("Осталось менее часа.");
        else if (hours == 1)
            System.out.println("Остался " + hours + " час.");
        else if (hours < 5)
            System.out.println("Осталось " + hours + " часа.");
        else
            System.out.println("Осталось " + hours + " часов.");
    }
}
