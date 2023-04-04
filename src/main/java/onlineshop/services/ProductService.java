package onlineshop.services;

import onlineshop.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProductService<T extends Product> {
    List<T> show();
    Optional<T> find(int id);
    void add(T t);
    void update(int id, T t);
}
