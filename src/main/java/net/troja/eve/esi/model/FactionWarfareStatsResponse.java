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
import net.troja.eve.esi.model.FactionWarfareStatsKills;
import net.troja.eve.esi.model.FactionWarfareStatsVictoryPoints;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class FactionWarfareStatsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("faction_id")
    private Integer factionId = null;

    @JsonProperty("kills")
    private FactionWarfareStatsKills kills = null;

    @JsonProperty("pilots")
    private Integer pilots = null;

    @JsonProperty("systems_controlled")
    private Integer systemsControlled = null;

    @JsonProperty("victory_points")
    private FactionWarfareStatsVictoryPoints victoryPoints = null;

    public FactionWarfareStatsResponse factionId(Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * faction_id integer
     * 
     * @return factionId
     **/
    @ApiModelProperty(example = "null", required = true, value = "faction_id integer")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public FactionWarfareStatsResponse kills(FactionWarfareStatsKills kills) {
        this.kills = kills;
        return this;
    }

    /**
     * Get kills
     * 
     * @return kills
     **/
    @ApiModelProperty(example = "null", value = "")
    public FactionWarfareStatsKills getKills() {
        return kills;
    }

    public void setKills(FactionWarfareStatsKills kills) {
        this.kills = kills;
    }

    public FactionWarfareStatsResponse pilots(Integer pilots) {
        this.pilots = pilots;
        return this;
    }

    /**
     * How many pilots fight for the given faction
     * 
     * @return pilots
     **/
    @ApiModelProperty(example = "null", required = true, value = "How many pilots fight for the given faction")
    public Integer getPilots() {
        return pilots;
    }

    public void setPilots(Integer pilots) {
        this.pilots = pilots;
    }

    public FactionWarfareStatsResponse systemsControlled(Integer systemsControlled) {
        this.systemsControlled = systemsControlled;
        return this;
    }

    /**
     * The number of solar systems controlled by the given faction
     * 
     * @return systemsControlled
     **/
    @ApiModelProperty(example = "null", required = true, value = "The number of solar systems controlled by the given faction")
    public Integer getSystemsControlled() {
        return systemsControlled;
    }

    public void setSystemsControlled(Integer systemsControlled) {
        this.systemsControlled = systemsControlled;
    }

    public FactionWarfareStatsResponse victoryPoints(FactionWarfareStatsVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
        return this;
    }

    /**
     * Get victoryPoints
     * 
     * @return victoryPoints
     **/
    @ApiModelProperty(example = "null", value = "")
    public FactionWarfareStatsVictoryPoints getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(FactionWarfareStatsVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareStatsResponse factionWarfareStatsResponse = (FactionWarfareStatsResponse) o;
        return Objects.equals(this.factionId, factionWarfareStatsResponse.factionId)
                && Objects.equals(this.kills, factionWarfareStatsResponse.kills)
                && Objects.equals(this.pilots, factionWarfareStatsResponse.pilots)
                && Objects.equals(this.systemsControlled, factionWarfareStatsResponse.systemsControlled)
                && Objects.equals(this.victoryPoints, factionWarfareStatsResponse.victoryPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, kills, pilots, systemsControlled, victoryPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareStatsResponse {\n");

        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
        sb.append("    pilots: ").append(toIndentedString(pilots)).append("\n");
        sb.append("    systemsControlled: ").append(toIndentedString(systemsControlled)).append("\n");
        sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
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
