package onlineshop.services.product_services;

import onlineshop.models.products.GraphicCard;
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

	//CRUD methods
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

	/********************************************/

	//Filters methods
	@Override
	public List<String> showUniqueBrand() {
		return repository.getUniqueBrands();
	}

	@Override
	public List<String> showModels() {
		return repository.getModels();
	}

	public List<String> showUniqueFamily() {
		return repository.getUniqueFamily();
	}

	public List<Integer> showUniqueFrequency() {
		return repository.getUniqueFrequency();
	}

	public List<Integer> showUniqueMemory() {
		return repository.getUniqueMemory();
	}

	@Override
	public List<Integer> showUniqueFloorPrices() {
		return repository.getUniqueFloorPrices();
	}

	@Override
	public List<Integer> showUniqueCeilPrices() {
		return repository.getUniqueCeilPrices();
	}
}
