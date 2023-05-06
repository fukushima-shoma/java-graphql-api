package graphql.template.presentation.response;

import lombok.AccessLevel;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE)
public class MutationResponse {
    private boolean success;

    public static MutationResponse of(boolean success) {
        return MutationResponse.builder()
        .success(success)
        .build();
    }
}
