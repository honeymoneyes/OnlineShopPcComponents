package onlineshop.services.product_services;

import onlineshop.models.products.CasePC;
import onlineshop.models.products.GraphicCard;
import onlineshop.repositories.product_repositories.CasePCRepository;
import onlineshop.repositories.product_repositories.GraphicCardRepository;
import onlineshop.services.ProductAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class GraphicCardService extends ProductAbstractService<GraphicCard, GraphicCardRepository> {

	public GraphicCardService(GraphicCardRepository repository) {
		super(repository);
	}

	@Override
	public List<GraphicCard> show() {
		return repository.findAll();
	}

	@Override
	public Optional<GraphicCard> find(int id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(GraphicCard graphicCard) {
		repository.save(graphicCard);
	}

	@Transactional
	@Override
	public void update(int id, GraphicCard graphicCard) {
		graphicCard.setId(id);
		repository.save(graphicCard);
	}
}
