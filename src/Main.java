import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //input dosen
        Scanner masuk = new Scanner(System.in);
        Dosen k = new Dosen();//enkapsulasi
        System.out.println("=========================");
        System.out.println("|| masukkan data dosen ||");
        System.out.println("=========================");
        System.out.print("nidn          : ");
        k.setNidn(masuk.nextInt());
        System.out.print("nip           : ");
        k.setNip(masuk.nextInt());
        System.out.print("nama          : ");
        masuk.nextLine();
        k.setNama(masuk.nextLine());
        System.out.print("alamat     : ");
        k.setAlamat(masuk.nextLine());
        System.out.print("tahun masuk  : ");
        k.setTahun(masuk.nextInt());
        System.out.print("ttl           : ");
        masuk.nextLine();
        k.setTtl(masuk.nextLine());
        System.out.print("masukkan jumlah extra sks dalam 1 minggu  : ");
        k.setLebih_sks(masuk.nextInt());
        System.out.print("masukkan jurusan  :");
        masuk.nextLine();
        k.setJurusan(masuk.nextLine());
        //output dosen
        System.out.println("=============================");
        System.out.println("jurusan     : "+k.getJurusan());
        System.out.println("nidn            : "+k.getNidn());
        k.dosen();
        System.out.println("total sks       : "+k.getLebih_sks());
        k.dosen(k.getGaji(),k.getLebih_sks());
        System.out.println("============================");
        //////////////////////////

        Tendik t = new Tendik();//
        System.out.println("=========================");
        System.out.println("|| masukkan data tendik ||");
        System.out.println("=========================");
        System.out.print("nip           : ");
        t.setNip(masuk.nextInt());
        System.out.print("nama          : ");
        masuk.nextLine();
        t.setNama(masuk.nextLine());
        System.out.print("alamat     : ");
        t.setAlamat(masuk.nextLine());
        System.out.print("tahun masuk  : ");
        t.setTahun(masuk.nextInt());
        System.out.print("ttl           : ");
        masuk.nextLine();
        t.setTtl(masuk.nextLine());
        System.out.print("masukkan jumlah lembur (jam) 1 bulan : ");
        t.setLembur(masuk.nextInt());
        //output tendik
        System.out.println("========================");
        t.tendik();
        t.tendik(t.getGaji(),t.getLembur());

        
        
        
    }
}
