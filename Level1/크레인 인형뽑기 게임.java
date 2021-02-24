package programmers;
import java.util.Stack;
public class Game {
	public int main(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<moves.length; i++) {
			int m = moves[i]-1;
			for(int j=0; j<board.length;j++) {
				if(board[j][m] != 0) {
					if(stack.empty()) {
						stack.push(board[j][m]);
					}
					else {
						if(stack.peek() == board[j][m]) {
							stack.pop();
							answer += 2;
						}
						else {
							stack.push(board[j][m]);
						}
					}
					board[j][m] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
