package hello.itemservice.domain.login;

import lombok.Data;

@Data
public class MemberVo {
    private String id;
    private String email;
    private String name;
    private String password;
}
