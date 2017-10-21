package service;

import java.util.List;

import domain.Kind;

public interface KindService {
	public void add(Kind kind);
	public List<Kind> findAll();
	public void delete(int kid);

}
