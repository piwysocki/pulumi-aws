// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DirectConnect.Outputs
{

    [OutputType]
    public sealed class GetRouterConfigurationRouterResult
    {
        /// <summary>
        /// Router platform
        /// </summary>
        public readonly string Platform;
        /// <summary>
        /// ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
        /// </summary>
        public readonly string RouterTypeIdentifier;
        /// <summary>
        /// Router operating system
        /// </summary>
        public readonly string Software;
        /// <summary>
        /// Router vendor
        /// </summary>
        public readonly string Vendor;
        /// <summary>
        /// Router XSLT Template Name
        /// </summary>
        public readonly string XsltTemplateName;
        public readonly string XsltTemplateNameForMacSec;

        [OutputConstructor]
        private GetRouterConfigurationRouterResult(
            string platform,

            string routerTypeIdentifier,

            string software,

            string vendor,

            string xsltTemplateName,

            string xsltTemplateNameForMacSec)
        {
            Platform = platform;
            RouterTypeIdentifier = routerTypeIdentifier;
            Software = software;
            Vendor = vendor;
            XsltTemplateName = xsltTemplateName;
            XsltTemplateNameForMacSec = xsltTemplateNameForMacSec;
        }
    }
}
