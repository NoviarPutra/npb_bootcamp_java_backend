package org.example.looping;

public class LoopFor {
    public static void main(String[] args) {
        System.out.println(1.0);

//        for(int i=1;
//            i<=10;
//            i++){
//            System.out.println("Nilai i adalah : "+i);
//            for (int j = 0;
//                 j < 5;
//                 j++) {
//            }
//        }

//        boolean isFound = false;
//        for(int j=0;j<5;j++){
//            if(j==2){
//                isFound = true;
//                break;
//            }
//            System.out.println("Nilai i adalah : "+j);
//        }
//        if(isFound){
//            System.out.println("SUDAH KETEMU");
//        }else {
//            System.out.println("BELUM DITEMUKAN");
//        }

        // ini variabel untuk bla blabla 1
        int x, y, z, h, f;

        for (int i = 1; i <= 5; i++) {
            if (i == 2) {// saya
                continue;
            }
            for (int j = 1; j <= 3; j++) {
                System.out.println("Nilai i : " + i + " J Tereksekusi " + j);
            }
        }


        String strHuruf = "J";
        strHuruf = strHuruf.toLowerCase();
        if (strHuruf.equals("a") || strHuruf.equals("i") ||
                strHuruf.equals("u") || strHuruf.equals("e")
                || strHuruf.equals("o")
        ) {
            System.out.println("Huruf ini adalah Vokal");
        } else {
            System.out.println("Huruf ini adalah Konsonan");
        }
    }
}
