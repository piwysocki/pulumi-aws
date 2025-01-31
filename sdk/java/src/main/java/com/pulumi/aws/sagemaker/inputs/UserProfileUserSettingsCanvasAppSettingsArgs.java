// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsCanvasAppSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsCanvasAppSettingsArgs Empty = new UserProfileUserSettingsCanvasAppSettingsArgs();

    /**
     * Time series forecast settings for the Canvas app. see Time Series Forecasting Settings below.
     * 
     */
    @Import(name="timeSeriesForecastingSettings")
    private @Nullable Output<UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs> timeSeriesForecastingSettings;

    /**
     * @return Time series forecast settings for the Canvas app. see Time Series Forecasting Settings below.
     * 
     */
    public Optional<Output<UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs>> timeSeriesForecastingSettings() {
        return Optional.ofNullable(this.timeSeriesForecastingSettings);
    }

    private UserProfileUserSettingsCanvasAppSettingsArgs() {}

    private UserProfileUserSettingsCanvasAppSettingsArgs(UserProfileUserSettingsCanvasAppSettingsArgs $) {
        this.timeSeriesForecastingSettings = $.timeSeriesForecastingSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserProfileUserSettingsCanvasAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileUserSettingsCanvasAppSettingsArgs $;

        public Builder() {
            $ = new UserProfileUserSettingsCanvasAppSettingsArgs();
        }

        public Builder(UserProfileUserSettingsCanvasAppSettingsArgs defaults) {
            $ = new UserProfileUserSettingsCanvasAppSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param timeSeriesForecastingSettings Time series forecast settings for the Canvas app. see Time Series Forecasting Settings below.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesForecastingSettings(@Nullable Output<UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs> timeSeriesForecastingSettings) {
            $.timeSeriesForecastingSettings = timeSeriesForecastingSettings;
            return this;
        }

        /**
         * @param timeSeriesForecastingSettings Time series forecast settings for the Canvas app. see Time Series Forecasting Settings below.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesForecastingSettings(UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettingsArgs timeSeriesForecastingSettings) {
            return timeSeriesForecastingSettings(Output.of(timeSeriesForecastingSettings));
        }

        public UserProfileUserSettingsCanvasAppSettingsArgs build() {
            return $;
        }
    }

}
