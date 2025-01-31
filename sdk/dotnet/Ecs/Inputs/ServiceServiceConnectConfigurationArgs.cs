// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecs.Inputs
{

    public sealed class ServiceServiceConnectConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to use Service Connect with this service.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The log configuration for the container. See below.
        /// </summary>
        [Input("logConfiguration")]
        public Input<Inputs.ServiceServiceConnectConfigurationLogConfigurationArgs>? LogConfiguration { get; set; }

        /// <summary>
        /// The namespace name or ARN of the `aws.servicediscovery.HttpNamespace` for use with Service Connect.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The list of Service Connect service objects. See below.
        /// </summary>
        [Input("service")]
        public Input<Inputs.ServiceServiceConnectConfigurationServiceArgs>? Service { get; set; }

        public ServiceServiceConnectConfigurationArgs()
        {
        }
        public static new ServiceServiceConnectConfigurationArgs Empty => new ServiceServiceConnectConfigurationArgs();
    }
}
