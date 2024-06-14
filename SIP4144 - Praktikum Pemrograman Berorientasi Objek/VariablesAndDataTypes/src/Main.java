
class tipeDataReferensi {

    int rescue;
}

public class Main {

    private static class tipedataReferensi {

        private int rescue;

        public tipedataReferensi() {
            int rescue;
        }
    }

    public static void main(String[] args) {

        System.out.println("------------------Data Types used with variables----------------------");

        byte byteData = 100;
        short shortData = 501;
        int intData = 999;
        char charData = 'A';
        float floatData = 99.99f;
        double doubleData = 99.999;
        boolean booleanData1 = true;
        boolean booleanData2 = false;

        System.out.println("Contoh tipe data byte    = " + byteData);
        System.out.println("Contoh tipe data short   = " + shortData);
        System.out.println("Contoh tipe data integer = " + intData);
        System.out.println("Contoh tipe data char    = \'" + charData + "\'");
        System.out.println("Contoh tipe data float   = " + floatData);
        System.out.println("Contoh tipe data double  = " + doubleData);
        System.out.println("Contoh tipe data boolean = " + booleanData1);
        System.out.println("Contoh tipe data boolean = " + booleanData2);

        System.out.println("-----------------Data Type Reference----------------------");

        tipedataReferensi mengacu_ke;	// pendeklarasian variabel dgn tipe data class
        mengacu_ke = new tipedataReferensi();	// instansiasi tipe data class menjadi objek
        mengacu_ke.rescue = 911;	// mengakses objek -> tipedataReferensi melalui variabel objek 'mengacu_ke'
        System.out.println("Variabel objek \'mengacu_ke\' bernilai -> " + mengacu_ke.rescue);

        System.out.println("--------------------------Char Khusus-------------------");

        System.out.println("Java\nLanguage");
        System.out.println("\n");
        System.out.println("\'Programing\'");
        ;

    }

}
