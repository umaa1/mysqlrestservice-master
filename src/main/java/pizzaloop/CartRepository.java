package pizzaloop;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CartRepository extends CrudRepository<CartDetails, Integer>{
    /*
     * Find pizza by Id
     */
    //List<PizzaDetails> findByPizzaId(Integer id);

    /*
     * Delete pizza by Id
     */
    //List<PizzaDetails> deleteByPizzaId(Integer id);
}
