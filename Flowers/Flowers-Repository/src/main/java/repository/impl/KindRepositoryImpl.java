package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Kind;
import repository.BaseDao;
import repository.KindRepository;

public class KindRepositoryImpl extends BaseDao implements KindRepository {

	@Override
	public void add(Kind kind) {
		super.execute("INSERT INTO kind(kname) VALIUES(?)", kind.getKname());

	}

	@Override
	public List<Kind> findAll() {
		List<Kind> kind = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM kind");
		if (rs != null) {
			try {
				while (rs.next()) {
					kind.add(new Kind(rs.getInt(1), rs.getString(2)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return kind;
	}

	@Override
	public void delete(int kid) {
		super.execute("DELETE FROM kind where kid=?", kid);

	}

}
