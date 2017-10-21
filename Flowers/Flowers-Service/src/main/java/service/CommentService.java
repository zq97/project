package service;

import java.util.List;

import domain.Comment;


public interface CommentService {
	public void save(Comment comment);
	public List<Comment> findAll();
	public void delete(int coid);


}
