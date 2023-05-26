import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/containers")
public class ContainerController {
    @Autowired
    private ContainerDAO containerDAO;

    @PostMapping
    public void adicionarContainer(@RequestBody Container container) {
        containerDAO.adicionarContainer(container);
    }

    @PutMapping("/{id}")
    public void atualizarContainer(@PathVariable int id, @RequestBody Container container) {
        container.setId(id);
        containerDAO.atualizarContainer(container);
    }

    @DeleteMapping("/{id}")
    public void removerContainer(@PathVariable int id) {
        containerDAO.removerContainer(id);
    }

    @GetMapping
    public List<Container> listarConteineres() {
        return containerDAO.listarConteineres();
    }
}
