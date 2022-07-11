
package cat.hack3.mangrana.radarr.api.schema;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "audioBitrate",
    "audioChannels",
    "audioCodec",
    "audioLanguages",
    "audioStreamCount",
    "videoBitDepth",
    "videoBitrate",
    "videoCodec",
    "videoDynamicRangeType",
    "videoFps",
    "resolution",
    "runTime",
    "scanType",
    "subtitles"
})
@Generated("jsonschema2pojo")
public class MediaInfo {

    @JsonProperty("audioBitrate")
    private Integer audioBitrate;
    @JsonProperty("audioChannels")
    private Double audioChannels;
    @JsonProperty("audioCodec")
    private String audioCodec;
    @JsonProperty("audioLanguages")
    private String audioLanguages;
    @JsonProperty("audioStreamCount")
    private Integer audioStreamCount;
    @JsonProperty("videoBitDepth")
    private Integer videoBitDepth;
    @JsonProperty("videoBitrate")
    private Integer videoBitrate;
    @JsonProperty("videoCodec")
    private String videoCodec;
    @JsonProperty("videoDynamicRangeType")
    private String videoDynamicRangeType;
    @JsonProperty("videoFps")
    private Double videoFps;
    @JsonProperty("resolution")
    private String resolution;
    @JsonProperty("runTime")
    private String runTime;
    @JsonProperty("scanType")
    private String scanType;
    @JsonProperty("subtitles")
    private String subtitles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("audioBitrate")
    public Integer getAudioBitrate() {
        return audioBitrate;
    }

