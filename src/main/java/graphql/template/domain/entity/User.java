package graphql.template.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(access = AccessLevel.PRIVATE)
public class User {
    private final String id;
    private final String name;
    private final boolean isChecked;

    public static User of(String id, String name, boolean isChecked) {
        return User.builder()
        .id(id)
        .name(name)
        .isChecked(isChecked)
        .build();

    }
}
