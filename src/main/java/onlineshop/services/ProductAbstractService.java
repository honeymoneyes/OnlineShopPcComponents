package onlineshop.services;

import lombok.RequiredArgsConstructor;
import onlineshop.models.ProductAbstractEntity;
import onlineshop.repositories.CommonRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public abstract class ProductAbstractService<E extends ProductAbstractEntity, R extends CommonRepository<E>> implements CommonService<E> {
	public final R repository;
}