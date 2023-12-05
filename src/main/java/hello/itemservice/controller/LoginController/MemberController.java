package hello.itemservice.controller.LoginController;

import hello.itemservice.domain.login.MemberVo;
import hello.itemservice.mapper.LoginMapper.LoginMapper;
import hello.itemservice.service.LoginService.LoginService;
import hello.itemservice.service.LoginService.LoginServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//인텔리제이를 이용한 commit test
@RestController
@Slf4j
public class MemberController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private LoginMapper loginMapper;

    //기본 메인 페이지
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public ModelAndView login() {
        log.info("Tologin");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/main/main"); // 파일 경로 맨 앞에 / 챙겨주기
        return mv;
    }

    //mapper로 불러오기
    @RequestMapping(value = "/user" , method = RequestMethod.GET)
    public List<MemberVo> getAllUsers() {
        List<MemberVo> output = loginMapper.getList1();
        return output;
    }

    //service로 불러오기
    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public List<MemberVo> getAllUsers2() {
        List<MemberVo> output = loginService.getList1();
        log.info("성공?");
        return output;
    }

}
