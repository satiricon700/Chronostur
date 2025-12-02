package com.chronostur.chronostur.dao;

import com.chronostur.chronostur.model.Cliente;
import java.util.List;

public interface ClienteDao {
    void insertar(Cliente cliente);
    Cliente buscarPorId(int id);
    List<Cliente> listarTodos();
    void actualizar(Cliente cliente);
    void eliminar(int id);
}

