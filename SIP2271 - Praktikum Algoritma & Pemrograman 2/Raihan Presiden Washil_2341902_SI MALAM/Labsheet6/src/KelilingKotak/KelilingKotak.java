package KelilingKotak;

import Kotak.Kotak;

class KelilingKotak {

    public static void main(String[] args) {
        double panjang, lebar, keliling;
        panjang = 20;
        lebar = 10.5;
        keliling = Kotak.perolehKeliling(panjang, lebar);
        System.out.println("Keliling = " + keliling);
    }
}
