package repository;

import java.util.List;

import domain.Comment;


public interface CommentRepository {
	public void save(Comment comment);
	public List<Comment> findAll();
	public void delete(int coid);


}
