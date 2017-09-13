import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        
        // U(p) D(own) L(eft) R(ight) C(entre)
        int rObsUL = n + 1;
        int rObsUC = n + 1;
        int rObsUR = n + 1;
        int rObsDL = 0;
        int rObsDC = 0;
        int rObsDR = 0;
        
        int cObsUL = 0;
        int cObsCL = 0;
        int cObsDL = 0;
        int cObsUR = n + 1;
        int cObsCR = n + 1;
        int cObsDR = n + 1;
        
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            
            if (rObstacle == rQueen) {
                if (cObstacle < cQueen) {
                    cObsCL = Math.max(cObstacle, cObsCL);
                } else {
                    cObsCR = Math.min(cObstacle, cObsCR);
                }
            } else if (cObstacle == cQueen) {
                if (rObstacle < rQueen) {
                    rObsDC = Math.max(rObstacle, rObsDC);
                } else {
                    rObsUC = Math.min(rObstacle, rObsUC);
                }
            } else {
                if (Math.abs(rQueen - rObstacle) != Math.abs(cQueen - cObstacle)) {
                    continue;
                }
                if (rObstacle < rQueen && cObstacle < cQueen) {
                    rObsDL = Math.max(rObstacle, rObsDL);
                    cObsDL = Math.max(cObstacle, cObsDL);
                } else if (rObstacle < rQueen && cObstacle > cQueen) {
                    rObsDR = Math.max(rObstacle, rObsDR);
                    cObsDR = Math.min(cObstacle, cObsDR);
                } else if (rObstacle > rQueen && cObstacle < cQueen) {
                    rObsUL = Math.min(rObstacle, rObsUL);
                    cObsUL = Math.max(cObstacle, cObsUL);
                } else {
                    rObsUR = Math.min(rObstacle, rObsUR);
                    cObsUR = Math.min(cObstacle, cObsUR);
                }
            }
        }
        
        int maxMovesUL = Math.min(rObsUL - rQueen, cQueen - cObsUL) - 1;
        int maxMovesUC = rObsUC - rQueen - 1;
        int maxMovesUR = Math.min(rObsUR - rQueen, cObsUR - cQueen) - 1;
        int maxMovesCL = cQueen - cObsCL - 1;
        int maxMovesCR = cObsCR - cQueen - 1;
        int maxMovesDL = Math.min(rQueen - rObsDL, cQueen - cObsDL) - 1;
        int maxMovesDC = rQueen - rObsDC - 1;
        int maxMovesDR = Math.min(rQueen - rObsDR, cObsDR - cQueen) - 1;
        
        System.out.println(maxMovesUL + maxMovesUC + maxMovesUR + maxMovesCL + maxMovesCR + maxMovesDL + maxMovesDC + maxMovesDR);
    }
}
