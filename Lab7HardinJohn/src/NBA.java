
public class NBA {

	public static void main(String[] args) {
		int[][] scores = {
				{20,27,16,23,20,27,18},
				{8,18,14,17,9,12,0},
				{38,19,25,22,19,25,31},
				{17,8,11,21,15,0,9},
				{2,1,3,0,10,2,4}
		};
		
		System.out.println(averagePPG(scores, 1));
		System.out.println(singleGameScore(scores, 2));
		System.out.println(averageGameScore(scores));
		System.out.println(singleGameTopScoringPlayer(scores, 0));

	}
	
	public static double averagePPG(int[][] scores, int p) {
		int total = 0;
		int count = 0;
		for(int j = 0; j < scores[p].length; j++) {
			total += scores[p][j];
			count++;
		}
		return (double) total / count;
	}
	public static int singleGameScore(int[][] scores, int g) {
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			total += scores[i][g];
		}
		return total;
	}
	public static double averageGameScore(int[][] scores) {
		double[] gameAvgs = new double[scores[0].length];
		int totalAvg = 0;
		for(int i = 0; i < scores[0].length; i++) { // i = games
			int[] curGameScores = new int[scores[0].length];
			for(int j = 0; j < scores.length; j++) {
				curGameScores[i] += scores[j][i];
			}
			gameAvgs[i] = curGameScores[i] / scores.length;
		}
		for (int i = 0; i < gameAvgs.length; i++) {
			totalAvg += gameAvgs[i];
		}
		return (double) totalAvg / gameAvgs.length;
	}
	public static int singleGameTopScoringPlayer(int[][] scores, int g) {
		int high = 0;
		int highIdx = -1;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i][g] > high) {
				high = scores[i][g];
				highIdx = i;
			}
		}
		return highIdx;
	}
	

}
