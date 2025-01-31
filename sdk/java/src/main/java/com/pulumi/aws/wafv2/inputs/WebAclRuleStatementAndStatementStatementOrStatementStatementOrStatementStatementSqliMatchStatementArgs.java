// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs();

    /**
     * Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    /**
     * @return Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See `text_transformation` below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See `text_transformation` below for details.
     * 
     */
    public Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See `text_transformation` below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See `text_transformation` below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See `text_transformation` below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
