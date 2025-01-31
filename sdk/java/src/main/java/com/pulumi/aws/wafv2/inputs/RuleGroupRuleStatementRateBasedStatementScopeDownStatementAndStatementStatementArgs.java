// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs Empty = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementArgs> byteMatchStatement;

    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * 
     */
    @Import(name="regexMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs> regexMatchStatement;

    /**
     * @return A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs>> regexMatchStatement() {
        return Optional.ofNullable(this.regexMatchStatement);
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementArgs> xssMatchStatement;

    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs() {}

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs $) {
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.regexMatchStatement = $.regexMatchStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs();
        }

        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs defaults) {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        /**
         * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        /**
         * @param geoMatchStatement A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        /**
         * @param geoMatchStatement A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        /**
         * @param ipSetReferenceStatement A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        /**
         * @param ipSetReferenceStatement A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        /**
         * @param labelMatchStatement A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        /**
         * @param labelMatchStatement A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        /**
         * @param regexMatchStatement A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexMatchStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs> regexMatchStatement) {
            $.regexMatchStatement = regexMatchStatement;
            return this;
        }

        /**
         * @param regexMatchStatement A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexMatchStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs regexMatchStatement) {
            return regexMatchStatement(Output.of(regexMatchStatement));
        }

        /**
         * @param regexPatternSetReferenceStatement A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * @param regexPatternSetReferenceStatement A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        /**
         * @param sizeConstraintStatement A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        /**
         * @param sizeConstraintStatement A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        /**
         * @param xssMatchStatement A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        /**
         * @param xssMatchStatement A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementArgs build() {
            return $;
        }
    }

}
