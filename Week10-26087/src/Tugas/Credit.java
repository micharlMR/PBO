package Tugas;

public class Credit extends Payment{
	int installment;//ini gua jadiin bayar perbulannya
	int maxInstallment;//ini gua jadiin sisa bayarnya
	
	public Credit(Item item, int lama) {
		super(item);
		this.maxInstallment = item.getPrice();
		this.installment = item.getPrice()/lama;//cicil berapa kali
	}
	
	public int pay() {
		if(this.isPaidOff) {
			return 0;
		}
		this.maxInstallment = this.maxInstallment- this.installment;//bayar sebesar installment
		if(this.maxInstallment <= 0) {//kalo dah lunas
			this.isPaidOff = true;
		}
		return this.maxInstallment;//sisa bayar
	}
	
	public int getRemainingAmount() {
		if(isPaidOff) {
			return 0;
		}
		return maxInstallment;
	}
	
	public int getInstallment() {
		return this.installment;
	}
	
	public String getClassName() {
		return "CREDIT";
	}
}
