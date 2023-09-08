package algorithms.availableCapturesForRook;

public class AvailableCapturesForRook {

    public int numRookCaptures(char[][] board) {

        int answer = 0;
        int rookPosition_1 = 0, rookPosition_2 = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    rookPosition_1 = i;
                    rookPosition_2 =j;
                }
            }
        }

        for (int j = rookPosition_2; j >= 0; j--) {
            if (board[rookPosition_1][j] == 'B')
                break;
            else if (board[rookPosition_1][j] == 'p') {
                answer++;
                break;
            }
        }

        for (int j = rookPosition_2; j < 8; j++) {
            if (board[rookPosition_1][j] == 'B')
                break;
            else if (board[rookPosition_1][j] == 'p') {
                answer++;
                break;
            }
        }

        for (int i = rookPosition_1; i >= 0; i--) {
            if (board[i][rookPosition_2] == 'B')
                break;
            else if (board[i][rookPosition_2] == 'p') {
                answer++;
                break;
            }
        }

        for (int i = rookPosition_1; i < 8; i++) {
            if (board[i][rookPosition_2] == 'B')
                break;
            else if (board[i][rookPosition_2] == 'p') {
                answer++;
                break;
            }
        }

        return answer;

    }

}
