// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs();

    /**
     * Statements to combine with `OR` logic. You can use any statements that can be nested. See `statement` above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs>> statements;

    /**
     * @return Statements to combine with `OR` logic. You can use any statements that can be nested. See `statement` above for details.
     * 
     */
    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements Statements to combine with `OR` logic. You can use any statements that can be nested. See `statement` above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements Statements to combine with `OR` logic. You can use any statements that can be nested. See `statement` above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements Statements to combine with `OR` logic. You can use any statements that can be nested. See `statement` above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
