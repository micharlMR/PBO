package Kuis;


public class Shop {
	static private int total;
	private int jumlah;
	
	private String report;
	
	public void showReport() {
		System.out.println(report);
	}
	
	public void addTransMonster(Monster mons,int jumlah) {
		StringBuffer tempReport = new StringBuffer("This Monster Name : ");
		tempReport.append(mons.getName());
		tempReport.append("\n");
		tempReport.append("This Monster effect : ");
		tempReport.append(mons.getEffect());
		tempReport.append("\n");
		tempReport.append("You Buy : ");
		tempReport.append(mons.getQty());
		tempReport.append(" Pieces\n");
		tempReport.append("Attack : ");
		tempReport.append(mons.getAtk());
		tempReport.append(" Points\n");
		tempReport.append("Defence : ");
		tempReport.append(mons.getDef());
		tempReport.append(" Points\n");
		tempReport.append("The Price : ");
		tempReport.append(mons.getBuyPrice());
		tempReport.append(" @Pieces\n");
		tempReport.append("You Must Pay : ");
		tempReport.append(mons.getBuyPrice() * jumlah);
		tempReport.append("\n");
		this.report = tempReport+"";
	}
	
	public void addTransSpell(Spell spell,int jumlah) {
		StringBuffer tempReport = new StringBuffer("This Monster Name : ");
		tempReport.append(spell.getName());
		tempReport.append("\n");
		tempReport.append("This Monster effect : ");
		tempReport.append(spell.getEffect());
		tempReport.append("\n");
		tempReport.append("You Buy : ");
		tempReport.append(spell.getQty());
		tempReport.append(" Pieces\n");
		tempReport.append("The Price : ");
		tempReport.append(spell.getBuyPrice());
		tempReport.append(" @Pieces\n");
		tempReport.append("You Must Pay : ");
		tempReport.append(spell.getBuyPrice() * jumlah);
		tempReport.append("\n");
		this.report = tempReport+"";
	}
}
