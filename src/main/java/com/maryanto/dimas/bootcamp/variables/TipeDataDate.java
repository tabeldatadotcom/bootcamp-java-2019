package com.maryanto.dimas.bootcamp.variables;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TipeDataDate{
    public static void main(String[] args) {
        Date tanggalSekarang = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm");
        System.out.println(String.format("sekarang tanggal : %s", simpleDateFormat.format(tanggalSekarang)));
    }
}