
public class TotallyNotPacman {

	public static void main(String[] args) {
		int[][] iTestLevel = {
				{1,1,2,1,0,1,1},
				{1,1,0,2,0,1,1},
				{1,0,0,1,1,1,1},
				{1,0,1,0,0,0,1},
				{1,0,1,0,1,0,1},
				{0,3,0,2,1,0,1}
				};
		print("[!] Test Difficulty: " + difficulty(iTestLevel));
		print("[!] Test underThreat: " + isUnderThreat(iTestLevel));

	}
	public static double difficulty(int[][] level) {
		int iNotWall = 0, iEnemies = 0;
		for(int i = 0; i < level.length; i++) {
			for (int j = 0; j < level[i].length; j++) {
				if(level[i][j] != 1) {
					iNotWall++;
					if(level[i][j] == 2) {
						iEnemies++;
					}
				}
			}
		}
		return  (double) iEnemies / iNotWall;
	}
	public static boolean isUnderThreat(int[][] level) {
		String[] iPlayerLoc = getPlayerIndex(level).split(","); // Assuming there can be only 1 player in level this should return 'x,y'
		int iPX = Integer.parseInt( iPlayerLoc[0] ); // Get X
		int iPY = Integer.parseInt( iPlayerLoc[1] ); // Get Y
		int iEnCount = 0;
		int[] iSurrounding = new int[8];
		if(iPY - 1 >= 0) {
			iEnCount += checkForEnemy( level[iPY - 1][iPX]); // 1 cell above
			if(iPX - 1 >= 0) {
				iEnCount += checkForEnemy( level[iPY - 1][iPX - 1]); // 1 cell up and 1 cell left 
			}
			if(iPX + 1 < level[iPY].length) {
				iEnCount += checkForEnemy( level[iPY - 1][iPX + 1]); // 1 cell up and 1 cell right
			}
		}
		if(iPX - 1 > 0)
			iEnCount += checkForEnemy( level[iPY][iPX - 1]); // 1 cell left
		if(iPX + 1 < level[iPY].length)
			iEnCount += checkForEnemy( level[iPY][iPX + 1]); // 1 cell right
		
		if(iPY + 1 < level.length) {
			iEnCount += checkForEnemy( level[iPY + 1][iPX]); // 1 cell down
			if(iPX - 1 >= 0) {
				iEnCount += checkForEnemy( level[iPY + 1][iPX - 1]); // 1 cell down and 1 cell left 
			}
			if(iPX + 1 < level[iPY].length) {
				iEnCount += checkForEnemy( level[iPY + 1][iPX + 1]); // 1 cell down and 1 cell right
			}
		}
		if(iEnCount >= 2) {
			return true;
		} else {
			return false;
		}
	}
	public static int checkForEnemy(int block) {
		print("" + block);
		if (block == 2) {
			return 1;
		} else {
			return 0;
		}
		
	}
	public static String getPlayerIndex(int[][] level) {
		for(int i = 0; i < level.length; i++) {
			for (int j = 0; j < level[i].length; j++) {
				if(level[i][j] == 3) {
					return j + "," + i;
				}
			}
		}
		return "-1";
	}
	public static void print(String string) {
		System.out.println(string);
	}

}