    @JsonProperty("audioBitrate")
    public void setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
    }

    public MediaInfo withAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }

    @JsonProperty("audioChannels")
    public Double getAudioChannels() {
        return audioChannels;
    }

    @JsonProperty("audioChannels")
    public void setAudioChannels(Double audioChannels) {
        this.audioChannels = audioChannels;
    }

    public MediaInfo withAudioChannels(Double audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }

    @JsonProperty("audioCodec")
    public String getAudioCodec() {
        return audioCodec;
    }

    @JsonProperty("audioCodec")
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    public MediaInfo withAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    @JsonProperty("audioLanguages")
    public String getAudioLanguages() {
        return audioLanguages;
    }

    @JsonProperty("audioLanguages")
    public void setAudioLanguages(String audioLanguages) {
        this.audioLanguages = audioLanguages;
    }

    public MediaInfo withAudioLanguages(String audioLanguages) {
        this.audioLanguages = audioLanguages;
        return this;
    }

    @JsonProperty("audioStreamCount")
    public Integer getAudioStreamCount() {
        return audioStreamCount;
    }

    @JsonProperty("audioStreamCount")
    public void setAudioStreamCount(Integer audioStreamCount) {
        this.audioStreamCount = audioStreamCount;
    }

    public MediaInfo withAudioStreamCount(Integer audioStreamCount) {
        this.audioStreamCount = audioStreamCount;
        return this;
    }

    @JsonProperty("videoBitDepth")
    public Integer getVideoBitDepth() {
        return videoBitDepth;
    }

    @JsonProperty("videoBitDepth")
    public void setVideoBitDepth(Integer videoBitDepth) {
        this.videoBitDepth = videoBitDepth;
    }

    public MediaInfo withVideoBitDepth(Integer videoBitDepth) {
        this.videoBitDepth = videoBitDepth;
        return this;
    }

    @JsonProperty("videoBitrate")
    public Integer getVideoBitrate() {
        return videoBitrate;
    }

    @JsonProperty("videoBitrate")
    public void setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
    }

    public MediaInfo withVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }

    @JsonProperty("videoCodec")
    public String getVideoCodec() {
        return videoCodec;
    }

    @JsonProperty("videoCodec")
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public MediaInfo withVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    @JsonProperty("videoDynamicRangeType")
    public String getVideoDynamicRangeType() {
        return videoDynamicRangeType;
    }

    @JsonProperty("videoDynamicRangeType")
    public void setVideoDynamicRangeType(String videoDynamicRangeType) {
        this.videoDynamicRangeType = videoDynamicRangeType;
    }

    public MediaInfo withVideoDynamicRangeType(String videoDynamicRangeType) {
        this.videoDynamicRangeType = videoDynamicRangeType;
        return this;
    }

    @JsonProperty("videoFps")
    public Double getVideoFps() {
        return videoFps;
    }

    @JsonProperty("videoFps")
    public void setVideoFps(Double videoFps) {
        this.videoFps = videoFps;
    }

    public MediaInfo withVideoFps(Double videoFps) {
        this.videoFps = videoFps;
        return this;
    }

    @JsonProperty("resolution")
    public String getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public MediaInfo withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    @JsonProperty("runTime")
    public String getRunTime() {
        return runTime;
    }

    @JsonProperty("runTime")
    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public MediaInfo withRunTime(String runTime) {
        this.runTime = runTime;
        return this;
    }

    @JsonProperty("scanType")
    public String getScanType() {
        return scanType;
    }

    @JsonProperty("scanType")
    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public MediaInfo withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    @JsonProperty("subtitles")
    public String getSubtitles() {
        return subtitles;
    }

    @JsonProperty("subtitles")
    public void setSubtitles(String subtitles) {
        this.subtitles = subtitles;
    }

    public MediaInfo withSubtitles(String subtitles) {
        this.subtitles = subtitles;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public MediaInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MediaInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("audioBitrate");
        sb.append('=');
        sb.append(((this.audioBitrate == null)?"<null>":this.audioBitrate));
        sb.append(',');
        sb.append("audioChannels");
        sb.append('=');
        sb.append(((this.audioChannels == null)?"<null>":this.audioChannels));
        sb.append(',');
        sb.append("audioCodec");
        sb.append('=');
        sb.append(((this.audioCodec == null)?"<null>":this.audioCodec));
        sb.append(',');
        sb.append("audioLanguages");
        sb.append('=');
        sb.append(((this.audioLanguages == null)?"<null>":this.audioLanguages));
        sb.append(',');
        sb.append("audioStreamCount");
        sb.append('=');
        sb.append(((this.audioStreamCount == null)?"<null>":this.audioStreamCount));
        sb.append(',');
        sb.append("videoBitDepth");
        sb.append('=');
        sb.append(((this.videoBitDepth == null)?"<null>":this.videoBitDepth));
        sb.append(',');
        sb.append("videoBitrate");
        sb.append('=');
        sb.append(((this.videoBitrate == null)?"<null>":this.videoBitrate));
        sb.append(',');
        sb.append("videoCodec");
        sb.append('=');
        sb.append(((this.videoCodec == null)?"<null>":this.videoCodec));
        sb.append(',');
        sb.append("videoDynamicRangeType");
        sb.append('=');
        sb.append(((this.videoDynamicRangeType == null)?"<null>":this.videoDynamicRangeType));
        sb.append(',');
        sb.append("videoFps");
        sb.append('=');
        sb.append(((this.videoFps == null)?"<null>":this.videoFps));
        sb.append(',');
        sb.append("resolution");
        sb.append('=');
        sb.append(((this.resolution == null)?"<null>":this.resolution));
        sb.append(',');
        sb.append("runTime");
        sb.append('=');
        sb.append(((this.runTime == null)?"<null>":this.runTime));
        sb.append(',');
        sb.append("scanType");
        sb.append('=');
        sb.append(((this.scanType == null)?"<null>":this.scanType));
        sb.append(',');
        sb.append("subtitles");
        sb.append('=');
        sb.append(((this.subtitles == null)?"<null>":this.subtitles));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.subtitles == null)? 0 :this.subtitles.hashCode()));
        result = ((result* 31)+((this.audioLanguages == null)? 0 :this.audioLanguages.hashCode()));
        result = ((result* 31)+((this.videoBitDepth == null)? 0 :this.videoBitDepth.hashCode()));
        result = ((result* 31)+((this.audioStreamCount == null)? 0 :this.audioStreamCount.hashCode()));
        result = ((result* 31)+((this.audioCodec == null)? 0 :this.audioCodec.hashCode()));
        result = ((result* 31)+((this.resolution == null)? 0 :this.resolution.hashCode()));
        result = ((result* 31)+((this.audioBitrate == null)? 0 :this.audioBitrate.hashCode()));
        result = ((result* 31)+((this.videoFps == null)? 0 :this.videoFps.hashCode()));
        result = ((result* 31)+((this.videoBitrate == null)? 0 :this.videoBitrate.hashCode()));
        result = ((result* 31)+((this.audioChannels == null)? 0 :this.audioChannels.hashCode()));
        result = ((result* 31)+((this.videoDynamicRangeType == null)? 0 :this.videoDynamicRangeType.hashCode()));
        result = ((result* 31)+((this.runTime == null)? 0 :this.runTime.hashCode()));
        result = ((result* 31)+((this.scanType == null)? 0 :this.scanType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.videoCodec == null)? 0 :this.videoCodec.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MediaInfo) == false) {
            return false;
        }
        MediaInfo rhs = ((MediaInfo) other);
        return ((((((((((((((((this.subtitles == rhs.subtitles)||((this.subtitles!= null)&&this.subtitles.equals(rhs.subtitles)))&&((this.audioLanguages == rhs.audioLanguages)||((this.audioLanguages!= null)&&this.audioLanguages.equals(rhs.audioLanguages))))&&((this.videoBitDepth == rhs.videoBitDepth)||((this.videoBitDepth!= null)&&this.videoBitDepth.equals(rhs.videoBitDepth))))&&((this.audioStreamCount == rhs.audioStreamCount)||((this.audioStreamCount!= null)&&this.audioStreamCount.equals(rhs.audioStreamCount))))&&((this.audioCodec == rhs.audioCodec)||((this.audioCodec!= null)&&this.audioCodec.equals(rhs.audioCodec))))&&((this.resolution == rhs.resolution)||((this.resolution!= null)&&this.resolution.equals(rhs.resolution))))&&((this.audioBitrate == rhs.audioBitrate)||((this.audioBitrate!= null)&&this.audioBitrate.equals(rhs.audioBitrate))))&&((this.videoFps == rhs.videoFps)||((this.videoFps!= null)&&this.videoFps.equals(rhs.videoFps))))&&((this.videoBitrate == rhs.videoBitrate)||((this.videoBitrate!= null)&&this.videoBitrate.equals(rhs.videoBitrate))))&&((this.audioChannels == rhs.audioChannels)||((this.audioChannels!= null)&&this.audioChannels.equals(rhs.audioChannels))))&&((this.videoDynamicRangeType == rhs.videoDynamicRangeType)||((this.videoDynamicRangeType!= null)&&this.videoDynamicRangeType.equals(rhs.videoDynamicRangeType))))&&((this.runTime == rhs.runTime)||((this.runTime!= null)&&this.runTime.equals(rhs.runTime))))&&((this.scanType == rhs.scanType)||((this.scanType!= null)&&this.scanType.equals(rhs.scanType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.videoCodec == rhs.videoCodec)||((this.videoCodec!= null)&&this.videoCodec.equals(rhs.videoCodec))));
    }

}
