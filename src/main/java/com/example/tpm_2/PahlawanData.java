package com.example.tpm_2;

import java.util.ArrayList;

public class PahlawanData {
    private static String[] title = new String[] {
            "Ahmad Dahlan",
            "Ahmad Yani",
            "Sutomo",
            "Gatot Soebroto",
            "Ki Hadjar Dewantarai",
            "Mohammad Hatta",
            "Soedirman",
            "Soekarno",
            "Soepomo",
            "Tan Malaka"
    };
    private static int[] thumbnail = new int[]{
            R.drawable.ahmad_dahlan,
            R.drawable.ahmad_yani,
            R.drawable.bung_tomo,
            R.drawable.gatot_subroto,
            R.drawable.ki_hadjar_dewantara,
            R.drawable.mohammad_hatta,
            R.drawable.sudirman,
            R.drawable.sukarno,
            R.drawable.supomo,
            R.drawable.tan_malaka
    };
    public static ArrayList<PahlawanModel> getListData(){
        PahlawanModel pahlawanModel = null;
        ArrayList<PahlawanModel> list = new ArrayList<>();
        for (int i = 0;i <title.length;i++){
            pahlawanModel = new PahlawanModel();
            pahlawanModel.setmFotoPahlawan(thumbnail [i]);
            pahlawanModel.setmNamaPahlawan(title[i]);
            list.add(pahlawanModel);
        }
    }
}
