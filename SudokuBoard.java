
public class SudokuBoard {
	int[][] easyboardafk = {
			{0,0,0,0,8,0,0,0,9},
			{0,0,0,4,2,6,1,3,0},
			{0,0,0,9,0,1,5,0,6},
			{2,0,0,8,3,0,9,7,4},
			{3,0,9,0,6,0,0,8,0},
			{0,0,0,2,9,4,0,0,0},
			{0,5,6,3,1,0,0,0,0},
			{0,0,0,0,0,0,8,0,7},
			{0,8,4,0,5,2,0,1,0},
	};
	int[][] easyboardafk1 = {
			{0,0,0,8,4,0,3,9,7},
			{3,0,0,0,0,5,0,0,0},
			{0,7,0,2,0,0,0,0,5},
			{0,2,4,5,0,0,0,3,9},
			{0,0,3,4,7,6,0,1,0},
			{8,0,0,9,0,3,4,5,0},
			{0,0,0,0,0,2,8,0,0},
			{5,0,6,3,0,0,9,0,1},
			{7,0,2,0,0,0,0,0,0},
	};
	int[][] easyboardafk2 = {
			{7,0,4,9,5,1,0,0,2},
			{0,0,0,0,6,7,5,0,4},
			{1,2,5,0,0,0,0,9,6},
			{0,0,7,0,0,0,2,0,0},
			{9,0,0,4,0,0,3,0,5},
			{0,0,0,1,3,5,0,0,0},
			{0,0,0,3,2,4,0,0,0},
			{0,9,0,0,0,8,0,6,0},
			{4,5,0,0,0,0,1,0,3},
			
	};
	int[][] easyboardafk3 = {
			{8,3,0,0,1,6,0,0,0},
			{0,0,0,8,3,5,4,0,0},
			{0,5,0,0,4,0,9,0,8},
			{9,7,5,0,0,3,0,0,0},
			{0,0,0,0,0,9,0,5,1},
			{0,0,0,6,5,0,0,0,2},
			{0,0,9,3,0,4,2,7,5},
			{3,2,0,0,0,1,0,0,9},
			{5,4,8,0,0,7,0,0,0},
	};
	int[][] mediumboardafk = {
			{0,2,0,5,1,9,0,0,0},
			{0,5,0,7,0,0,0,1,0},
			{0,6,0,2,0,0,9,0,0},
			{6,8,5,0,2,3,0,0,0},
			{0,0,0,0,0,0,8,0,2},
			{0,7,0,1,4,0,0,0,0},
			{7,0,1,0,0,0,0,5,9},
			{0,0,0,0,0,1,0,0,7},
			{0,3,0,4,9,0,0,2,1},
	};	
	int[][] mediumboardafk1 = {
			{2,0,0,0,3,6,0,0,0},
			{0,0,0,0,0,8,0,1,7},
			{0,0,4,0,0,5,0,0,3},
			{0,0,7,0,2,9,1,0,0},
			{0,0,1,3,0,0,9,6,4},
			{0,3,8,0,0,1,0,0,0},
			{0,1,0,7,5,0,0,0,0},
			{0,0,3,0,9,0,0,4,0},
			{0,4,9,0,0,0,0,7,0},
	};	
	int[][] mediumboardafk2 = {
			{0,8,0,0,7,0,0,5,0},
			{4,3,0,0,9,0,7,0,0,},
			{7,9,0,6,3,8,0,0,1},
			{0,6,0,0,0,4,0,0,9},
			{1,4,0,0,0,0,0,0,0},
			{0,7,0,0,0,2,0,3,8},
			{9,0,0,0,0,0,1,0,5},
			{0,0,0,5,0,0,0,0,0},
			{0,0,3,9,0,0,0,0,0},
	};
	int[][] mediumboardafk3 = {
			{2,7,0,0,0,0,0,1,0},
			{9,0,0,7,0,4,0,0,0},
			{6,1,0,0,0,0,3,9,0},
			{1,0,2,9,0,0,7,0,0},
			{0,0,9,0,0,0,8,6,1},
			{8,0,0,3,0,0,0,0,0},
			{7,8,5,2,3,0,1,0,0},
			{0,0,0,0,0,0,2,0,0},
			{0,0,0,5,6,7,0,0,8},
	};
	int[][] hardboardafk = {
			{2,0,0,0,0,0,9,5,1},
			{0,0,0,0,0,0,0,0,7},
			{8,7,6,0,0,5,2,0,0},
			{3,0,4,0,2,8,0,0,0},
			{0,0,0,0,0,0,5,0,9},
			{0,0,5,0,0,1,3,0,4},
			{0,2,0,0,8,4,0,1,0},
			{0,0,0,0,1,0,0,9,8},
			{0,0,0,0,0,0,0,0,0},
	};
	int[][] hardboardafk1 = {
			{0,0,0,8,1,5,0,0,0},
			{0,5,0,0,0,0,0,7,6},
			{0,3,0,2,0,0,0,0,0},
			{0,0,0,0,0,0,0,9,8},
			{2,0,0,0,5,0,0,0,0},
			{4,7,3,0,0,2,0,0,0},
			{0,8,1,3,0,0,4,0,2},
			{0,0,4,0,0,0,1,0,9},
			{0,0,5,0,2,4,0,0,0},
	};
	int[][] hardboardafk2 = {
			{0,0,8,0,0,0,0,0,0},
			{0,1,0,0,0,0,5,0,0},
			{0,0,3,4,0,1,8,0,0},
			{0,0,0,5,0,0,0,0,3},
			{0,0,0,7,2,3,0,1,0},
			{4,0,5,0,0,0,0,6,0},
			{0,0,0,8,4,7,0,0,0},
			{0,0,0,0,3,0,1,7,2},
			{6,0,0,0,9,0,0,0,0},
	};
	int[][] hardboardafk3 = {
			{0,0,0,0,0,8,7,0,0},
			{0,9,6,0,3,4,0,0,0},
			{2,4,0,0,0,0,0,0,0},
			{0,8,2,0,1,0,0,0,0},
			{0,0,0,0,9,0,0,3,0},
			{6,0,1,0,2,0,0,0,4},
			{5,0,0,9,0,0,0,2,8},
			{4,0,9,0,0,0,0,0,0},
			{0,0,0,3,0,0,0,5,0},
	};
	
