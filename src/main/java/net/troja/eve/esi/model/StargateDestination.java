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
 * destination object
 */
@ApiModel(description = "destination object")
public class StargateDestination implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("stargate_id")
    private Integer stargateId = null;

    @JsonProperty("system_id")
    private Integer systemId = null;

    public StargateDestination stargateId(Integer stargateId) {
        this.stargateId = stargateId;
        return this;
    }

    /**
     * The stargate this stargate connects to
     * 
     * @return stargateId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The stargate this stargate connects to")
    public Integer getStargateId() {
        return stargateId;
    }

    public void setStargateId(Integer stargateId) {
        this.stargateId = stargateId;
    }

    public StargateDestination systemId(Integer systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * The solar system this stargate connects to
     * 
     * @return systemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The solar system this stargate connects to")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StargateDestination stargateDestination = (StargateDestination) o;
        return Objects.equals(this.stargateId, stargateDestination.stargateId)
                && Objects.equals(this.systemId, stargateDestination.systemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stargateId, systemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StargateDestination {\n");

        sb.append("    stargateId: ").append(toIndentedString(stargateId)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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