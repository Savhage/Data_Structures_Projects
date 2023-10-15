package DungeonCrawler;
import java.util.Scanner;
import java.util.Random;
public class DungeonEngine {
    Character hero;
    Dungeon depths;
    int cleared,choice;
    Scanner input=new Scanner(System.in);
    Random r=new Random();
    public void runGame() {
        Character hero;
        System.out.println("Welcome traveler to my dungeon!! " +
                "\nThe last place you will ever see!!");
        hero = createHero();
        while (hero.getLife()>0) {
            depths = new Dungeon(hero);
            cleared = r.nextInt(6, 12);
            for (int i = 0; i < cleared; i++) {
                menu();
                choice = input.nextInt();
                menuSelection(choice);
                if (hero.getLife() <= 0) {
                    System.out.println("You have succumbed to your injuries and the light fades from your eyes");
                    System.out.print("Would you like to play again?" +
                            "\nPress 1 for yes:");
                    choice = input.nextInt();
                    if (choice == 1) {
                        runGame();
                    } else {
                        System.out.println("Thank you for playing!!" +
                                "\n**Enter 1 to close program**");
                        choice = input.nextInt();
                        System.exit(0);
                    }
                    break;
                }

            }
            System.out.println("You have proven yourself worthy!!" +
                    "\n**THE PASSAGES SHUT AROUND YOU AND A STAIRWELL LEADING DOWN APPEARS**" +
                    "\n**You Descend Down The Stairs To Face The Next Set Of Challenges**");
        }
    }
    public Character createHero(){
        System.out.println("Choose you starting character!!");
        System.out.println("1.Begin your journey at level 1!!" +
                "\n2.Choose your own starting level!!" +
                "\n **Slimes will scale to your level**");
        System.out.print("Make your selection:");
        int c= input.nextInt();
        if (c==1){
            hero=new Character();
        }
        else if(c==2){
            System.out.println("Choose your starting level!!");
            System.out.print("Make your selection:");
            int l=input.nextInt();
            hero=new Character(l);
        }
        else{
            invalid();
            createHero();
        }
        return hero;
    }
    public void menu(){
        System.out.print( "1. Go Left Toward The " +depths.checkLeft()+" Room"+
                            "\n2. Attempt To Safely Move Through The "+ depths.checkLeft()+" Room"+
                            "\n3. Go Right Toward The "+depths.checkRight()+" Room"+
                            "\n4. Attempt To Safely Move Through The "+ depths.checkRight()+" Room"+
                            "\n5. Check Map"+
                            "\n6. Check Status"+
                            "\n7. Exit Game"+
                            "\nMake your selection: ");
    }
    public void menuSelection(int c){
        if (c==1){
            depths.goLeft(hero);
        }
        else if(c==2){
            depths.skipLeft(hero);
        }
        else if (c==3){
            depths.goRight(hero);
        }
        else if(c==4){
            depths.skipRight(hero);
        }
        else if(c==5){
            System.out.println(depths);
            lineBreak();
            menu();
            choice=input.nextInt();
            menuSelection(choice);
        }
        else if(c==6){
            System.out.println(hero);
            lineBreak();
            menu();
            choice=input.nextInt();
            menuSelection(choice);
        }
        else if (c==7){
            System.exit(0);
        }
        else {
            invalid();
            menu();
            choice=input.nextInt();
            menuSelection(choice);
        }
    }
    public void invalid(){
        System.out.println("You have made an invalid selection.");
    }
    public void lineBreak(){
        System.out.print("Enter 1 to continue:");
        int q=input.nextInt();
    }
}

