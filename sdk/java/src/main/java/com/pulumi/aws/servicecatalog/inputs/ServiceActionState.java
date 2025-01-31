// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceActionState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceActionState Empty = new ServiceActionState();

    /**
     * Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    /**
     * @return Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
     * 
     */
    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Self-service action definition configuration block. Detailed below.
     * 
     */
    @Import(name="definition")
    private @Nullable Output<ServiceActionDefinitionArgs> definition;

    /**
     * @return Self-service action definition configuration block. Detailed below.
     * 
     */
    public Optional<Output<ServiceActionDefinitionArgs>> definition() {
        return Optional.ofNullable(this.definition);
    }

    /**
     * Self-service action description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Self-service action description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Self-service action name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Self-service action name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ServiceActionState() {}

    private ServiceActionState(ServiceActionState $) {
        this.acceptLanguage = $.acceptLanguage;
        this.definition = $.definition;
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceActionState $;

        public Builder() {
            $ = new ServiceActionState();
        }

        public Builder(ServiceActionState defaults) {
            $ = new ServiceActionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param acceptLanguage Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        /**
         * @param definition Self-service action definition configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder definition(@Nullable Output<ServiceActionDefinitionArgs> definition) {
            $.definition = definition;
            return this;
        }

        /**
         * @param definition Self-service action definition configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder definition(ServiceActionDefinitionArgs definition) {
            return definition(Output.of(definition));
        }

        /**
         * @param description Self-service action description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Self-service action description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Self-service action name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Self-service action name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ServiceActionState build() {
            return $;
        }
    }

}
