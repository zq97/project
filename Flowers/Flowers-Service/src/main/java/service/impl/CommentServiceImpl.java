package service.impl;

import java.util.List;

import domain.Comment;
import repository.CommentRepository;
import repository.impl.CommentRepositoryImpl;
import service.CommentService;

public class CommentServiceImpl implements CommentService {
	private CommentRepository commentRepository = new CommentRepositoryImpl();

	@Override
	public void save(Comment comment) {
		commentRepository.save(comment);
		
	}

	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return commentRepository.findAll();
	}

	@Override
	public void delete(int coid) {
		commentRepository.delete(coid);
		
	}

}
