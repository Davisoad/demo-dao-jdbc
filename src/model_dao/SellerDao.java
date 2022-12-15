package model_dao;
import java.util.List;

import entities.Department;
import entities.Seller;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller finById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
