// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelInputAttachmentInputSettingsAudioSelectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Channel.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("selectorSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsArgs>? SelectorSettings { get; set; }

        public ChannelInputAttachmentInputSettingsAudioSelectorArgs()
        {
        }
        public static new ChannelInputAttachmentInputSettingsAudioSelectorArgs Empty => new ChannelInputAttachmentInputSettingsAudioSelectorArgs();
    }
}
