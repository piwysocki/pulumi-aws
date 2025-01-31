// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteMatchHostname;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteSpecHttpRouteMatch {
    /**
     * @return Host name to rewrite.
     * 
     */
    private @Nullable GatewayRouteSpecHttpRouteMatchHostname hostname;
    /**
     * @return The port number to match from the request.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Specified beginning characters to rewrite.
     * 
     */
    private @Nullable String prefix;

    private GatewayRouteSpecHttpRouteMatch() {}
    /**
     * @return Host name to rewrite.
     * 
     */
    public Optional<GatewayRouteSpecHttpRouteMatchHostname> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return The port number to match from the request.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Specified beginning characters to rewrite.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GatewayRouteSpecHttpRouteMatchHostname hostname;
        private @Nullable Integer port;
        private @Nullable String prefix;
        public Builder() {}
        public Builder(GatewayRouteSpecHttpRouteMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.port = defaults.port;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder hostname(@Nullable GatewayRouteSpecHttpRouteMatchHostname hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public GatewayRouteSpecHttpRouteMatch build() {
            final var o = new GatewayRouteSpecHttpRouteMatch();
            o.hostname = hostname;
            o.port = port;
            o.prefix = prefix;
            return o;
        }
    }
}
