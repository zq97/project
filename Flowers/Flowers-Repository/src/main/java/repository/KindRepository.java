package repository;

import java.util.List;

import domain.Kind;

public interface KindRepository {
	public void add(Kind kind);
	public List<Kind> findAll();
	public void delete(int kid);

}
