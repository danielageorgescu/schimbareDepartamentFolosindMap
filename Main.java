package com.itfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    @Override
    public String toString() {
        return new StringJoiner(", ", Main.class.getSimpleName() + "[", "]")
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        Map<Persoana, Departament> map = new HashMap<>();
        map.put(new Persoana(103, "Maria", "Draghici"), new Departament("Financiar"));
        map.put(new Persoana(104, "Dana", "Vasiloiu"), new Departament("Financiar"));
        map.put(new Persoana(105, "Bogdan", "Grigore"), new Departament("Financiar"));

        System.out.println("Introduceti ID-ul dorit: ");
        Scanner scanner = new Scanner(System.in);
        int IDscanat = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti numele persoanei cu ID-ul mentionat anterior:");
        Scanner scanner1 = new Scanner(System.in);
        String numeScanat = scanner1.nextLine();
        System.out.println("Introduceti prenumele persoanei cu ID-ul mentionat anterior: ");
        Scanner scanner2 = new Scanner(System.in);
        String prenumeScanat = scanner2.nextLine();

        if (!map.containsKey(new Persoana(IDscanat, numeScanat, prenumeScanat))){
            System.out.println("Nu exista persoana cautata in sistem");
        }else{
            System.out.println("Persoana mentionata apartine Departamentului: "+map.get(new Persoana(IDscanat, numeScanat, prenumeScanat)).getNumeDepartament());
            System.out.println("Introduceti numele noului Departament: ");
            Scanner scanner3 = new Scanner(System.in);
            String departamentScanat= scanner3.nextLine();

            if ((map.get(new Persoana(IDscanat, numeScanat, prenumeScanat)).getNumeDepartament().equals(departamentScanat))){

                System.out.println("Persoana mentionata este deja in acest Departament");
            }else {
               map.put(new Persoana(IDscanat,numeScanat, prenumeScanat), new Departament(departamentScanat));
                System.out.println(map.get(new Persoana(IDscanat, numeScanat, prenumeScanat)).getNumeDepartament());
           }
        }
    }
}
