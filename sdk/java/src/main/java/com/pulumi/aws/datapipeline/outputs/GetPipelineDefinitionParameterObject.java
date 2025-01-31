// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.outputs;

import com.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionParameterObjectAttribute;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPipelineDefinitionParameterObject {
    private List<GetPipelineDefinitionParameterObjectAttribute> attributes;
    /**
     * @return ID of the object.
     * 
     */
    private String id;

    private GetPipelineDefinitionParameterObject() {}
    public List<GetPipelineDefinitionParameterObjectAttribute> attributes() {
        return this.attributes;
    }
    /**
     * @return ID of the object.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionParameterObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPipelineDefinitionParameterObjectAttribute> attributes;
        private String id;
        public Builder() {}
        public Builder(GetPipelineDefinitionParameterObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder attributes(List<GetPipelineDefinitionParameterObjectAttribute> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(GetPipelineDefinitionParameterObjectAttribute... attributes) {
            return attributes(List.of(attributes));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetPipelineDefinitionParameterObject build() {
            final var o = new GetPipelineDefinitionParameterObject();
            o.attributes = attributes;
            o.id = id;
            return o;
        }
    }
}
