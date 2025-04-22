package meu.curso.microservicos.pedido.resources;

import meu.curso.microservicos.pedido.dto.PedidoDto;
import meu.curso.microservicos.pedido.entities.Pedido;
import meu.curso.microservicos.pedido.mapper.PedidoMapper;
import meu.curso.microservicos.pedido.services.PedidoService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

    private final RabbitTemplate rabbitTemplate;
    private final PedidoService pedidoService;

    @Value("${broker.queue.processamento.name}")
    private String routingKey;

    public PedidoResource(RabbitTemplate rabbitTemplate, PedidoService pedidoService) {
        this.rabbitTemplate = rabbitTemplate;
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public String criarPedido(@RequestBody Pedido pedido) {
        Pedido pedidoSalvo = pedidoService.salvarPedido(pedido);

        PedidoDto pedidoDto = PedidoMapper.toDTO(pedidoSalvo);

        rabbitTemplate.convertAndSend("", routingKey, pedidoDto);

        return "Pedido salvo e enviado para processamento: " + pedidoSalvo.getDescricao();
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

}
