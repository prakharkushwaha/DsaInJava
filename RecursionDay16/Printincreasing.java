public class Printincreasing {
    public static void print(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(10);

    }

}

// IMPORTANT
// ek bat yad rkhni hai ----- stackoverflow hota hai
// 1--- to many calls ho jae
// 2-- y to kafi sare parameters kafi memory lele
// 3-- Base case hmsa lgana hai agr hm nhi lgyge to stack overflow hojyga
