package io.jaeyeon.myapp.config.dto;

import io.jaeyeon.myapp.model.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * 세션에 저장하려면 직렬화를 해야 하는데
 * User Entity는 추후 변경사항이 있을 수 있기 때문에
 * 직렬화를 하기 위한 별도의 SessionUser 클래스 생성
 */
@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
