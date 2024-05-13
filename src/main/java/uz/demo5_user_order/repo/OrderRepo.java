package uz.demo5_user_order.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import uz.demo5_user_order.entity.Orders;

import java.util.List;

import static uz.demo5_user_order.config.MyListener.emf;

public class OrderRepo {
    public static List<Orders> all() {
        EntityManager entityManager = emf.createEntityManager();
        TypedQuery<Orders> selectTFromGroupT = entityManager.createQuery("select t from Orders t", Orders.class);
        return selectTFromGroupT.getResultList();
    }
}
