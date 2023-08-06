/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author anjanathrishakya
 */
public class OrderModel {
    private String orderId;
    private String orderDate;
    private String cutomerId;

    public OrderModel() {
    }

    public OrderModel(String orderId, String orderDate, String cutomerId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.cutomerId = cutomerId;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the cutomerId
     */
    public String getCutomerId() {
        return cutomerId;
    }

    /**
     * @param cutomerId the cutomerId to set
     */
    public void setCutomerId(String cutomerId) {
        this.cutomerId = cutomerId;
    }

    @Override
    public String toString() {
        return "OrderModel{" + "orderId=" + orderId + ", orderDate=" + orderDate + ", cutomerId=" + cutomerId + '}';
    }
    
    
}
