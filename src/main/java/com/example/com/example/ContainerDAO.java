package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ContainerDAO {
    private List<Container> containers = new ArrayList<>();

    public void adicionarContainer(Container container) {
        containers.add(container);
    }

    public void atualizarContainer(Container container) {
        // Lógica para atualizar o container no banco de dados
    }

    public void removerContainer(int id) {
        // Lógica para remover o container do banco de dados
    }

    public List<Container> listarConteineres() {
        return containers;
    }
}