	int[][] easyboard = {
			{0,0,0,0,8,0,0,0,9},
			{0,0,0,4,2,6,1,3,0},
			{0,0,0,9,0,1,5,0,6},
			{2,0,0,8,3,0,9,7,4},
			{3,0,9,0,6,0,0,8,0},
			{0,0,0,2,9,4,0,0,0},
			{0,5,6,3,1,0,0,0,0},
			{0,0,0,0,0,0,8,0,7},
			{0,8,4,0,5,2,0,1,0},
	};
	int[][] easyboard1 = {
			{0,0,0,8,4,0,3,9,7},
			{3,0,0,0,0,5,0,0,0},
			{0,7,0,2,0,0,0,0,5},
			{0,2,4,5,0,0,0,3,9},
			{0,0,3,4,7,6,0,1,0},
			{8,0,0,9,0,3,4,5,0},
			{0,0,0,0,0,2,8,0,0},
			{5,0,6,3,0,0,9,0,1},
			{7,0,2,0,0,0,0,0,0},
	};
	int[][] easyboard2 = {
			{7,0,4,9,5,1,0,0,2},
			{0,0,0,0,6,7,5,0,4},
			{1,2,5,0,0,0,0,9,6},
			{0,0,7,0,0,0,2,0,0},
			{9,0,0,4,0,0,3,0,5},
			{0,0,0,1,3,5,0,0,0},
			{0,0,0,3,2,4,0,0,0},
			{0,9,0,0,0,8,0,6,0},
			{4,5,0,0,0,0,1,0,3},
			
	};
	int[][] easyboard3 = {
			{8,3,0,0,1,6,0,0,0},
			{0,0,0,8,3,5,4,0,0},
			{0,5,0,0,4,0,9,0,8},
			{9,7,5,0,0,3,0,0,0},
			{0,0,0,0,0,9,0,5,1},
			{0,0,0,6,5,0,0,0,2},
			{0,0,9,3,0,4,2,7,5},
			{3,2,0,0,0,1,0,0,9},
			{5,4,8,0,0,7,0,0,0},
	};
	int[][] mediumboard = {
			{0,2,0,5,1,9,0,0,0},
			{0,5,0,7,0,0,0,1,0},
			{0,6,0,2,0,0,9,0,0},
			{6,8,5,0,2,3,0,0,0},
			{0,0,0,0,0,0,8,0,2},
			{0,7,0,1,4,0,0,0,0},
			{7,0,1,0,0,0,0,5,9},
			{0,0,0,0,0,1,0,0,7},
			{0,3,0,4,9,0,0,2,1},
	};	
	int[][] mediumboard1 = {
			{2,0,0,0,3,6,0,0,0},
			{0,0,0,0,0,8,0,1,7},
			{0,0,4,0,0,5,0,0,3},
			{0,0,7,0,2,9,1,0,0},
			{0,0,1,3,0,0,9,6,4},
			{0,3,8,0,0,1,0,0,0},
			{0,1,0,7,5,0,0,0,0},
			{0,0,3,0,9,0,0,4,0},
			{0,4,9,0,0,0,0,7,0},
	};	
	int[][] mediumboard2 = {
			{0,8,0,0,7,0,0,5,0},
			{4,3,0,0,9,0,7,0,0,},
			{7,9,0,6,3,8,0,0,1},
			{0,6,0,0,0,4,0,0,9},
			{1,4,0,0,0,0,0,0,0},
			{0,7,0,0,0,2,0,3,8},
			{9,0,0,0,0,0,1,0,5},
			{0,0,0,5,0,0,0,0,0},
			{0,0,3,9,0,0,0,0,0},
	};
	int[][] mediumboard3 = {
			{2,7,0,0,0,0,0,1,0},
			{9,0,0,7,0,4,0,0,0},
			{6,1,0,0,0,0,3,9,0},
			{1,0,2,9,0,0,7,0,0},
			{0,0,9,0,0,0,8,6,1},
			{8,0,0,3,0,0,0,0,0},
			{7,8,5,2,3,0,1,0,0},
			{0,0,0,0,0,0,2,0,0},
			{0,0,0,5,6,7,0,0,8},
	};
	int[][] hardboard = {
			{2,0,0,0,0,0,9,5,1},
			{0,0,0,0,0,0,0,0,7},
			{8,7,6,0,0,5,2,0,0},
			{3,0,4,0,2,8,0,0,0},
			{0,0,0,0,0,0,5,0,9},
			{0,0,5,0,0,1,3,0,4},
			{0,2,0,0,8,4,0,1,0},
			{0,0,0,0,1,0,0,9,8},
			{0,0,0,0,0,0,0,0,0},
	};
	int[][] hardboard1 = {
			{0,0,0,8,1,5,0,0,0},
			{0,5,0,0,0,0,0,7,6},
			{0,3,0,2,0,0,0,0,0},
			{0,0,0,0,0,0,0,9,8},
			{2,0,0,0,5,0,0,0,0},
			{4,7,3,0,0,2,0,0,0},
			{0,8,1,3,0,0,4,0,2},
			{0,0,4,0,0,0,1,0,9},
			{0,0,5,0,2,4,0,0,0},
	};
	int[][] hardboard2 = {
			{0,0,8,0,0,0,0,0,0},
			{0,1,0,0,0,0,5,0,0},
			{0,0,3,4,0,1,8,0,0},
			{0,0,0,5,0,0,0,0,3},
			{0,0,0,7,2,3,0,1,0},
			{4,0,5,0,0,0,0,6,0},
			{0,0,0,8,4,7,0,0,0},
			{0,0,0,0,3,0,1,7,2},
			{6,0,0,0,9,0,0,0,0},
	};
	int[][] hardboard3 = {
			{0,0,0,0,0,8,7,0,0},
			{0,9,6,0,3,4,0,0,0},
			{2,4,0,0,0,0,0,0,0},
			{0,8,2,0,1,0,0,0,0},
			{0,0,0,0,9,0,0,3,0},
			{6,0,1,0,2,0,0,0,4},
			{5,0,0,9,0,0,0,2,8},
			{4,0,9,0,0,0,0,0,0},
			{0,0,0,3,0,0,0,5,0},
	};
	public int[][] getEasyboardafk() {
		return easyboardafk;
	}
	public void setEasyboardafk(int[][] easyboardafk) {
		this.easyboardafk = easyboardafk;
	}
	public int[][] getEasyboardafk1() {
		return easyboardafk1;
	}
	public void setEasyboardafk1(int[][] easyboardafk1) {
		this.easyboardafk1 = easyboardafk1;
	}
	public int[][] getEasyboardafk2() {
		return easyboardafk2;
	}
	public void setEasyboardafk2(int[][] easyboardafk2) {
		this.easyboardafk2 = easyboardafk2;
	}
	public int[][] getEasyboardafk3() {
		return easyboardafk3;
	}
	public void setEasyboardafk3(int[][] easyboardafk3) {
		this.easyboardafk3 = easyboardafk3;
	}
	public int[][] getMediumboardafk() {
		return mediumboardafk;
	}
	public void setMediumboardafk(int[][] mediumboardafk) {
		this.mediumboardafk = mediumboardafk;
	}
	public int[][] getMediumboardafk1() {
		return mediumboardafk1;
	}
	public void setMediumboardafk1(int[][] mediumboardafk1) {
		this.mediumboardafk1 = mediumboardafk1;
	}
	public int[][] getMediumboardafk2() {
		return mediumboardafk2;
	}
	public void setMediumboardafk2(int[][] mediumboardafk2) {
		this.mediumboardafk2 = mediumboardafk2;
	}
	public int[][] getMediumboardafk3() {
		return mediumboardafk3;
	}
	public void setMediumboardafk3(int[][] mediumboardafk3) {
		this.mediumboardafk3 = mediumboardafk3;
	}
	public int[][] getHardboardafk() {
		return hardboardafk;
	}
	public void setHardboardafk(int[][] hardboardafk) {
		this.hardboardafk = hardboardafk;
	}
	public int[][] getHardboardafk1() {
		return hardboardafk1;
	}
	public void setHardboardafk1(int[][] hardboardafk1) {
		this.hardboardafk1 = hardboardafk1;
	}
	public int[][] getHardboardafk2() {
		return hardboardafk2;
	}
	public void setHardboardafk2(int[][] hardboardafk2) {
		this.hardboardafk2 = hardboardafk2;
	}
	public int[][] getHardboardafk3() {
		return hardboardafk3;
	}
	public void setHardboardafk3(int[][] hardboardafk3) {
		this.hardboardafk3 = hardboardafk3;
	}
	public int[][] getEasyboard() {
		return easyboard;
	}
	public void setEasyboard(int[][] easyboard) {
		this.easyboard = easyboard;
	}
	
