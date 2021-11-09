package tugas;

public class Lingkaran {

        public double phi;
        public double r;
    
        public void hitungLuas() {
            double Luas = phi * r * r;
            System.out.println("Luas Lingkaran : " + Luas);
        }
    
        public void hitungKeliling() {
            double Kel = 2 * phi * r;
            System.out.println("Keliling Lingkaran : " + Kel);
        }
}

