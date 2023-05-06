package graphql.template.presentation.resolvers.query;

import graphql.template.presentation.input.Input;
import graphql.template.presentation.response.Response;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ResourceQueryResolver implements GraphQLQueryResolver {

    public Response getResource(Input input) {
        // 用途に合わせてロジックを記載してね
        return Response.of(null);
    }

}
