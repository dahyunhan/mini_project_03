package hdh.service.admin;

import hdh.dao.OrderDAO;
import hdh.vo.OrderVO;

import java.util.ArrayList;


public class AdminOrderService {

    private final OrderDAO orderDAO = OrderDAO.getInstance();

    public AdminOrderService() {
    }

    public ArrayList<OrderVO> adminOrderList(String key) {
        return orderDAO.listOrder(key);
    }

    public void adminOrderSave(String[] resultArr) {
        for (String oseq : resultArr) {
            System.out.println(oseq);
            orderDAO.updateOrderResult(oseq);
        }
    }

}
