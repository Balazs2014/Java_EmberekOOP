package hu.petrik.emberekoop;

public class Main {

    public static void main(String[] args) {
        Ember e0 = new Ember("Lakatos István", "1972-1-12", "Budapest");
        Ember e1 = new Ember("Lakatos Béla", "1983-1-12", "Budapest");
        Ember e2 = new Ember("Gipsz Jakab", "1968-11-2", "Miskolc");
        Ember e3 = new Ember("Teszt Elek", "2001-8-22", "Kecskemét");
        Ember e4 = new Ember("Kovács László", "1988-6-3", "Nyíregyháza");
        //emberOsztalyTesztje(e0,e1,e2,e3);

        Ember[] emberTomb = new Ember[]{e0,e1,e2,e3,e4};
        Emberek emberek = new Emberek(emberTomb);
        Emberek emberek2 = new Emberek("emberek.txt");
        System.out.println(emberek2);
        System.out.println(emberek2.megszamolAdottHonapot2(3));
    }

    public static void emberOsztalyTesztje(Ember e0, Ember e1, Ember e2, Ember e3){
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.printf("%s - Életkor %d", e0, e0.getEletkor());
        System.out.printf("%s - Életkor %d", e2, e2.getEletkor());

    }
}
