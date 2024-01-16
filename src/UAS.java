import java.util.ArrayList;
import java.util.Random;

public class UAS {
    public static void main(String[] args) {

        ArrayList<Integer> Biru = new ArrayList<>();
        ArrayList<Integer> Merah = new ArrayList<>();
        ArrayList<Integer> Hijau = new ArrayList<>();
        ArrayList<Integer> Oranye = new ArrayList<>();
        ArrayList<Integer> Hitam = new ArrayList<>();
        ArrayList<Integer> Ungu = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 20000; i++) {
            int warnaRandom = random.nextInt(7);
            switch (warnaRandom) {
                case 0:
                    Biru.add(1);
                    break;
                case 1:
                    Merah.add(1);
                    break;
                case 2:
                    Hijau.add(1);
                    break;
                case 3:
                    Oranye.add(1);
                    break;
                case 4:
                    Hitam.add(1);
                    break;
                case 5:
                    Ungu.add(1);
                    break;
            }
        }

        int Jumlah_Biru = Biru.size();
        int Jumlah_Merah = Merah.size();
        int Jumlah_Hijau = Hijau.size();
        int Jumlah_Oranye = Oranye.size();
        int Jumlah_Hitam = Hitam.size();
        int Jumlah_Ungu = Ungu.size();

        int biruMax = 0;
        int biruMin = Integer.MAX_VALUE;
        int merahMax = 0;
        int merahMin = Integer.MAX_VALUE;
        int hijauMax = 0;
        int hijauMin = Integer.MAX_VALUE;
        int oranyeMax = 0;
        int oranyeMin = Integer.MAX_VALUE;
        int hitamMax = 0;
        int hitamMin = Integer.MAX_VALUE;
        int unguMax = 0;
        int unguMin = Integer.MAX_VALUE;

        for (int i = 0; i < Biru.size(); i++) {
            if (Biru.get(i) > biruMax) {
                biruMax = Biru.get(i);
            }
            if (Biru.get(i) < biruMin) {
                biruMin = Biru.get(i);
            }
        }

        for (int i = 0; i < Merah.size(); i++) {
            if (Merah.get(i) > merahMax) {
                merahMax = Merah.get(i);
            }
            if (Merah.get(i) < merahMin) {
                merahMin = Merah.get(i);
            }
        }
        System.out.println("Total Produksi Setiap Warna: ");
        System.out.println("Biru: " + Jumlah_Biru);
        System.out.println("Merah: " + Jumlah_Merah);
        System.out.println("Hijau: " + Jumlah_Hijau);
        System.out.println("Oranye: " + Jumlah_Oranye);
        System.out.println("Hitam: " + Jumlah_Hitam);
        System.out.println("Ungu: " + Jumlah_Ungu);

    }
}
