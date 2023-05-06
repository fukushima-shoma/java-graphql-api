package graphql.template.presentation.resolvers.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;
import graphql.template.presentation.input.Input;
import graphql.template.presentation.response.MutationResponse;
import java.util.List;
import javax.validation.constraints.NotNull;

@Component
public class ResourceMutationResolver implements GraphQLMutationResolver {

    public MutationResponse updateResource(@NotNull List<Input> inputList) {
        // 用途に合わせてロジックをかいて
        return MutationResponse.of(false);
    }
}
