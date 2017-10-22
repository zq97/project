package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Picture;
import repository.BaseDao;
import repository.PictureRepository;

public class PictureRepositoryImpl extends BaseDao implements PictureRepository {

	@Override
	public void add(Picture picture) {
		super.execute("INSERT INTO picture(piname,piaddress) values (?,?)", picture.getPiname(),
				picture.getPiaddress());

	}

	@Override
	public List<Picture> findAll() {
		List<Picture> picture = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM picture");
		if (rs != null) {
			try {
				while (rs.next()) {
					picture.add(new Picture(rs.getInt(1), rs.getString(2), rs.getString(3)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return picture;
	}

	@Override
	public void delete(int piid) {
		super.execute("DELETE FROM picture where piid = ?", piid);

	}

}
