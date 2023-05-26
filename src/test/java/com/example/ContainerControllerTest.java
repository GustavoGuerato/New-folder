package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ContainerControllerTest {

    @Test
    void contextLoads() {
        // Lógica de teste
        ContainerController containerController = new ContainerController();

        // Verificar se o controller não é nulo
        assertNotNull(containerController);

        // Testar um cenário específico
        // Supondo que você tenha um método no Controller para adicionar um container
        Container container = new Container();
        container.setId(1);
        container.setCliente("Cliente Teste");
        container.setNumero("123456");
        container.setTipo("Tipo Teste");
        container.setStatus("Ativo");
        container.setCategoria("Categoria Teste");

        // Chamar o método de adicionarContainer
        containerController.adicionarContainer(container);

        // Verificar se o container foi adicionado corretamente
        assertEquals(1, containerController.listarConteineres().size());

        // Verificar se o container adicionado possui os valores corretos
        Container containerAdicionado = containerController.listarConteineres().get(0);
        assertEquals(1, containerAdicionado.getId());
        assertEquals("Cliente Teste", containerAdicionado.getCliente());
        assertEquals("123456", containerAdicionado.getNumero());
        assertEquals("Tipo Teste", containerAdicionado.getTipo());
        assertEquals("Ativo", containerAdicionado.getStatus());
        assertEquals("Categoria Teste", containerAdicionado.getCategoria());
    }

}
