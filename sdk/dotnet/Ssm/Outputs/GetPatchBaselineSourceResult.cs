// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm.Outputs
{

    [OutputType]
    public sealed class GetPatchBaselineSourceResult
    {
        /// <summary>
        /// The value of the yum repo configuration.
        /// </summary>
        public readonly string Configuration;
        /// <summary>
        /// The name specified to identify the patch source.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The specific operating system versions a patch repository applies to.
        /// </summary>
        public readonly ImmutableArray<string> Products;

        [OutputConstructor]
        private GetPatchBaselineSourceResult(
            string configuration,

            string name,

            ImmutableArray<string> products)
        {
            Configuration = configuration;
            Name = name;
            Products = products;
        }
    }
}
