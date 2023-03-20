package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.GraphicCard;
import onlineshop.repositories.GraphicCardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GraphicCardService {
    private final GraphicCardRepository graphicCardRepository;

    public List<GraphicCard> graphicCardsList() { // Displays a list of a graphic cards
        return graphicCardRepository.findAll();
    }
    public Optional<GraphicCard> findGraphicCardById(int id) { // Displays a graphic card by id
        return graphicCardRepository.findById(id);
    }
    @Transactional
    public void addGraphicCard(GraphicCard graphicCard) { // Adds a graphic card
        graphicCardRepository.save(graphicCard);
    }
    @Transactional
    public void updateInfoAboutGraphicCard(int id, GraphicCard graphicCard) { // Updates info about for a graphic card
        graphicCard.setId(id);
        graphicCardRepository.save(graphicCard);
    }
}
