package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Comment;
import domain.Product;
import domain.User;
import repository.BaseDao;
import repository.CommentRepository;

public class CommentRepositoryImpl extends BaseDao implements CommentRepository {

	@Override
	public List<Comment> findAll() {
		List<Comment> comment = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM comment");
		if (rs != null) {
			try {
				while (rs.next()) {
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return comment;
	}

	@Override
	public void delete(int coid) {
		super.execute("DELETE FROM comment where coid = ?", coid);

	}

	@Override
	public void save(Comment comment, User user, Product product) {
		super.execute("INSERT INTO comment(uid,pid,ctime,ccontent) values(?,?,?,?)", user.getUid(), product.getPid(),
				comment.getCtime(), comment.getCcontent());

	}

}
