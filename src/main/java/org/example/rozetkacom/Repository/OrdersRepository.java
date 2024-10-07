package org.example.rozetkacom.Repository;

import org.example.rozetkacom.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
    Orders getOrdersById(Long id);
}
