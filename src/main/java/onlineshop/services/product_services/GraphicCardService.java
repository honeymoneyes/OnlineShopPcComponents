package onlineshop.services.product_services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.products.GraphicCard;
import onlineshop.repositories.GraphicCardRepository;
import onlineshop.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GraphicCardService implements ProductService<GraphicCard> {
    private final GraphicCardRepository graphicCardRepository;

    @Override
    public List<GraphicCard> show() {
        return graphicCardRepository.findAll();
    }

    @Override
    public Optional<GraphicCard> find(int id) {
        return graphicCardRepository.findById(id);
    }

    @Transactional
    @Override
    public void add(GraphicCard graphicCard) {
        graphicCardRepository.save(graphicCard);
    }

    @Transactional
    @Override
    public void update(int id, GraphicCard graphicCard) {
        graphicCard.setId(id);
        graphicCardRepository.save(graphicCard);
    }
}
