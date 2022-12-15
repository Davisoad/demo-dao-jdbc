package application;

import entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.crateSellerDao();
        
        Seller seller = sellerDao.finById(3);

        System.out.println(seller);
    }
}
