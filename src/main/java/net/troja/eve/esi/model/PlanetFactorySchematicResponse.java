/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.2.dev3
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
public class PlanetFactorySchematicResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("cycle_time")
    private Integer cycleTime = null;

    @JsonProperty("schematic_name")
    private String schematicName = null;

    public PlanetFactorySchematicResponse cycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }

    /**
     * Time in seconds to process a run
     * 
     * @return cycleTime
     **/
    @ApiModelProperty(example = "null", required = true, value = "Time in seconds to process a run")
    public Integer getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
    }

    public PlanetFactorySchematicResponse schematicName(String schematicName) {
        this.schematicName = schematicName;
        return this;
    }

    /**
     * schematic_name string
     * 
     * @return schematicName
     **/
    @ApiModelProperty(example = "null", required = true, value = "schematic_name string")
    public String getSchematicName() {
        return schematicName;
    }

    public void setSchematicName(String schematicName) {
        this.schematicName = schematicName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetFactorySchematicResponse planetFactorySchematicResponse = (PlanetFactorySchematicResponse) o;
        return Objects.equals(this.cycleTime, planetFactorySchematicResponse.cycleTime)
                && Objects.equals(this.schematicName, planetFactorySchematicResponse.schematicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycleTime, schematicName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetFactorySchematicResponse {\n");

        sb.append("    cycleTime: ").append(toIndentedString(cycleTime)).append("\n");
        sb.append("    schematicName: ").append(toIndentedString(schematicName)).append("\n");
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