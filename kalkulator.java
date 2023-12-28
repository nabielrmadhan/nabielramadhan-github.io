import java.util.Scanner;

public class kalkulator{  
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("==Kalkulator==");

        System.out.println("1). gunakan rumus");
        System.out.println("2). tanpa rumus");

        System.out.println();
        System.out.println("input opsi");
        int pilihan_opsi = scn.nextInt();
        System.out.println();

        if (pilihan_opsi == 1) {
            System.out.println("==rumus==");
            System.out.println("1). keliling persegi");
            System.out.println("2). luas persegi");
            System.out.println();

            System.out.println("input opsi");
            int pilihan_opsi_2 = scn.nextInt();
            System.out.println();

            if (pilihan_opsi_2 == 1) {
                System.out.println("input sisi");
                int sisi = scn.nextInt();

                System.out.println("hasil keliling persegi");
                System.out.println(sisi * 4);
            } else {
                System.out.println("input sisi");
                int sisi = scn.nextInt();

                System.out.println("hasil luar persegi");
                System.out.println(sisi * sisi);
            }
        } else if (pilihan_opsi == 2) {
            System.out.println("==tanpa rumus==");
            System.out.println("1). perjumlahan");
            System.out.println("2). pengurangan");
            System.out.println("3). perkalian");
            System.out.println("4). pembagian");

            System.out.println("pilihan rumus");
            int pilihan_rumus_aritmatika = scn.nextInt();

            if (pilihan_rumus_aritmatika == 1) {
                System.out.println("===perjumlahan===");
                System.out.print("input angka : ");
                int angka1 = scn.nextInt();

                System.out.print("input angka : ");
                int angka2 = scn.nextInt();

                System.out.println("-------------");
                System.out.println("hasil " + angka1 + " + " + angka2);
                System.out.println("= " + (angka1 + angka2));

            } else if (pilihan_rumus_aritmatika == 2) {
                System.out.println("===pengurangan===");
                System.out.print("input angka : ");
                int angka1 = scn.nextInt();

                System.out.print("input angka : ");
                int angka2 = scn.nextInt();

                System.out.println("-------------");
                System.out.println("hasil " + angka1 + " - " + angka2);
                System.out.println("= " + (angka1 - angka2));

            } else if (pilihan_rumus_aritmatika == 3) {
                System.out.println("===perkalian===");
                System.out.print("input angka : ");
                int angka1 = scn.nextInt();

                System.out.print("input angka : ");
                int angka2 = scn.nextInt();

                System.out.println("-------------");
                System.out.println("hasil " + angka1 + " x " + angka2);
                System.out.println("= " + (angka1 * angka2));
            } else if (pilihan_rumus_aritmatika == 4) {
                System.out.println("===pembagian===");
                System.out.print("input angka : ");
                int angka1 = scn.nextInt();

                System.out.print("input angka : ");
                int angka2 = scn.nextInt();

                System.out.println("-------------");
                System.out.println("hasil " + angka1 + " : " + angka2);
                System.out.println("= " + (angka1 / angka2));
    }
}
     }
      
    }