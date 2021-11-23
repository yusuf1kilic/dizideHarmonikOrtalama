package com.company;

public class Main {

    public static void main(String[] args) {
        //Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
        //Harmonik Seri Formülü :
        //11,7167600611309
        double[] list ={2.0,3.0,4.0,5.0};
        double harmonikSayi=0.0;
        for (int i=0;i< list.length;i++){
            harmonikSayi+=(1/list[i]);
        }
        System.out.println(list.length/harmonikSayi);


    }
}
