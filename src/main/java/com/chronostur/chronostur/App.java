package com.chronostur.chronostur;

import com.chronostur.chronostur.dao.ClienteDaoImpl;
import com.chronostur.chronostur.model.Cliente;

public class App {
    public static void main(String[] args) {
        ClienteDaoImpl dao = new ClienteDaoImpl();

        // 1. Insertar un nuevo cliente
        Cliente nuevo = new Cliente(0, "Abot", "3001234567");
        dao.insertar(nuevo);

        // Mostrar el ID asignado automáticamente
        System.out.println("Cliente insertado con ID: " + nuevo.getId());

        // 2. Buscar el cliente recién insertado por su ID
        Cliente buscado = dao.buscarPorId(nuevo.getId());
        if (buscado != null) {
            System.out.println("Cliente encontrado: " + buscado.getNombre() + " | Teléfono: " + buscado.getTelefono());
        } else {
            System.out.println("Cliente no encontrado.");
        }

        // 3. Listar todos los clientes en la tabla
        System.out.println("\nListado de todos los clientes:");
        for (Cliente c : dao.listarTodos()) {
            System.out.println("ID: " + c.getId() + " | Nombre: " + c.getNombre() + " | Teléfono: " + c.getTelefono());
        }
    }
}
