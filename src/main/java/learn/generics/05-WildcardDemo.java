package learn.generics;

// Use a wildcard.
class BetterStats<T extends Number> {
    T[] nums;       // array of Number or class

    // Pass the constructor a reference to an array of type Number or subclass.
    BetterStats(T[] o) {
        nums = o;
    }

    // Return type double in all cases.
    double average() {
        double sum = 0;

        for(T num : nums) sum += num.doubleValue();

        return sum / nums.length;
    }

    // Determine if two averages are the same. Notice the use of the wildcard.
    boolean isSameAvg(BetterStats<?> ob) {
        return average() == ob.average();
    }
    // BetterStats<?> matches any BetterStats object, allowing any two Stats objects to have their averages compared.
}

// Demonstrate wildcard.
class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = { 1, 2, 3, 4, 5 };
        BetterStats<Integer> iob = new BetterStats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        BetterStats<Double> dob = new BetterStats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        Float[] fnums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        BetterStats<Float> fob = new BetterStats<Float>(fnums);
        double x = fob.average();
        System.out.println("fob average is " + x);

        // See which arrays have same average.
        System.out.print("Averages of iob and dob ");
        if(iob.isSameAvg(dob))
            System.out.println("are the same.");
        else
            System.out.println("differ.");

        System.out.print("Averages of iob and fob ");
        if(iob.isSameAvg(fob))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
    }
}