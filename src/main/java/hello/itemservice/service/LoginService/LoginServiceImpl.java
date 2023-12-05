package hello.itemservice.service.LoginService;

import hello.itemservice.domain.login.MemberVo;
import hello.itemservice.mapper.LoginMapper.LoginMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Data
    @Service
    public class LoginServiceImpl implements LoginService{
        @Autowired
        private LoginMapper loginMapper;

        public List<MemberVo> getList1() {

            return loginMapper.getList1();
        }

    }
