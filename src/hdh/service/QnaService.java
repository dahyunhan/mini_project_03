package hdh.service;


import hdh.dao.QnaDAO;
import hdh.vo.QnaVO;

import java.util.ArrayList;


public class QnaService {
    private static QnaService instance = new QnaService();

    private final QnaDAO qnaDAO = QnaDAO.getInstance();

    private QnaService() {

    }

    public static QnaService getInstance() {
        return instance;
    }

    public ArrayList<QnaVO> listQna(String id) {
        return qnaDAO.listQna(id);
    }

    public QnaVO detailQna(int seq) {
        return qnaDAO.getQna(seq);
    }


    public void insertQna(QnaVO vo, String id) {
        qnaDAO.insertqna(vo, id);
    }
}
