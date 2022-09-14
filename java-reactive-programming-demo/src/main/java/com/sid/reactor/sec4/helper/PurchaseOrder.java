package com.sid.reactor.sec4.helper;

import com.sid.reactor.util.Util;
import lombok.Data;
import lombok.ToString;

/**
 * @author Siddhant Patni
 */
@Data
@ToString
public class PurchaseOrder {

    private String item;
    private String price;
    private int userId;

    public PurchaseOrder(int userId) {
        this.userId = userId;
        this.item = Util.faker().commerce().productName();
        this.price = Util.faker().commerce().price();
    }
}