import java.util.Scanner; 
class day4 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        int a = 13;
        int b = 52;
        int c = 2541;
        int penjumlahan = a + b + c ;

        double d = 42.2;
        double pembagian = d / (b + c) ;
        double perkalian = a + b * a * d ;
        System.out.print ("Nama : ");
        String Nama = scanner.nextLine();
        System.out.println ("Penjumlahan = " + a + " + " + b + " + " + c + " = " + penjumlahan);
        System.out.println ("Pembagian = " + d + " / " + b + " +" + c + " = " + pembagian);
        System.out.println ("Perkalian = " + a + " + " + b + " * " + a + " * " + d + " = " +perkalian );

    }
}
