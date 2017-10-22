package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Type;
import repository.BaseDao;
import repository.TypeRepository;

public class TypeRepositoryImpl extends BaseDao implements TypeRepository {

	@Override
	public List<Type> findAll() {
		List<Type> type = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM type");
		if (rs != null) {
			try {
				while (rs.next()) {
					type.add(new Type(rs.getInt(1), rs.getString(2)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return type;
	}

}
