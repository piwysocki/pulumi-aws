// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPoolClientAnalyticsConfiguration {
    /**
     * @return Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    private @Nullable String applicationArn;
    /**
     * @return Application ID for an Amazon Pinpoint application.
     * 
     */
    private @Nullable String applicationId;
    /**
     * @return ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    private @Nullable String externalId;
    /**
     * @return ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * 
     */
    private @Nullable String roleArn;
    /**
     * @return If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    private @Nullable Boolean userDataShared;

    private UserPoolClientAnalyticsConfiguration() {}
    /**
     * @return Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    public Optional<String> applicationArn() {
        return Optional.ofNullable(this.applicationArn);
    }
    /**
     * @return Application ID for an Amazon Pinpoint application.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * @return ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }
    /**
     * @return ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    public Optional<Boolean> userDataShared() {
        return Optional.ofNullable(this.userDataShared);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolClientAnalyticsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String applicationArn;
        private @Nullable String applicationId;
        private @Nullable String externalId;
        private @Nullable String roleArn;
        private @Nullable Boolean userDataShared;
        public Builder() {}
        public Builder(UserPoolClientAnalyticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationArn = defaults.applicationArn;
    	      this.applicationId = defaults.applicationId;
    	      this.externalId = defaults.externalId;
    	      this.roleArn = defaults.roleArn;
    	      this.userDataShared = defaults.userDataShared;
        }

        @CustomType.Setter
        public Builder applicationArn(@Nullable String applicationArn) {
            this.applicationArn = applicationArn;
            return this;
        }
        @CustomType.Setter
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        @CustomType.Setter
        public Builder externalId(@Nullable String externalId) {
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder userDataShared(@Nullable Boolean userDataShared) {
            this.userDataShared = userDataShared;
            return this;
        }
        public UserPoolClientAnalyticsConfiguration build() {
            final var o = new UserPoolClientAnalyticsConfiguration();
            o.applicationArn = applicationArn;
            o.applicationId = applicationId;
            o.externalId = externalId;
            o.roleArn = roleArn;
            o.userDataShared = userDataShared;
            return o;
        }
    }
}
