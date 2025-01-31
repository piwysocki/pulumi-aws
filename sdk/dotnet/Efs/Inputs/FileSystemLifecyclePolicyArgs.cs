// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Efs.Inputs
{

    public sealed class FileSystemLifecyclePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_1_DAY`, `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
        /// </summary>
        [Input("transitionToIa")]
        public Input<string>? TransitionToIa { get; set; }

        /// <summary>
        /// Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
        /// </summary>
        [Input("transitionToPrimaryStorageClass")]
        public Input<string>? TransitionToPrimaryStorageClass { get; set; }

        public FileSystemLifecyclePolicyArgs()
        {
        }
        public static new FileSystemLifecyclePolicyArgs Empty => new FileSystemLifecyclePolicyArgs();
    }
}
