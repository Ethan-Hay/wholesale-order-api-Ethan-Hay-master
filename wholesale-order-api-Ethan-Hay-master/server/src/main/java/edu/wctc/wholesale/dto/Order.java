package edu.wctc.wholesale.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class Order {
    private String purchaseOrderNumber;
    private String terms;
    private String customerName;
    private Timestamp purchaseDate;
    private String productName;
    private Timestamp shippedDate;
    private double productCost;
}
