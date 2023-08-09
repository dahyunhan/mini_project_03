package hdh.service.admin;

import hdh.dao.MemberDAO;
import hdh.dao.WorkerDAO;
import hdh.vo.MemberVO;

import java.util.ArrayList;


public class AdminMemberService {

    private final WorkerDAO workerDAO = WorkerDAO.getInstance();
    private final MemberDAO memberDAO = MemberDAO.getInstance();

    public AdminMemberService() {
    }

    public int adminLoginForm(String workerId, String workerPwd) {
        return workerDAO.workerCheck(workerId, workerPwd);
    }

    public ArrayList<MemberVO> adminMemberList(String key) {
        return memberDAO.listMember(key);
    }

}
