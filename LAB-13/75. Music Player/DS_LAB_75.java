/*75. Write a program to simulate music player application using suitable data 
structure. There is no estimation about number of music files to be managed by 
the music player. Your program should support all the basic music player 
operations to play and manage the playlist. */
import java.util.Scanner;
class MusicPlayer {
    Node FIRST = null;
    Node LAST = null;
    class Node{
        String music;
        Node LPTR;
        Node RPTR;
        public Node(){
            music = null;
            LPTR = null;
            RPTR = null;
        }
    }
    public void displayAllMusic(){
        System.out.println();
        if(FIRST == null){
            System.out.println("No Music Available In Player.");
        }else{
            int i = 0;
            Node temp = FIRST;
            while(temp != null){
                System.out.print((++i)+". "+temp.music + "\n");
                temp = temp.RPTR;
            }
        }
        System.out.println();
    }
    public int totalMusic(){
        int count = 1;
        Node temp = FIRST;
        while(temp != null){
            count++;
            temp = temp.RPTR;
        }
        return count;
    }
    public void playTheMusic(int pos){
        if(FIRST == null){
            System.out.println("No Music Available In Player.");
            return;
        }
        int count = 1;
        Node temp = FIRST;
        while(temp != null && count != pos){
            count++;
            temp = temp.RPTR;
        }
        if(count != pos){
            System.out.println("Invalid Position!");
            return;
        }
        System.out.println("Playing the : "+temp.music);
    }
    public void pauseTheMusic(int pos){
        if(FIRST == null){
            System.out.println("No Music Available In Player.");
            return;
        }
        int count = 1;
        Node temp = FIRST;
        while(temp != null && count != pos){
            count++;
            temp = temp.RPTR;
        }
        if(count != pos){
            System.out.println("Invalid Position!");
            return;
        }
        System.out.println("Pause the : "+temp.music);
    }
    public void nextMusic(int pos){
        if(pos <= 0 || pos>totalMusic()){
            System.out.println("Invalid Position!");
            return;
        }
        if(pos == totalMusic()){
            playTheMusic(1);
            return;
        }
        playTheMusic(pos+1);
    }
    public void previousMusic(int pos){
        if(pos <= 0 || pos>totalMusic()){
            System.out.println("Invalid Position!");
            return;
        }
        if(pos == 1){
            playTheMusic(totalMusic());
            return;
        }
        playTheMusic(pos-1);
    }
    public void addNewMusic(String music){
        Node newNode = new Node();
        newNode.music = music;
        if(FIRST == null){
            FIRST = newNode;
            LAST = newNode;
        }
        else{
            newNode.RPTR = FIRST;
            FIRST.LPTR = newNode;
            FIRST = newNode;
        }
    }
    public void deleteMusic(int pos){
        if(FIRST == null){
            System.out.println("No Music Available In Player.");
            return;
        }
        if(FIRST == LAST){
            FIRST = null;
            LAST = null;
            return;
        }
        if(pos == 1){
            FIRST = FIRST.RPTR;
            FIRST.LPTR = null;
            return;
        }
        else if(pos == totalMusic()){
            LAST = LAST.LPTR;
            LAST.RPTR = null;
            return;
        }
        Node temp = FIRST;
        for(int i = 1; i < pos-1; i++){
            temp = temp.RPTR;
        }
        Node temp2 = temp.RPTR;
        temp.RPTR = temp2.RPTR;
        temp2.LPTR = temp;
    }
}
public class DS_LAB_75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        MusicPlayer mp = new MusicPlayer();
        int temp=0;
        do{
            int m = 0 , n = 0;
            String str;
            System.out.println("0. Display all Music.\n1. addNewMusic.\n2. DeleteMusic. \n3. PlayTheMusic \n4. PauseTheMusic \n5. NextMusic \n6. PriviusMusic \n-1. Exit");
            System.out.println("Enter your choice: ");
            temp = sc.nextInt();
            switch(temp){
                case 0:
                mp.displayAllMusic();
                break;
                case 1:
                System.out.println("Enter the new Music : ");
                str = scanner.nextLine();
                mp.addNewMusic(str);
                break;
                case 2:
                System.out.println("Enter the position of the music to be deleted : ");
                m = sc.nextInt();
                mp.deleteMusic(m);
                break;
                case 3:
                System.out.println("Enter the Music Will be Play : ");
                n =  sc.nextInt();
                mp.playTheMusic(n);
                break;
                case 4:
                System.out.println("Music Will be Paused : ");
                n =  sc.nextInt();
                mp.pauseTheMusic(n);
                break;
                case 5:
                System.out.println("Next Music Will be Played : ");
                n =  sc.nextInt();
                mp.nextMusic(n);
                break;
                case 6:
                System.out.println("Privius Music Will be Played : ");
                n =  sc.nextInt();
                mp.nextMusic(n);
                break;
                case -1:
                break;
                default:
                System.out.println("Invalid Choice");
                break;
            }
        }while(temp!=-1);
        scanner.close();
        sc.close();
    }
}