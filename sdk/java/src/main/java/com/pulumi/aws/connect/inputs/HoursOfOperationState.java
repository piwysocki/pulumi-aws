// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HoursOfOperationState extends com.pulumi.resources.ResourceArgs {

    public static final HoursOfOperationState Empty = new HoursOfOperationState();

    /**
     * The Amazon Resource Name (ARN) of the Hours of Operation.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Hours of Operation.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
     * 
     */
    @Import(name="configs")
    private @Nullable Output<List<HoursOfOperationConfigArgs>> configs;

    /**
     * @return One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
     * 
     */
    public Optional<Output<List<HoursOfOperationConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    /**
     * Specifies the description of the Hours of Operation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies the description of the Hours of Operation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (**Deprecated**) The Amazon Resource Name (ARN) of the Hours of Operation.
     * 
     * @deprecated
     * use &#39;arn&#39; attribute instead
     * 
     */
    @Deprecated /* use 'arn' attribute instead */
    @Import(name="hoursOfOperationArn")
    private @Nullable Output<String> hoursOfOperationArn;

    /**
     * @return (**Deprecated**) The Amazon Resource Name (ARN) of the Hours of Operation.
     * 
     * @deprecated
     * use &#39;arn&#39; attribute instead
     * 
     */
    @Deprecated /* use 'arn' attribute instead */
    public Optional<Output<String>> hoursOfOperationArn() {
        return Optional.ofNullable(this.hoursOfOperationArn);
    }

    /**
     * The identifier for the hours of operation.
     * 
     */
    @Import(name="hoursOfOperationId")
    private @Nullable Output<String> hoursOfOperationId;

    /**
     * @return The identifier for the hours of operation.
     * 
     */
    public Optional<Output<String>> hoursOfOperationId() {
        return Optional.ofNullable(this.hoursOfOperationId);
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Specifies the name of the Hours of Operation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Hours of Operation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Specifies the time zone of the Hours of Operation.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Specifies the time zone of the Hours of Operation.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private HoursOfOperationState() {}

    private HoursOfOperationState(HoursOfOperationState $) {
        this.arn = $.arn;
        this.configs = $.configs;
        this.description = $.description;
        this.hoursOfOperationArn = $.hoursOfOperationArn;
        this.hoursOfOperationId = $.hoursOfOperationId;
        this.instanceId = $.instanceId;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HoursOfOperationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HoursOfOperationState $;

        public Builder() {
            $ = new HoursOfOperationState();
        }

        public Builder(HoursOfOperationState defaults) {
            $ = new HoursOfOperationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param configs One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder configs(@Nullable Output<List<HoursOfOperationConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        /**
         * @param configs One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder configs(List<HoursOfOperationConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        /**
         * @param configs One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder configs(HoursOfOperationConfigArgs... configs) {
            return configs(List.of(configs));
        }

        /**
         * @param description Specifies the description of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies the description of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hoursOfOperationArn (**Deprecated**) The Amazon Resource Name (ARN) of the Hours of Operation.
         * 
         * @return builder
         * 
         * @deprecated
         * use &#39;arn&#39; attribute instead
         * 
         */
        @Deprecated /* use 'arn' attribute instead */
        public Builder hoursOfOperationArn(@Nullable Output<String> hoursOfOperationArn) {
            $.hoursOfOperationArn = hoursOfOperationArn;
            return this;
        }

        /**
         * @param hoursOfOperationArn (**Deprecated**) The Amazon Resource Name (ARN) of the Hours of Operation.
         * 
         * @return builder
         * 
         * @deprecated
         * use &#39;arn&#39; attribute instead
         * 
         */
        @Deprecated /* use 'arn' attribute instead */
        public Builder hoursOfOperationArn(String hoursOfOperationArn) {
            return hoursOfOperationArn(Output.of(hoursOfOperationArn));
        }

        /**
         * @param hoursOfOperationId The identifier for the hours of operation.
         * 
         * @return builder
         * 
         */
        public Builder hoursOfOperationId(@Nullable Output<String> hoursOfOperationId) {
            $.hoursOfOperationId = hoursOfOperationId;
            return this;
        }

        /**
         * @param hoursOfOperationId The identifier for the hours of operation.
         * 
         * @return builder
         * 
         */
        public Builder hoursOfOperationId(String hoursOfOperationId) {
            return hoursOfOperationId(Output.of(hoursOfOperationId));
        }

        /**
         * @param instanceId Specifies the identifier of the hosting Amazon Connect Instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Specifies the identifier of the hosting Amazon Connect Instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param name Specifies the name of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param timeZone Specifies the time zone of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Specifies the time zone of the Hours of Operation.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public HoursOfOperationState build() {
            return $;
        }
    }

}
