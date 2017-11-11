package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int uid) {
		ResultSet rs=(ResultSet) super.execute("select * from User where uid=?",uid);
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

}
