package repository.impl;

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

}
