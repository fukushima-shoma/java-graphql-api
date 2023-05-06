package graphql.template.presentation.response;

import graphql.template.domain.entity.User;
import lombok.AccessLevel;
import lombok.Builder;
import java.util.List;

@Builder(access = AccessLevel.PRIVATE)
public class Response {
    private List<User> userList;

    public static Response of(List<User> userList) {
        return Response.builder()
        .userList(userList)
        .build();
    }
}
