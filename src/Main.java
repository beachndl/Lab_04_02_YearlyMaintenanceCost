public class Main {
    public static void main(String[] args) {
        // Maintenance cost of each season
        double springCost = 446.25;
        double summerCost = 568.75;
        double fallCost = 861.85;
        double winterCost = 564.95;

        // Calculate total yearly cost
        double totalYear = springCost + summerCost + fallCost + winterCost;

        // Display seasonal costs
        System.out.println("Spring Maintenance Cost: $" + springCost);
        System.out.println("Summer Maintenance Cost: $" + summerCost);
        System.out.println("Fall Maintenance Cost: $" + fallCost);
        System.out.println("Winter Maintenance Cost: $" + winterCost);

        // Display total yearly cost
        System.out.println("Total Yearly Maintenance Cost: $" + totalYear);
    }
}