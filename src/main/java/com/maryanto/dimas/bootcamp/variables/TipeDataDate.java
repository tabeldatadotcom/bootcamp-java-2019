package com.maryanto.dimas.bootcamp.variables;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TipeDataDate{
    public static void main(String[] args) {
        Date tanggalSekarang = new Date();
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd MMM yyyy'T'HH:mm:ss");
        System.out.println(String.format("sekarang tanggal : %s", dateFormater.format(tanggalSekarang)));
    }
}