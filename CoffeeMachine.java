package machine;

import java.util.Scanner;


public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int money = 550;
    static int disCups = 9;
    public static void main(String[] args) {

        action();

    }

        public static void action () {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            Scanner sc=new Scanner(System.in);
            String  action=sc.next();
            switch (action){
                case "buy":
                    Buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    exit();
                    break;
            }
        }

        public static void Buy () {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            switch (str) {
                case "1":
                    if (water >= 250 && beans >= 16 && disCups > 0) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 250;
                        beans -= 16;
                        disCups -= 1;
                        money += 4;
                    } else if (water < 250) {
                        System.out.println("Sorry, not enough water !");
                    } else if (beans < 16) {
                        System.out.println("Sorry, not enough coffee beans !");
                    } else
                        System.out.println("Sorry, not enough disposable cups !");
                    break;
                case "2":
                    if (water >= 350 && milk >= 75 && beans >= 20 && disCups > 0) {
                        System.out.println("I have enough resources, making you a coffee !");
                        water -= 350;
                        beans -= 20;
                        milk -= 75;
                        disCups -= 1;
                        money += 7;
                    } else if (water < 350) {
                        System.out.println("Sorry, not enough water !");
                    } else if (milk < 75) {
                        System.out.println("Sorry, not enough milk !");
                    } else if (beans < 20) {
                        System.out.println("Sorry, not enough coffee beans !");
                    } else
                        System.out.println("Sorry, not enough disposable cups !");
                    break;
                case "3":
                    if (water >= 200 && milk >= 100 && beans >= 12 && disCups > 0) {
                        System.out.println("I have enough resources, making you a coffee !");
                        water -= 200;
                        beans -= 12;
                        milk -= 100;
                        disCups -= 1;
                        money += 6;
                    } else if (water < 200) {
                        System.out.println("Sorry, not enough water !");
                    } else if (milk < 100) {
                        System.out.println("Sorry, not enough milk !");
                    } else if (beans < 12) {
                        System.out.println("Sorry, not enough coffee beans !");
                    } else
                        System.out.println("Sorry, not enough disposable cups !");
                    break;
            }

            action();

        }
        public static void fill () {
            Scanner add = new Scanner(System.in);
            System.out.println("Write how many ml of water do you want to add:");
            water += add.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            milk += add.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            beans += add.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            disCups += add.nextInt();
            action();
        }
        public static void take () {
            System.out.println("I gave you" + " " +"$"+ money);
            money=0;
            action();
        }
        public static void remaining () {
            System.out.println("The coffee machine has:");
            System.out.println(water + " " + "of water");
            System.out.println(milk + " " + "of milk");
            System.out.println(beans + " " + "of coffee beans");
            System.out.println(disCups + " " + "of disposable cups");
            if(money!=0) {
                System.out.println("$" + money + " " + "of money");
            }else
                System.out.println(money+" "+"of money");
        action();
        }
        public static void exit () {
        System.exit(0);
        }



}




