// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs Empty = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs>> statements;

    /**
     * @return The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs>> statements() {
        return this.statements;
    }

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs() {}

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs();
        }

        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs defaults) {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
