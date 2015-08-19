package com.tho.traffic;

/**
 * Created by Lab on 8/17/2015.
 */
public class MyData {
    public String[] title() {
        String[] strTitle = new String[20];
        strTitle[0] = "ຫ້າມລ້ຽວຊ້າຍ";
        strTitle[1] = "ຫ້າມລ້ຽວຂວາ";
        strTitle[2] = "ໄປຊື່ໆ";
        strTitle[3] = "ລ້ຽວຂວາ";
        strTitle[4] = "ລ້ຽວຊ້າຍ";
        strTitle[5] = "ທາງອອກ";
        strTitle[6] = "ທາງເຂົ້າ";
        strTitle[7] = "ທາງອອກ";
        strTitle[8] = "ຢຸດລົດ";
        strTitle[9] = "ຈໍາກັດຄວາມໄວທີ່ 2.5 ແມັດ";
        strTitle[10] = "ແຍກຊ້າຍ ແລະ ຂົດ";
        strTitle[11] = "ຫ້າມລ້ຽວລົດ";
        strTitle[12] = "ຫ້າມຈອດ";
        strTitle[13] = "ລົດສວນ";
        strTitle[14] = "ຫ້າມແຊງ";
        strTitle[15] = "ທາງເຂົ້າ";
        strTitle[16] = "ຢຸດລົດ";
        strTitle[17] = "ຈໍາກັດຄວາມໄວທີ່ 50 km/hr";
        strTitle[18] = "ຈໍາກັດຄວາມກ້ວາງຂອງລົດທີ່ 2.5 ແມັດ";
        strTitle[19] = "ຈໍາກັດຄວາມສູງລົດທີ່ 5 ແມັດ";


        return strTitle;
    }// method Title

    public int[] icon() {
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
                R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09,
                R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15,
                R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};

        return intIcon;
    } //method icon


}//main class
