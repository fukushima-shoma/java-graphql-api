package graphql.template.presentation.input;

import graphql.schema.GraphQLInputType;
import graphql.schema.GraphQLSchemaElement;
import graphql.schema.GraphQLTypeVisitor;
import graphql.util.TraversalControl;
import graphql.util.TraverserContext;
import jakarta.validation.constraints.NotBlank;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Input implements GraphQLInputType {
    @NotBlank
    private String id;

    @NotBlank
    private Boolean isChecked;

    @Override
    public TraversalControl accept(TraverserContext<GraphQLSchemaElement> context, GraphQLTypeVisitor visitor) {
        return null;
    }

    @Override
    public GraphQLSchemaElement copy() { return null;}
}
