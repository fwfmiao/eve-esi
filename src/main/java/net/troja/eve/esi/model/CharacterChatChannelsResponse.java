/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.ChatChannelsAllowed;
import net.troja.eve.esi.model.ChatChannelsBlocked;
import net.troja.eve.esi.model.ChatChannelsMuted;
import net.troja.eve.esi.model.ChatChannelsOperator;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterChatChannelsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("allowed")
    private List<ChatChannelsAllowed> allowed = new ArrayList<ChatChannelsAllowed>();

    @JsonProperty("blocked")
    private List<ChatChannelsBlocked> blocked = new ArrayList<ChatChannelsBlocked>();

    @JsonProperty("channel_id")
    private Integer channelId = null;

    @JsonProperty("comparison_key")
    private String comparisonKey = null;

    @JsonProperty("has_password")
    private Boolean hasPassword = null;

    @JsonProperty("motd")
    private String motd = null;

    @JsonProperty("muted")
    private List<ChatChannelsMuted> muted = new ArrayList<ChatChannelsMuted>();

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("operators")
    private List<ChatChannelsOperator> operators = new ArrayList<ChatChannelsOperator>();

    @JsonProperty("owner_id")
    private Integer ownerId = null;

    public CharacterChatChannelsResponse allowed(List<ChatChannelsAllowed> allowed) {
        this.allowed = allowed;
        return this;
    }

    public CharacterChatChannelsResponse addAllowedItem(ChatChannelsAllowed allowedItem) {
        this.allowed.add(allowedItem);
        return this;
    }

    /**
     * allowed array
     * 
     * @return allowed
     **/
    @ApiModelProperty(example = "null", required = true, value = "allowed array")
    public List<ChatChannelsAllowed> getAllowed() {
        return allowed;
    }

    public void setAllowed(List<ChatChannelsAllowed> allowed) {
        this.allowed = allowed;
    }

    public CharacterChatChannelsResponse blocked(List<ChatChannelsBlocked> blocked) {
        this.blocked = blocked;
        return this;
    }

    public CharacterChatChannelsResponse addBlockedItem(ChatChannelsBlocked blockedItem) {
        this.blocked.add(blockedItem);
        return this;
    }

    /**
     * blocked array
     * 
     * @return blocked
     **/
    @ApiModelProperty(example = "null", required = true, value = "blocked array")
    public List<ChatChannelsBlocked> getBlocked() {
        return blocked;
    }

    public void setBlocked(List<ChatChannelsBlocked> blocked) {
        this.blocked = blocked;
    }

    public CharacterChatChannelsResponse channelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Unique channel ID. Always negative for player-created channels. Permanent
     * (CCP created) channels have a positive ID, but don't appear in the API
     * 
     * @return channelId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique channel ID. Always negative for player-created channels. Permanent (CCP created) channels have a positive ID, but don't appear in the API")
    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public CharacterChatChannelsResponse comparisonKey(String comparisonKey) {
        this.comparisonKey = comparisonKey;
        return this;
    }

    /**
     * Normalized, unique string used to compare channel names
     * 
     * @return comparisonKey
     **/
    @ApiModelProperty(example = "null", required = true, value = "Normalized, unique string used to compare channel names")
    public String getComparisonKey() {
        return comparisonKey;
    }

    public void setComparisonKey(String comparisonKey) {
        this.comparisonKey = comparisonKey;
    }

    public CharacterChatChannelsResponse hasPassword(Boolean hasPassword) {
        this.hasPassword = hasPassword;
        return this;
    }

    /**
     * Whether this is a password protected channel
     * 
     * @return hasPassword
     **/
    @ApiModelProperty(example = "null", required = true, value = "Whether this is a password protected channel")
    public Boolean getHasPassword() {
        return hasPassword;
    }

    public void setHasPassword(Boolean hasPassword) {
        this.hasPassword = hasPassword;
    }

    public CharacterChatChannelsResponse motd(String motd) {
        this.motd = motd;
        return this;
    }

    /**
     * Message of the day for this channel
     * 
     * @return motd
     **/
    @ApiModelProperty(example = "null", required = true, value = "Message of the day for this channel")
    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public CharacterChatChannelsResponse muted(List<ChatChannelsMuted> muted) {
        this.muted = muted;
        return this;
    }

    public CharacterChatChannelsResponse addMutedItem(ChatChannelsMuted mutedItem) {
        this.muted.add(mutedItem);
        return this;
    }

    /**
     * muted array
     * 
     * @return muted
     **/
    @ApiModelProperty(example = "null", required = true, value = "muted array")
    public List<ChatChannelsMuted> getMuted() {
        return muted;
    }

    public void setMuted(List<ChatChannelsMuted> muted) {
        this.muted = muted;
    }

    public CharacterChatChannelsResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Displayed name of channel
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", required = true, value = "Displayed name of channel")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterChatChannelsResponse operators(List<ChatChannelsOperator> operators) {
        this.operators = operators;
        return this;
    }

    public CharacterChatChannelsResponse addOperatorsItem(ChatChannelsOperator operatorsItem) {
        this.operators.add(operatorsItem);
        return this;
    }

    /**
     * operators array
     * 
     * @return operators
     **/
    @ApiModelProperty(example = "null", required = true, value = "operators array")
    public List<ChatChannelsOperator> getOperators() {
        return operators;
    }

    public void setOperators(List<ChatChannelsOperator> operators) {
        this.operators = operators;
    }

    public CharacterChatChannelsResponse ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * owner_id integer
     * 
     * @return ownerId
     **/
    @ApiModelProperty(example = "null", required = true, value = "owner_id integer")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterChatChannelsResponse characterChatChannelsResponse = (CharacterChatChannelsResponse) o;
        return Objects.equals(this.allowed, characterChatChannelsResponse.allowed)
                && Objects.equals(this.blocked, characterChatChannelsResponse.blocked)
                && Objects.equals(this.channelId, characterChatChannelsResponse.channelId)
                && Objects.equals(this.comparisonKey, characterChatChannelsResponse.comparisonKey)
                && Objects.equals(this.hasPassword, characterChatChannelsResponse.hasPassword)
                && Objects.equals(this.motd, characterChatChannelsResponse.motd)
                && Objects.equals(this.muted, characterChatChannelsResponse.muted)
                && Objects.equals(this.name, characterChatChannelsResponse.name)
                && Objects.equals(this.operators, characterChatChannelsResponse.operators)
                && Objects.equals(this.ownerId, characterChatChannelsResponse.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowed, blocked, channelId, comparisonKey, hasPassword, motd, muted, name, operators,
                ownerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterChatChannelsResponse {\n");

        sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
        sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    comparisonKey: ").append(toIndentedString(comparisonKey)).append("\n");
        sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
        sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
        sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
