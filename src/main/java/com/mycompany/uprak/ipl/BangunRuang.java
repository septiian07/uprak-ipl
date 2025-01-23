package com.mycompany.uprak.ipl;

interface HitungLuasPermukaan {

    double hitungLuasPermukaan();
}

interface HitungVolume {

    double hitungVolume();
}

abstract class BangunRuang implements HitungLuasPermukaan, HitungVolume {

    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected double diameter;
    protected final double PHI = Math.PI;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
