// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ram.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetResourceShareFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceShareFilter Empty = new GetResourceShareFilter();

    /**
     * Name of the tag key to filter on.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the tag key to filter on.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Value of the tag key.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Value of the tag key.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetResourceShareFilter() {}

    private GetResourceShareFilter(GetResourceShareFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceShareFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceShareFilter $;

        public Builder() {
            $ = new GetResourceShareFilter();
        }

        public Builder(GetResourceShareFilter defaults) {
            $ = new GetResourceShareFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the tag key to filter on.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values Value of the tag key.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Value of the tag key.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetResourceShareFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