	public int[][] getEasyboard1() {
		return easyboard1;
	}
	public void setEasyboard1(int[][] easyboard1) {
		this.easyboard1 = easyboard1;
	}
	public int[][] getEasyboard2() {
		return easyboard2;
	}
	public void setEasyboard2(int[][] easyboard2) {
		this.easyboard2 = easyboard2;
	}
	public int[][] getEasyboard3() {
		return easyboard3;
	}
	public void setEasyboard3(int[][] easyboard3) {
		this.easyboard3 = easyboard3;
	}
	public int[][] getMediumboard() {
		return mediumboard;
	}
	public void setMediumboard(int[][] mediumboard) {
		this.mediumboard = mediumboard;
	}
	public int[][] getMediumboard1() {
		return mediumboard1;
	}
	public void setMediumboard1(int[][] mediumboard1) {
		this.mediumboard1 = mediumboard1;
	}
	public int[][] getMediumboard2() {
		return mediumboard2;
	}
	public void setMediumboard2(int[][] mediumboard2) {
		this.mediumboard2 = mediumboard2;
	}
	public int[][] getMediumboard3() {
		return mediumboard3;
	}
	public void setMediumboard3(int[][] mediumboard3) {
		this.mediumboard3 = mediumboard3;
	}
	public int[][] getHardboard() {
		return hardboard;
	}
	public void setHardboard(int[][] hardboard) {
		this.hardboard = hardboard;
	}
	public int[][] getHardboard1() {
		return hardboard1;
	}
	public void setHardboard1(int[][] hardboard1) {
		this.hardboard1 = hardboard1;
	}
	public int[][] getHardboard2() {
		return hardboard2;
	}
	public void setHardboard2(int[][] hardboard2) {
		this.hardboard2 = hardboard2;
	}
	public int[][] getHardboard3() {
		return hardboard3;
	}
	public void setHardboard3(int[][] hardboard3) {
		this.hardboard3 = hardboard3;
	}
	
}

