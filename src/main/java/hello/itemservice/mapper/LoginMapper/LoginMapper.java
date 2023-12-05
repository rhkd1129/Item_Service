package hello.itemservice.mapper.LoginMapper;

import hello.itemservice.domain.login.MemberVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper {
    //xml방식
    @Select("SELECT * FROM member")
    public List<MemberVo> getList1();
}
