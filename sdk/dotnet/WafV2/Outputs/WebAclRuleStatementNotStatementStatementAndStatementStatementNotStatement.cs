// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatement
    {
        /// <summary>
        /// Statement to negate. You can use any statement that can be nested. See `statement` above for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatement> Statements;

        [OutputConstructor]
        private WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatement(ImmutableArray<Outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatement> statements)
        {
            Statements = statements;
        }
    }
}
