package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;
import repository.BaseDao;
import repository.UserRepository;

public class UserRepositoryImpl extends BaseDao implements UserRepository {

	@Override
	public void add(User user) {
		super.execute("insert into user(uname,upwd,usex,ubirthday,utype) values(?,?,?,?,?)", user.getUname(),
				user.getUpwd(), user.getUsex(), user.getUbirthday(), user.getUtype());

	}

	@Override
	public void update(User user) {
		super.execute("update user set uname=?,upwd=?,usex=?,ubirthday=? where uid=?", user.getUname(), user.getUpwd(),
				user.getUsex(), user.getUbirthday(), user.getUid());

	}

	@Override
	public List<User> findUser() {
		List<User> user=new ArrayList<>();
		ResultSet rs=(ResultSet) super.execute("select * from user");
		if(rs != null) {
			try {
				while(rs.next()) {
					user.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getInt(6)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return user;
	}

	@Override
	public User findByUname(String uname) {
		ResultSet rs=(ResultSet) super.execute("select * from User where uname=?",uname);
		if(rs != null) {
			try {
				rs.next();
				return new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getInt(6));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public User login(User u) {
		String sql = "select * from User where uname=? and upwd=? ";
		ResultSet rs =(ResultSet) execute(sql, u.getUname(),u.getUpwd());
		try {
			if (rs.next())
				return new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getInt(6));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
