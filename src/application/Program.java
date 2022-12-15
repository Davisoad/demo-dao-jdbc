package application;

import java.util.List;

import entities.Department;
import entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.crateSellerDao();
        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.finById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll =====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
