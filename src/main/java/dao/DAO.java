package dao;

import java.util.List;

public interface DAO<T> {

	List<T> mostrarTodos();

	void guardar(T cl);

	void actualizar(int id, T cl);

	void borrar(T cl);
}
