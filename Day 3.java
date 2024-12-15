import java.util.Scanner;
class Day3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama =");
        String nama = scanner.nextLine();
        System.out.print("Masukan Umur");
        int umu = scanner.nextInt();
        System.out.println("Nama anda " + nama + " Dan Umur anda "+ umu);

    }
}