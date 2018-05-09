/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Random rand = new Random();
        int tab[] = new int[100];
        for (int i = 0; i < 100; i++) {
            int n = rand.nextInt(100) + 1;
            tab[i] = n;
        }
        Arrays.sort(tab);
        for (int i = 0; i < 100; i++) {
            System.out.println(tab[i]);
        }
        TreeSet<Integer> tree = new TreeSet<Integer>();
        for (int i = 0; i < 100; i++) {
            int n = rand.nextInt(100) + 1;
            tree.add(n);
        }
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // otrzymalem postortowana liste
        }
        ArrayList<Samochody> samochod = new ArrayList<Samochody>();
        for(int i=0;i<10;i++){
            
            samochod.add(new Samochody("marka", "fol", 160, 10000));
        }

        // TODO code application logic here*/
        Slownik slow=new Slownik();
    }

}
