package model_dao;
import java.util.List;
import entities.Seller;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Seller id);
    Seller finByID(Seller id);
    List<Seller> findAll();
}
