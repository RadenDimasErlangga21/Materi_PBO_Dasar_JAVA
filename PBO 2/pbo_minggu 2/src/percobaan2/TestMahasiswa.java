
package percobaan2;

public class TestMahasiswa {
    public static void main(String args[]) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();

        mhs2.nim=202;
        mhs2.nama="Raden";
        mhs2.alamat="Jl. Abcd No 1B";
        mhs2.kelas="1E";
        mhs2.tampilBiodata();

        mhs3.nim=303;
        mhs3.nama="Dimas";
        mhs3.alamat="Jl. Abcde No 1C";
        mhs3.kelas="1E";
        mhs3.tampilBiodata();
    }
}
