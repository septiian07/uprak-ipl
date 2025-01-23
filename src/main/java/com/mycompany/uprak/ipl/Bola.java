package com.mycompany.uprak.ipl;

class Bola extends BangunRuang {

    @Override
    public double hitungLuasPermukaan() {
        return PHI * Math.pow(diameter, 2);
    }

    @Override
    public double hitungVolume() {
        return (PHI * Math.pow(diameter, 3)) / 6;
    }
}
