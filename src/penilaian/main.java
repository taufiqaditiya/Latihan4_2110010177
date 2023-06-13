package penilaian;

public class main {
    public static void main(String[] args) {
       NilaiAkhir adit = new NilaiAkhir ("M. Aditiya Taufiqurrahman","2110010177",90,95,95); 
    
    
        System.out.println("Nama Mahasiswa: "+adit.getNama());
        System.out.println("NPM Mahasiswa: "+adit.getNpm());
        System.out.println("Nilai Akhir: "+adit.hitungNilaiAkhir());
    
    
    }
}
