package umn.ac.id.uts;

public class Activities {
	private String namaAktifitas;
	private int minEXP;
	private int reward;
	
	
	public Activities() {};
	public Activities(String namaAktifitas, int minEXP, int reward) {
		this.namaAktifitas = namaAktifitas;
		this.minEXP = minEXP;
		this.reward = reward;
	}
	
	public String getNamaAktifitas() {
		return namaAktifitas;
	}
	
	public int getMinEXP() {
		return minEXP;
	}
	
	public int getReward() {
		return reward;
	}
}
