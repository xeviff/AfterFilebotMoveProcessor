
package cat.hack3.mangrana.radarr.api.schema;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "movieId",
    "relativePath",
    "path",
    "size",
    "dateAdded",
    "indexerFlags",
    "quality",
    "mediaInfo",
    "originalFilePath",
    "qualityCutoffNotMet",
    "languages",
    "releaseGroup",
    "edition",
    "id"
})
@Generated("jsonschema2pojo")
public class MovieFile {

    @JsonProperty("movieId")
    private Integer movieId;
    @JsonProperty("relativePath")
    private String relativePath;
    @JsonProperty("path")
    private String path;
    @JsonProperty("size")
    private Long size;
    @JsonProperty("dateAdded")
    private String dateAdded;
    @JsonProperty("indexerFlags")
    private Integer indexerFlags;
    @JsonProperty("quality")
    private Quality quality;
    @JsonProperty("mediaInfo")
    private MediaInfo mediaInfo;
    @JsonProperty("originalFilePath")
    private String originalFilePath;
    @JsonProperty("qualityCutoffNotMet")
    private Boolean qualityCutoffNotMet;
    @JsonProperty("languages")
    private List<Language__1> languages = new ArrayList<Language__1>();
    @JsonProperty("releaseGroup")
    private String releaseGroup;
    @JsonProperty("edition")
    private String edition;
    @JsonProperty("id")
    private Integer id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("movieId")
    public Integer getMovieId() {
        return movieId;
    }

    @JsonProperty("movieId")
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public MovieFile withMovieId(Integer movieId) {
        this.movieId = movieId;
        return this;
    }

    @JsonProperty("relativePath")
    public String getRelativePath() {
        return relativePath;
    }

    @JsonProperty("relativePath")
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public MovieFile withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public MovieFile withPath(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Long size) {
        this.size = size;
    }

    public MovieFile withSize(Long size) {
        this.size = size;
        return this;
    }

