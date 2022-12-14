package model_dao;
import java.util.List;

import entities.Department;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department finByID(Integer id);
    List<Department> findAll();
}
