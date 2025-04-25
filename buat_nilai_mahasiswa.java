package com.nilai.mahasiswa;

import java.util.Scanner;

public class buat_nilai_mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim, nama, grade;
        double uts, uas,nilaih,nilaia, rata;
        
        System.out.println("=================== Data =====================");
        System.out.print("NIM: "); nim = input.next();
        System.out.print("Nama: "); nama = input.next();
        System.out.print("Nilai UTS: "); uts = input.nextDouble();
        System.out.print("Nilai UAS: "); uas = input.nextDouble();
        System.out.print("Nilai NILAIH: "); nilaih = input.nextDouble();
        System.out.print("Nilai NILAIA: "); nilaia = input.nextDouble();
        rata = (uts + uas + nilaih + nilaih ) / 4;
        
        if (rata < 50)
            grade = "E";
        else if (rata <60)
            grade = "D";
        else if (rata <70)
            grade = "C";
        else if (rata <80)
            grade = "B";
        else
            grade = "A";
        
        System.out.println("=========================================================================");
        System.out.println("NIM\tNama\t\tUTS\tUAS\\tNILAI_H\tNILAI_A\tRata2\tGrade");
        System.out.println("=========================================================================");
        System.out.println(nim+"\t"+nama+"\t"+uts+"\t"+uas+"\t"+nilaih+"\t" +nilaia+"\t"+rata+"\t"+grade);
        System.out.println("=========================================================================");
        System.out.println("");
        System.out.println("");
        
    }
}