    @JsonProperty("dateAdded")
    public String getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public MovieFile withDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
        return this;
    }

    @JsonProperty("indexerFlags")
    public Integer getIndexerFlags() {
        return indexerFlags;
    }

    @JsonProperty("indexerFlags")
    public void setIndexerFlags(Integer indexerFlags) {
        this.indexerFlags = indexerFlags;
    }

    public MovieFile withIndexerFlags(Integer indexerFlags) {
        this.indexerFlags = indexerFlags;
        return this;
    }

    @JsonProperty("quality")
    public Quality getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public MovieFile withQuality(Quality quality) {
        this.quality = quality;
        return this;
    }

    @JsonProperty("mediaInfo")
    public MediaInfo getMediaInfo() {
        return mediaInfo;
    }

    @JsonProperty("mediaInfo")
    public void setMediaInfo(MediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
    }

    public MovieFile withMediaInfo(MediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
        return this;
    }

    @JsonProperty("originalFilePath")
    public String getOriginalFilePath() {
        return originalFilePath;
    }

    @JsonProperty("originalFilePath")
    public void setOriginalFilePath(String originalFilePath) {
        this.originalFilePath = originalFilePath;
    }

    public MovieFile withOriginalFilePath(String originalFilePath) {
        this.originalFilePath = originalFilePath;
        return this;
    }

    @JsonProperty("qualityCutoffNotMet")
    public Boolean getQualityCutoffNotMet() {
        return qualityCutoffNotMet;
    }

    @JsonProperty("qualityCutoffNotMet")
    public void setQualityCutoffNotMet(Boolean qualityCutoffNotMet) {
        this.qualityCutoffNotMet = qualityCutoffNotMet;
    }

    public MovieFile withQualityCutoffNotMet(Boolean qualityCutoffNotMet) {
        this.qualityCutoffNotMet = qualityCutoffNotMet;
        return this;
    }

    @JsonProperty("languages")
    public List<Language__1> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<Language__1> languages) {
        this.languages = languages;
    }

    public MovieFile withLanguages(List<Language__1> languages) {
        this.languages = languages;
        return this;
    }

    @JsonProperty("releaseGroup")
    public String getReleaseGroup() {
        return releaseGroup;
    }

    @JsonProperty("releaseGroup")
    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public MovieFile withReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
        return this;
    }

    @JsonProperty("edition")
    public String getEdition() {
        return edition;
    }

    @JsonProperty("edition")
    public void setEdition(String edition) {
        this.edition = edition;
    }

    public MovieFile withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public MovieFile withId(Integer id) {
        this.id = id;
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

    public MovieFile withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MovieFile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("movieId");
        sb.append('=');
        sb.append(((this.movieId == null)?"<null>":this.movieId));
        sb.append(',');
        sb.append("relativePath");
        sb.append('=');
        sb.append(((this.relativePath == null)?"<null>":this.relativePath));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("dateAdded");
        sb.append('=');
        sb.append(((this.dateAdded == null)?"<null>":this.dateAdded));
        sb.append(',');
        sb.append("indexerFlags");
        sb.append('=');
        sb.append(((this.indexerFlags == null)?"<null>":this.indexerFlags));
        sb.append(',');
        sb.append("quality");
        sb.append('=');
        sb.append(((this.quality == null)?"<null>":this.quality));
        sb.append(',');
        sb.append("mediaInfo");
        sb.append('=');
        sb.append(((this.mediaInfo == null)?"<null>":this.mediaInfo));
        sb.append(',');
        sb.append("originalFilePath");
        sb.append('=');
        sb.append(((this.originalFilePath == null)?"<null>":this.originalFilePath));
        sb.append(',');
        sb.append("qualityCutoffNotMet");
        sb.append('=');
        sb.append(((this.qualityCutoffNotMet == null)?"<null>":this.qualityCutoffNotMet));
        sb.append(',');
        sb.append("languages");
        sb.append('=');
        sb.append(((this.languages == null)?"<null>":this.languages));
        sb.append(',');
        sb.append("releaseGroup");
        sb.append('=');
        sb.append(((this.releaseGroup == null)?"<null>":this.releaseGroup));
        sb.append(',');
        sb.append("edition");
        sb.append('=');
        sb.append(((this.edition == null)?"<null>":this.edition));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.indexerFlags == null)? 0 :this.indexerFlags.hashCode()));
        result = ((result* 31)+((this.languages == null)? 0 :this.languages.hashCode()));
        result = ((result* 31)+((this.edition == null)? 0 :this.edition.hashCode()));
        result = ((result* 31)+((this.movieId == null)? 0 :this.movieId.hashCode()));
        result = ((result* 31)+((this.originalFilePath == null)? 0 :this.originalFilePath.hashCode()));
        result = ((result* 31)+((this.dateAdded == null)? 0 :this.dateAdded.hashCode()));
        result = ((result* 31)+((this.quality == null)? 0 :this.quality.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.relativePath == null)? 0 :this.relativePath.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mediaInfo == null)? 0 :this.mediaInfo.hashCode()));
        result = ((result* 31)+((this.qualityCutoffNotMet == null)? 0 :this.qualityCutoffNotMet.hashCode()));
        result = ((result* 31)+((this.releaseGroup == null)? 0 :this.releaseGroup.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MovieFile) == false) {
            return false;
        }
        MovieFile rhs = ((MovieFile) other);
        return ((((((((((((((((this.indexerFlags == rhs.indexerFlags)||((this.indexerFlags!= null)&&this.indexerFlags.equals(rhs.indexerFlags)))&&((this.languages == rhs.languages)||((this.languages!= null)&&this.languages.equals(rhs.languages))))&&((this.edition == rhs.edition)||((this.edition!= null)&&this.edition.equals(rhs.edition))))&&((this.movieId == rhs.movieId)||((this.movieId!= null)&&this.movieId.equals(rhs.movieId))))&&((this.originalFilePath == rhs.originalFilePath)||((this.originalFilePath!= null)&&this.originalFilePath.equals(rhs.originalFilePath))))&&((this.dateAdded == rhs.dateAdded)||((this.dateAdded!= null)&&this.dateAdded.equals(rhs.dateAdded))))&&((this.quality == rhs.quality)||((this.quality!= null)&&this.quality.equals(rhs.quality))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.relativePath == rhs.relativePath)||((this.relativePath!= null)&&this.relativePath.equals(rhs.relativePath))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mediaInfo == rhs.mediaInfo)||((this.mediaInfo!= null)&&this.mediaInfo.equals(rhs.mediaInfo))))&&((this.qualityCutoffNotMet == rhs.qualityCutoffNotMet)||((this.qualityCutoffNotMet!= null)&&this.qualityCutoffNotMet.equals(rhs.qualityCutoffNotMet))))&&((this.releaseGroup == rhs.releaseGroup)||((this.releaseGroup!= null)&&this.releaseGroup.equals(rhs.releaseGroup))));
    }

}
