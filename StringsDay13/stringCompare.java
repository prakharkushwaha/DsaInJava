public class stringCompare {

    public static void main(String[] args) {
        // s1 and s2 will equal annswer whwn checjed with the == ,because it checks with
        // reference to object
        String s1 = "ramu bhai";
        String s2 = "ramu bhai";
        // s1 and s3 will not give the equal answer because s3 is allocated in the new
        // place
        // so thats why we have to use .euals()functions
        String s3 = new String("ramu bhai");
        // if (s1 == s2) {
        // System.out.println("both are equal");
        // } else
        // System.out.println("not equal");

        // if (s1 == s3) {
        // System.out.println("equal");
        // } else
        // System.out.println("not equal");
        if (s1.equals(s3)) {
            System.out.println("bith are equal");
        } else
            System.out.println("both are not equa");
    }

}
