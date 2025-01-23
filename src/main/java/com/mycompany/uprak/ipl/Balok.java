package com.mycompany.uprak.ipl;

class Balok extends BangunRuang {

    @Override
    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
