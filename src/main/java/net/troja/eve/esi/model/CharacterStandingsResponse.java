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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterStandingsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("from_id")
    private Integer fromId = null;

    /**
     * from_type string
     */
    public enum FromTypeEnum {
        AGENT("agent"),

        NPC_CORP("npc_corp"),

        FACTION("faction");

        private String value;

        FromTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FromTypeEnum fromValue(String text) {
            for (FromTypeEnum b : FromTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("from_type")
    private FromTypeEnum fromType = null;

    @JsonProperty("standing")
    private Float standing = null;

    public CharacterStandingsResponse fromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    /**
     * from_id integer
     * 
     * @return fromId
     **/
    @ApiModelProperty(example = "null", required = true, value = "from_id integer")
    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public CharacterStandingsResponse fromType(FromTypeEnum fromType) {
        this.fromType = fromType;
        return this;
    }

    /**
     * from_type string
     * 
     * @return fromType
     **/
    @ApiModelProperty(example = "null", required = true, value = "from_type string")
    public FromTypeEnum getFromType() {
        return fromType;
    }

    public void setFromType(FromTypeEnum fromType) {
        this.fromType = fromType;
    }

    public CharacterStandingsResponse standing(Float standing) {
        this.standing = standing;
        return this;
    }

    /**
     * standing number minimum: -10 maximum: 10
     * 
     * @return standing
     **/
    @ApiModelProperty(example = "null", required = true, value = "standing number")
    public Float getStanding() {
        return standing;
    }

    public void setStanding(Float standing) {
        this.standing = standing;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStandingsResponse characterStandingsResponse = (CharacterStandingsResponse) o;
        return Objects.equals(this.fromId, characterStandingsResponse.fromId)
                && Objects.equals(this.fromType, characterStandingsResponse.fromType)
                && Objects.equals(this.standing, characterStandingsResponse.standing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromId, fromType, standing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStandingsResponse {\n");

        sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
        sb.append("    fromType: ").append(toIndentedString(fromType)).append("\n");
        sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
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
