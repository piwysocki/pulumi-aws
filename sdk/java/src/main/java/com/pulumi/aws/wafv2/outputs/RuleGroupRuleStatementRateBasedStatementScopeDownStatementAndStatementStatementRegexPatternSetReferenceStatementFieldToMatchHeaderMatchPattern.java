// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAll;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPattern {
    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAll all;
    /**
     * @return An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
     * 
     */
    private @Nullable List<String> excludedHeaders;
    /**
     * @return An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
     * 
     */
    private @Nullable List<String> includedHeaders;

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPattern() {}
    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAll> all() {
        return Optional.ofNullable(this.all);
    }
    /**
     * @return An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
     * 
     */
    public List<String> excludedHeaders() {
        return this.excludedHeaders == null ? List.of() : this.excludedHeaders;
    }
    /**
     * @return An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
     * 
     */
    public List<String> includedHeaders() {
        return this.includedHeaders == null ? List.of() : this.includedHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAll all;
        private @Nullable List<String> excludedHeaders;
        private @Nullable List<String> includedHeaders;
        public Builder() {}
        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.excludedHeaders = defaults.excludedHeaders;
    	      this.includedHeaders = defaults.includedHeaders;
        }

        @CustomType.Setter
        public Builder all(@Nullable RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAll all) {
            this.all = all;
            return this;
        }
        @CustomType.Setter
        public Builder excludedHeaders(@Nullable List<String> excludedHeaders) {
            this.excludedHeaders = excludedHeaders;
            return this;
        }
        public Builder excludedHeaders(String... excludedHeaders) {
            return excludedHeaders(List.of(excludedHeaders));
        }
        @CustomType.Setter
        public Builder includedHeaders(@Nullable List<String> includedHeaders) {
            this.includedHeaders = includedHeaders;
            return this;
        }
        public Builder includedHeaders(String... includedHeaders) {
            return includedHeaders(List.of(includedHeaders));
        }
        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPattern build() {
            final var o = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPattern();
            o.all = all;
            o.excludedHeaders = excludedHeaders;
            o.includedHeaders = includedHeaders;
            return o;
        }
    }
}
