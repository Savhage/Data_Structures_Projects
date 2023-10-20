package DungeonCrawler;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class DungeonEngine {
    Character hero;
    Dungeon depths;
    private int choice,floor;
    Scanner input=new Scanner(System.in);
    Random r=new Random();
    public void runGame() throws IOException{

        System.out.println("Welcome traveler to my dungeon!! " +
                "\nThe last place you will ever see!!");
        hero = createHero();
        while (hero.getLife()>0) {
            floor+=1;
            depths = new Dungeon(floor);
            depths.setOut();
            while (hero.getLife()>0 && depths.getOut()){
                menu();
                choice = input.nextInt();
                menuSelection(choice);
                if (hero.getLife() <= 0) {
                    System.out.println("You have succumbed to your injuries and the light fades from your eyes");
                    System.out.println("Would you like to save this character for a future playthrough?" +
                            "\n1. Yes\n2. No");
                    choice=input.nextInt();
                    if (choice ==1){
                        saveHero(hero);
                    }
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
            System.out.println("You find a stairwell leading down" +
                    "\n**THE PASSAGES SHUT AROUND YOU**" +
                    "YOU HAVE PROVEN YOURSELF WORTHY ON THIS FLOOR. BUT MY CHILDREN GROW STRONGER "+
                    "AS YOU DESCEND"+
                    "\n**You Descend Down The Stairs To Face The Next Set Of Challenges**");
        }
    }
    public Character createHero(){
        System.out.println("Choose you starting character!!");
        System.out.println("1.Begin your journey at level 1!!" +
                "\n2. Import a saved Character\n");
        System.out.print("Make your selection:");
        int c= input.nextInt();
        if (c==1){
            hero=new Character();
        }
        else if(c==2) {
            try {
                File save=new File("Dungeon_Save.txt");
                Scanner inputFile=new Scanner(save);
                hero=new Character(inputFile.nextInt(),inputFile.nextInt(),inputFile.nextInt(),
                        inputFile.nextInt(),inputFile.nextInt(),inputFile.nextInt(),inputFile.nextInt());
                inputFile.close();
                System.out.println("Previous character has been imported successfully!!\n");
            }
            catch(Exception e){
                System.out.println("You do not have a save file." +
                        "\n You will begin with a level 1 hero.\n");
                hero=new Character();
            }
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
                            "\n7. Exit Game\n"+
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
    public void saveHero(Character hero)throws IOException{
        PrintWriter save=new PrintWriter("Dungeon_Save.txt");
        int[] stats=new int[7];
        save.println(hero.getLvl());
        save.println(hero.getMLife());
        save.println(hero.getAttack());
        save.println(hero.getDefense());
        save.println(hero.getSpeed());
        save.println(hero.getMoney());
        save.println(hero.getExperience());
        save.close();
    }
}

