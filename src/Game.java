import java.util.Scanner;

public class Game {
    private int lives = 10;
    private char[] board;
    private String wort = "Tex";
    private int lastPos;

    private char[] userGuess; /* this array stores all the guesses made by the User. This will be used to make sure User can only use a letter once.*/

    public void start(){
        this.initBoard();
        /*for (int i = 0; i <= lives; i++){ // (int i = 0; i <= lives; lives--;)
            this.showBoard();
            Scanner s = new Scanner(System.in);
            char buchstabe = s.nextLine().toLowerCase().toCharArray()[0];
            if (exists(buchstabe)){
            } else {
                System.out.println("Haha! Loser!");
            }
            }*/
            int korrekt = 0;
            while (lives >= 1){

                this.showBoard();
                Scanner s = new Scanner(System.in);
                char buchstabe = s.nextLine().toLowerCase().toCharArray()[0];
                if (exists(buchstabe)){
                    System.out.println("Du hast richtig geraten!");
                    showBoard(buchstabe);
                    korrekt++;
                    if (korrekt == this.wort.length()) {
                        System.out.println("Du hast gewonnen!");
                    }
                } else {
                    System.out.println("Haha! Loser!");
                }
                if // TODO: add loop to check if letter is repeated. If no, add to array saveUserGuess[], if yes, dont save.
                saveUserGuess();
                lives--;
            }




    }

    private boolean exists(char buchstabe){
        this.lastPos = this.wort.toLowerCase().indexOf(buchstabe);
        return this.lastPos > -1;
    }

    private void initBoard() { // This block substitutes the letters in the board[] with an underscore.
        board = new char[wort.length()];
        for (int i = 0; i < board.length; i++) {
            board[i] = '_';
        }
    }

    private void showBoard(){
        System.out.println(board);
    }

    private void showBoard(char buchstabe){
        this.board[this.lastPos] = this.wort.charAt(this.lastPos);
    }

    private void saveUserGuess() {
        userGuess = new char[lives];
        for (int i = 0; i <= lives; i++) {
        Scanner scanner = new Scanner(System.in);
        char buchstabe = scanner.nextLine().toLowerCase().toCharArray()[0];
        userGuess[i] = buchstabe;



        System.out.println(userGuess);
        }

    }





}
