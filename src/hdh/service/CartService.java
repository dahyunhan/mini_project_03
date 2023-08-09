package hdh.service;

import hdh.dao.CartDAO;
import hdh.vo.CartVO;

import java.util.List;


public class CartService {

    private static CartService instance = new CartService();
    private final CartDAO dao = CartDAO.getInstance();

    private CartService() {
    }

    public static CartService getInstance() {
        return instance;
    }

    public List<CartVO> listCart(String id) {
        return dao.listCart(id);
    }

    public void deleteCart(int cseq) {
        dao.deleteCart(cseq);
    }

    public void insertCart(CartVO vo) {
        dao.insertCart(vo);
    }


}
