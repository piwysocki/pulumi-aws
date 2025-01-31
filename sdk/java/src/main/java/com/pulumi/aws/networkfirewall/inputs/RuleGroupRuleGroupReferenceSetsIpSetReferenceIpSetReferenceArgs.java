// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs Empty = new RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs();

    /**
     * Set of Managed Prefix IP ARN(s)
     * 
     */
    @Import(name="referenceArn", required=true)
    private Output<String> referenceArn;

    /**
     * @return Set of Managed Prefix IP ARN(s)
     * 
     */
    public Output<String> referenceArn() {
        return this.referenceArn;
    }

    private RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs() {}

    private RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs(RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs $) {
        this.referenceArn = $.referenceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs();
        }

        public Builder(RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs defaults) {
            $ = new RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param referenceArn Set of Managed Prefix IP ARN(s)
         * 
         * @return builder
         * 
         */
        public Builder referenceArn(Output<String> referenceArn) {
            $.referenceArn = referenceArn;
            return this;
        }

        /**
         * @param referenceArn Set of Managed Prefix IP ARN(s)
         * 
         * @return builder
         * 
         */
        public Builder referenceArn(String referenceArn) {
            return referenceArn(Output.of(referenceArn));
        }

        public RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs build() {
            $.referenceArn = Objects.requireNonNull($.referenceArn, "expected parameter 'referenceArn' to be non-null");
            return $;
        }
    }

}
