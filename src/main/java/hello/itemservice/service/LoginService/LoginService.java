package hello.itemservice.service.LoginService;

import hello.itemservice.domain.login.MemberVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

//인터페이스
public interface LoginService {
    public List<MemberVo> getList1();
}
