//********************************************************************************
// STUDENT NAME:  [Chris Vega]
// STUDENT ID:  [4000709]
// FIU EMAIL: [Cvega050@fiu.edu]
// CLASS: COP 2210 – [2015]
// ASSIGNMENT # [5]
// DATE: [11/30/2015]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else, except as outlined in the 
// assignment instructions.
//********************************************************************************
package TicTacToe;

import java.util.Random;
import javax.swing.JOptionPane;

public class ai {

    public int[] grid = new int[9];
    public int[] moves = new int[9];
    public int turn = 10;
    private String s1 = "You got beat by a computer, really?";
    private String s2 = "Wait what";
    public int cw = 0;
    public int pw = 0;
    public int c = 0;
    int hscore = -4;
    Random r = new Random();

    public ai() {
        for (int i = 0; i < 9; i++) {
            grid[i] = 2;
            moves[i] = -1;
        }
    }

    public int grideval() {
        //adds up all possible moves by the AI and the player to determine what
        //is the best move to make. 
        int score = 0;
        score = score + eval(0, 3, 6);
        score = score + eval(1, 4, 7);
        score = score + eval(2, 5, 8);

        score = score + eval(0, 1, 2);
        score = score + eval(3, 4, 5);
        score = score + eval(6, 7, 8);

        score = score + eval(0, 4, 8);
        score = score + eval(2, 4, 6);

        score = score + eval(6, 0, 3);
        score = score + eval(7, 1, 4);
        score = score + eval(8, 2, 5);

        score = score + eval(2, 0, 1);
        score = score + eval(5, 3, 4);
        score = score + eval(8, 6, 7);

        score = score + eval(8, 0, 4);
        score = score + eval(6, 2, 4);

        score = score + eval(3, 6, 0);
        score = score + eval(4, 7, 1);
        score = score + eval(5, 8, 2);
        score = score + eval(1, 2, 0);
        score = score + eval(4, 5, 3);
        score = score + eval(7, 8, 6);

        return score;
    }

    private int eval(int a, int b, int c) {
        //Determines points for for making a move on this grid, if grid has a 1
        //the AI made a play there, 2 is empty, 3 is the player
        int points = 0;
        if (grid[a] == 3) {
            points = 1;
        } else if (grid[a] == 1) {
            points = -1;
        } else {
            points = 0;
        }

        if (grid[b] == 3) {
            if (grid[a] == 3) {
                points = points + 15;
            } else if (grid[a] == 1) {
                points = 0;
            } else {
                points++;
            }
        } else if (grid[b] == 1) {
            if (grid[a] == 1) {
                points = points - 15;
            } else if (grid[a] == 3) {
                points = 0;
            } else {
                points = points - 1;
            }
        } else {
            points = points + 0;
        }

        if (grid[c] == 3) {
            if (grid[a] == 3 || grid[b] == 3) {
                if (grid[a] == 3 && grid[b] == 3) {
                    points = points + 90;
                }
                points = points + 10;
            }
            if (grid[a] == 1 || grid[b] == 1) {
                if (grid[a] == 1 && grid[b] == 1) {
                    points = points + 50;
                } else {
                    points = 0;
                }
            } else if (grid[a] == 2 || grid[b] == 2) {
                points = points + 1;
            }
        } else if (grid[c] == 1) {
            if (grid[a] == 1 || grid[b] == 1) {
                if (grid[a] == 1 && grid[b] == 1) {
                    points = points - 90;
                }
                points = points - 10;
            }
            if (grid[a] == 3 || grid[b] == 3) {
                if (grid[a] == 3 && grid[b] == 3) {
                    points = points - 30;
                } else {
                    points = 0;
                }
            } else if (grid[a] == 2 || grid[b] == 2) {
                points = points - 1;
            }
        } else {
            points = points + 0;
        }

        return points;
    }

    public void bestmove() {
        //Compares all possible moves.
        boolean hsconflict = false;
        int sh = 0;
        int move = -1;
        int hscore = -1000;

        int cscore;

        for (int i = 0; i < 9; i++) {
            if (grid[i] == 2) {
                grid[i] = 3;
                cscore = grideval();
                if (cscore > hscore) {
                    move = i;
                    for (int j = 0; j < 9; j++) {
                        moves[j] = -1;
                    }
                    sh = 0;
                    moves[sh] = i;
                    hscore = cscore;
                    hsconflict = false;
                }
                if (cscore == hscore) {
                    moves[sh++] = i;
                    hsconflict = true;
                }
                System.out.println(i + " : " + cscore + " : " + hscore);

                grid[i] = 2;
            }
        }
        if (hsconflict == true) {
            while (hsconflict == true) {
                int i;
                for (i = 0; i < 9; i++) {
                    int ra = 1 + r.nextInt(2);
                    if (ra == 2 && moves[i] != -1 && grid[moves[i]] == 2) {
                        grid[moves[i]] = 3;
                        for (int j = 0; j < 9; j++) {

                            moves[j] = -1;
                        }

                        hsconflict = false;
                        return;
                    }
                }
                i = 0;
            }
        }
        // }
        for (int j = 0; j < 9; j++) {

            moves[j] = -1;
        }
        grid[move] = 3;
        System.out.println("done");
    }

    public boolean winnerwinnerchikendinner() {
        //Checking to see if someone won
        String ss = s1;
        int c = 3;
        for (int i = 0; i < 2; i++) {
            if (grid[0] == c && grid[1] == c && grid[2] == c) {
                JOptionPane.showMessageDialog(null, ss);
                return true;
            }
            if (grid[3] == c && grid[4] == c && grid[5] == c) {
                JOptionPane.showMessageDialog(null, ss);
                return true;
            }
            if (grid[6] == c && grid[7] == c && grid[8] == c) {
                JOptionPane.showMessageDialog(null, ss);
                return true;
            }
            if (grid[0] == c && grid[3] == c && grid[6] == c) {
                JOptionPane.showMessageDialog(null, ss);
                return true;
            }
            if (grid[1] == c && grid[4] == c && grid[7] == c) {
                JOptionPane.showMessageDialog(null, ss);
                return true;
            }
            if (grid[2] == c && grid[5] == c && grid[8] == c) {
                JOptionPane.showMessageDialog(null, ss);
                return true;
            }
            if (grid[0] == c && grid[4] == c && grid[8] == c) {
                JOptionPane.showMessageDialog(null, ss);
                return true;
            }
            if (grid[2] == c && grid[4] == c && grid[6] == c) {
                JOptionPane.showMessageDialog(null, ss);
                return true;
            }

            c = 1;
            ss = s2;

        }

        for (int i = 0; i < 9; i++) {
            if (grid[i] == 2) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[i] != 2) {
                JOptionPane.showMessageDialog(null, "You're no fun");
                return true;
            }
        }

        return false;
    }

}
