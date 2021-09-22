public class CompleteInitailization {
    public static void main(String[]args){
        // declare variables
        int workOutDays = 10;
        double health = 8.5;
        boolean powerUp = true;
        final int MAX = 10;

        //output the variables
        System.out.print("Number of days: ");
        System.out.println(workOutDays);

        System.out.print("Health scale: ");
        System.out.println(health);

        System.out.print("Are you ready to power up? ");
        System.out.println(powerUp);

        System.out.println("Total assesment: It has been " + workOutDays +
                " days since you've started working out");

        System.out.println("You evaluate at " + health +
                " out of " + MAX + " on the health scale");

        System.out.println("Is it " + powerUp +
                " that you're ready to power up your workout!");
    }
}
