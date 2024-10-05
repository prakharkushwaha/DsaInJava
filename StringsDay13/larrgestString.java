public class larrgestString {
    public static void main(String[] args) {
        String cars[] = { "hyundai", "suzuki", "mercedes", "tata" };
        String largest = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (largest.compareTo(cars[i]) < 0) {
                largest = cars[i];
            }

        }
        System.out.println(largest);
    }

}
