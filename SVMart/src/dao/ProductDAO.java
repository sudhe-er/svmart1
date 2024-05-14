package dao;

import java.util.List;

public interface ProductDAO {
	// CRUD Operations// db related opperations

	public boolean logIn(String username, String password);

	public int addUser(String username, String password);

	public List<List<Object>> getProductList();

	public boolean getServiceableRegions(int pin, int pctid);

	public int getGst(int pid);

}
