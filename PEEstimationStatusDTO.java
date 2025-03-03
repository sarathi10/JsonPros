package de.dlh.cobra.pele.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
public class PEEstimationStatusDTO implements Serializable {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8176080496450019911L;

    /** The airline code. */
    @JsonIgnore
    private String airlineCode;

    /** The bcc. */
    @JsonInclude(Include.NON_EMPTY)
    private String bcc;

    /** The bcc name. */
    private String bccName;

    /** The bdaf measure 1 abs. */
    @JsonInclude(Include.NON_EMPTY)
    private Float bdafMeasure1Abs;

    /** The bdaf masure 1 perc. */
    @JsonInclude(Include.NON_EMPTY)
    private Float bdafMeasure1Perc;

    /** The bdaf measure status. */
    @JsonInclude(Include.NON_EMPTY)
    private String bdafMeasureStatus;

    /** The bdafs excluded. */
    @JsonInclude(Include.NON_EMPTY)
    private Boolean bdafsExcluded;

    /** The current estimation date. */
    private String currentEstimationDate;

    /** The dep time. */
    private String depTime;

    /** The dow id. */
    private Integer dowId;

    /** The estimation result. */
    @JsonInclude(Include.NON_EMPTY)
    private String estimationResult;

    /** The id. */
    private String id;

    /** The ioi. */
    private String ioi;

    /** The last used date. */
    @JsonInclude(Include.NON_EMPTY)
    private String lastUsedDate;

    /** The next estimation date. */
    private String nextEstimationDate;

    /** The orig dest. */
    private String origDest;

    /** The orig dest VV. */
    private String origDestVV;

    /** The pe data needed. */
    private Boolean peDataNeeded;

    /** The pe estimation valid. */
    @JsonInclude(Include.NON_EMPTY)
    private Boolean peEstimationValid;

    /** The last pe data available. */
    private Boolean lastPeDataAvailable;

    /** The statistical quality. */
    @JsonInclude(Include.NON_EMPTY)
    private String statisticalQuality;

    /** The bdaf measure 2. */
    @JsonInclude(Include.NON_EMPTY)
    private Integer bdafMeasure2;

    /** The orig. */
    @JsonIgnore
    private String orig;

    /** The dest. */
    @JsonIgnore
    private String dest;

    /** Validity Status. */
    private String validityStatus;

    /** The remark. */
    @JsonInclude(Include.NON_EMPTY)
    private String remark = StringUtils.EMPTY;

    /** The sponsoring ID. */
    @JsonIgnore
    private Integer sponsoringId;

    /** The sponsoring origin. */
    @JsonIgnore
    private String sponsorSourceOrigin;

    /** The sponsoring destination. */
    @JsonIgnore
    private String sponsorSourceDestination;

    @JsonIgnore
    /** The is sponsoring check. */
    private Boolean sponsoringInd = false;

    /** The compartment */
    private String compCode;

    /** The similarity_score */
    private int score;

    /**
     * Constructor.
     */
    public PEEstimationStatusDTO() {
        super();
    }

    @Override
    public String toString() {
        return "PEValidityStatusDTO [airlineCode=" + airlineCode + ", bcc=" + bcc + ", bccName=" + bccName
                + ", bdafMeasure1Abs=" + bdafMeasure1Abs + ", bdafMeasure1Perc=" + bdafMeasure1Perc
                + ", bdafMeasureStatus=" + bdafMeasureStatus + ", bdafsExcluded=" + bdafsExcluded
                + ", currentEstimationDate=" + currentEstimationDate + ", depTime=" + depTime + ", dowId=" + dowId
                + ", estimationResult=" + estimationResult + ", id=" + id + ", ioi=" + ioi + ", lastUsedDate="
                + lastUsedDate + ", nextEstimationDate=" + nextEstimationDate + ", origDest=" + origDest
                + ", origDestVV=" + origDestVV + ", peDataNeeded=" + peDataNeeded + ", peEstimationValid="
                + peEstimationValid + ", lastPeDataAvailable=" + lastPeDataAvailable + ", statisticalQuality="
                + statisticalQuality + ", bdafMeasure2=" + bdafMeasure2 + ", orig=" + orig + ", dest=" + dest
                + ", validityStatus=" + validityStatus + ", remark=" + remark + ", sponsoringId=" + sponsoringId
                + ", sponsorSourceOrigin=" + sponsorSourceOrigin + ", sponsorSourceDestination="
                + sponsorSourceDestination + ", sponsoringInd=" + sponsoringInd + ", compCode=" + compCode + ", score="
                + score + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PEEstimationStatusDTO other = (PEEstimationStatusDTO) obj;
        return Objects.equals(airlineCode, other.airlineCode) && Objects.equals(bcc, other.bcc)
                && Objects.equals(bccName, other.bccName) && Objects.equals(bdafMeasure1Abs, other.bdafMeasure1Abs)
                && Objects.equals(bdafMeasure1Perc, other.bdafMeasure1Perc)
                && Objects.equals(bdafMeasure2, other.bdafMeasure2)
                && Objects.equals(bdafMeasureStatus, other.bdafMeasureStatus)
                && Objects.equals(bdafsExcluded, other.bdafsExcluded) && Objects.equals(compCode, other.compCode)
                && Objects.equals(currentEstimationDate, other.currentEstimationDate)
                && Objects.equals(depTime, other.depTime) && Objects.equals(dest, other.dest)
                && Objects.equals(dowId, other.dowId) && Objects.equals(estimationResult, other.estimationResult)
                && Objects.equals(id, other.id) && Objects.equals(ioi, other.ioi)
                && Objects.equals(lastPeDataAvailable, other.lastPeDataAvailable)
                && Objects.equals(lastUsedDate, other.lastUsedDate)
                && Objects.equals(nextEstimationDate, other.nextEstimationDate) && Objects.equals(orig, other.orig)
                && Objects.equals(origDest, other.origDest) && Objects.equals(origDestVV, other.origDestVV)
                && Objects.equals(peDataNeeded, other.peDataNeeded)
                && Objects.equals(peEstimationValid, other.peEstimationValid) && Objects.equals(remark, other.remark)
                && Objects.equals(score, other.score)
                && Objects.equals(sponsorSourceDestination, other.sponsorSourceDestination)
                && Objects.equals(sponsorSourceOrigin, other.sponsorSourceOrigin)
                && Objects.equals(sponsoringId, other.sponsoringId)
                && Objects.equals(sponsoringInd, other.sponsoringInd)
                && Objects.equals(statisticalQuality, other.statisticalQuality)
                && Objects.equals(validityStatus, other.validityStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineCode, bcc, bccName, bdafMeasure1Abs, bdafMeasure1Perc, bdafMeasure2,
                bdafMeasureStatus, bdafsExcluded, compCode, currentEstimationDate, depTime, dest, dowId,
                estimationResult, id, ioi, lastPeDataAvailable, lastUsedDate, nextEstimationDate, orig, origDest,
                origDestVV, peDataNeeded, peEstimationValid, remark, score, sponsorSourceDestination,
                sponsorSourceOrigin, sponsoringId, sponsoringInd, statisticalQuality, validityStatus);
    }
}
