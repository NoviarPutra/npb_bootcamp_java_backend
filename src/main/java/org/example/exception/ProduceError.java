package org.example.exception;

public class ProduceError {
    public static void main(String[] args) {
        String strToArr = "Ini ; Saya ... ";
        char[] chArr = strToArr.toCharArray();
        System.out.println(chArr.length);
        int intTampung = 0;
        for (int i = 0; i < chArr.length; i++) {
            intTampung = chArr[i];
            if (intTampung >= 58 && intTampung <= 64) {
                throw new IllegalArgumentException("Karakter Tidak Diperbolehkan ... " + chArr[i]);
            }
        }
        System.out.println("Berhasil kesini ....");
    }
}
