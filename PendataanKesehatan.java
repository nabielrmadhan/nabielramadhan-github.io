import java.util.Scanner;

public class PendataanKesehatan {
    public static boolean ulang = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Masukkan nama anda: ");
            String nama = input.next();

            System.out.println("Masukkan umur: ");
            int umur = input.nextInt();
            input.nextLine();

            if (umur < 18) {
                System.out.println("Apakah bersekolah? (ya/tidak): ");
                String bersekolah = input.next();

                if (bersekolah.equals("ya")) {
                    System.out.println("Kategori: penduduk Mampu");
                } else if (bersekolah.equals("tidak")) {
                    System.out.println("Kategori: penduduk kurang mampu");
                }
            } else {
                System.out.println("Pendapatan perbulan: ");
                int pendapatan = input.nextInt();
                System.out.println("Yang ditanggung: ");
                int tanggung = input.nextInt();

                int biayahidup = pendapatan / tanggung;
                if (biayahidup > 1000000) {
                    System.out.println("Anda termasuk golongan mampu");
                } else {
                    System.out.println("Anda termasuk golongan tidak mampu");
                }
                System.out.println("Apakah anda mau lanjut? ");

                String lanjut = input.next();
                if (lanjut.equalsIgnoreCase("ya")) {
                    continue;
                } else if (lanjut.equalsIgnoreCase("tidak")) {
                    break;
                }
            }
        } while (ulang);
    }
}
