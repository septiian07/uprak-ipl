package com.mycompany.uprak.ipl;

import java.util.Scanner;

public class BangunRuangApps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang Balok: ");
        double panjang = scanner.nextDouble();

        System.out.print("Lebar Balok: ");
        double lebar = scanner.nextDouble();

        System.out.print("Tinggi Balok: ");
        double tinggi = scanner.nextDouble();

        Balok balok = new Balok();
        balok.setPanjang(panjang);
        balok.setLebar(lebar);
        balok.setTinggi(tinggi);

        System.out.println("\n== BALOK ==");
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
        System.out.println("Volume Balok: " + balok.hitungVolume());

        System.out.print("\n\nDiameter Bola: ");
        double diameter = scanner.nextDouble();

        Bola bola = new Bola();
        bola.setDiameter(diameter);

        System.out.println("\n== BOLA ==");
        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());

        scanner.close();
        
        System.out.println("\n\n=== Dibuat oleh Septian Yoga ===");
    }
}
