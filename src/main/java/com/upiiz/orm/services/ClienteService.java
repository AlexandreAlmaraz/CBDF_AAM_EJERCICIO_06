package com.upiiz.orm.services;

import com.upiiz.orm.models.ClienteEntity;
import com.upiiz.orm.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    // Inyectar una dependencia - Conectar
    @Autowired
    ClienteRepository clienteRepository;

    // Listar todos
    public List<ClienteEntity> obtenerTodos() {
        return clienteRepository.findAll();
    }

    // Guardar un cliente
    public ClienteEntity guardarCliente(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

    // Actualizar un cliente
    public ClienteEntity actualizarCliente(ClienteEntity clienteEntity) {
        if (clienteRepository.existsById(clienteEntity.getId())) {
            return clienteRepository.save(clienteEntity);
        }
        return null;
    }

    // Eliminar un cliente
    public boolean eliminarCliente(Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
