package models;
import java.util.ArrayList;
import java.util.List;

public class SellerUser extends User {
	//buraya sellerin ek özellikleri gelecek
	private int storeId;
    private List<Product> managedProducts;
    private double monthlyTarget;
    private double currentPerformance;
	   SellerUser(int id, int password,int storeId, String email, String role, String name, String surname, String secretQuestion, double monthlyTarget, double currentPerformence) {
		super(id, password, email, role, name, surname, secretQuestion);
        this.setStoreId(storeId);
        this.managedProducts = new ArrayList<>();
        this.setMonthlyTarget(monthlyTarget);
        this.setCurrentPerformance(0.0);
		// TODO Auto-generated constructor stub
	}
    public void addProduct(Product product) {
    	managedProducts.add(product);
	        System.out.println(product.getName() + " ürünü eklendi.");
	}

	public void generateSalesReport() {
	    System.out.println("Satış raporu oluşturuluyor...");
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public double getMonthlyTarget() {
		return monthlyTarget;
	}
	public void setMonthlyTarget(double monthlyTarget) {
		this.monthlyTarget = monthlyTarget;
	}
	public double getCurrentPerformance() {
		return currentPerformance;
	}
	public void setCurrentPerformance(double currentPerformance) {
		this.currentPerformance = currentPerformance;
	}
}
 