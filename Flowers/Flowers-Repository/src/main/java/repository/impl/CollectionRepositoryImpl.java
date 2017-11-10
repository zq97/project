package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Collection;
import domain.Product;
import domain.User;
import repository.BaseDao;
import repository.CollectionRepository;

public class CollectionRepositoryImpl extends BaseDao implements CollectionRepository {

	@Override
	public List<Collection> findAll() {
		List<Collection> collection = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM collection");
		if (rs != null) {
			try {
				while (rs.next()) {
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return collection;
	}

	@Override
	public void delete(int colid) {
		super.execute("DELETE FROM collection where colid = ?", colid);

	}

	@Override
	public void add(Collection collection, User user, Product product) {
		super.execute("INSERT INTO collection(uid,pid) values(?,?)", user.getUid(), product.getPid());

	}

}
