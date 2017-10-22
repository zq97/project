package repository;

import java.util.List;

import domain.Comment;
import domain.Product;
import domain.User;


public interface CommentRepository {
	public void save(Comment comment,User user,Product product);
	public List<Comment> findAll();
	public void delete(int coid);


}
