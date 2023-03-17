package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name = "wholesale_order")
public class WholesaleOrder {
    @Id
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "purchase_order_num")
    private String purchaseOrderNum;
    @Column(name = "terms")
    private String terms;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "purchase_date")
    private Timestamp purchaseDate;
    @Column(name = "shipped_date")
    private Timestamp shippedDate;
}
