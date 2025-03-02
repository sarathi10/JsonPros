package de.dlh.cobra.pele.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class MarketPartionDTO {
    private MarketPartition marketPartition;
    private List<Version> versions;
    private String dreftversionId;
    private String activeVersionId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MarketPartionDTO that = (MarketPartionDTO) o;
        return Objects.equals(marketPartition, that.marketPartition) && Objects.equals(versions, that.versions) && Objects.equals(dreftversionId, that.dreftversionId) && Objects.equals(activeVersionId, that.activeVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketPartition, versions, dreftversionId, activeVersionId);
    }

    @Override
    public String toString() {
        return "MarketPartionDTO{" +
                "marketPartition=" + marketPartition +
                ", versions=" + versions +
                ", dreftversionId='" + dreftversionId + '\'' +
                ", activeVersionId='" + activeVersionId + '\'' +
                '}';
    }

    @Getter
    @Setter
    class MarketPartition {
        private  String id;
        private String originIata;
        private String destinationIata;
        private String passengerDirection;
        private int dow;
        private String passengerSegment;
        private String compartment;

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            MarketPartition that = (MarketPartition) o;
            return dow == that.dow && Objects.equals(id, that.id) && Objects.equals(originIata, that.originIata)
                    && Objects.equals(destinationIata, that.destinationIata)
                    && Objects.equals(passengerDirection, that.passengerDirection)
                    && Objects.equals(passengerSegment, that.passengerSegment)
                    && Objects.equals(compartment, that.compartment);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, originIata, destinationIata, passengerDirection, dow, passengerSegment, compartment);
        }

        @Override
        public String toString() {
            return "MarketPartition{" +
                    "id='" + id + '\'' +
                    ", originIata='" + originIata + '\'' +
                    ", destinationIata='" + destinationIata + '\'' +
                    ", passengerDirection='" + passengerDirection + '\'' +
                    ", dow=" + dow +
                    ", passengerSegment='" + passengerSegment + '\'' +
                    ", compartment='" + compartment + '\'' +
                    '}';
        }
    }

    @Getter
    @Setter
    class Version {
        private EmbeddedAudit embeddedAudit;
        private String status;
        private ModelVersion version;

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Version version1 = (Version) o;
            return Objects.equals(embeddedAudit, version1.embeddedAudit) && Objects.equals(status, version1.status) && Objects.equals(version, version1.version);
        }

        @Override
        public int hashCode() {
            return Objects.hash(embeddedAudit, status, version);
        }

        @Override
        public String toString() {
            return "Version{" +
                    "embeddedAudit=" + embeddedAudit +
                    ", status='" + status + '\'' +
                    ", version=" + version +
                    '}';
        }
    }

    @Getter
    @Setter
    class EmbeddedAudit {
        private String createdBy;
        private String createdon;
        private String lastUpdatedBy;
        private String lastUpdatedOn;

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            EmbeddedAudit that = (EmbeddedAudit) o;
            return Objects.equals(createdBy, that.createdBy) && Objects.equals(createdon, that.createdon) && Objects.equals(lastUpdatedBy, that.lastUpdatedBy) && Objects.equals(lastUpdatedOn, that.lastUpdatedOn);
        }

        @Override
        public int hashCode() {
            return Objects.hash(createdBy, createdon, lastUpdatedBy, lastUpdatedOn);
        }

        @Override
        public String toString() {
            return "EmbeddedAudit{" +
                    "createdBy='" + createdBy + '\'' +
                    ", createdon='" + createdon + '\'' +
                    ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                    ", lastUpdatedOn='" + lastUpdatedOn + '\'' +
                    '}';
        }
    }

    @Getter
    @Setter
    class ModelVersion {
        private String modelId;
        private String versionId;
        private String type;
        private String checkSum;
        private String createdTime;
        private long modelArtifactSize;

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ModelVersion that = (ModelVersion) o;
            return modelArtifactSize == that.modelArtifactSize && Objects.equals(modelId, that.modelId) && Objects.equals(versionId, that.versionId) && Objects.equals(type, that.type) && Objects.equals(checkSum, that.checkSum) && Objects.equals(createdTime, that.createdTime);
        }

        @Override
        public int hashCode() {
            return Objects.hash(modelId, versionId, type, checkSum, createdTime, modelArtifactSize);
        }

        @Override
        public String toString() {
            return "ModelVersion{" +
                    "modelId='" + modelId + '\'' +
                    ", versionId='" + versionId + '\'' +
                    ", type='" + type + '\'' +
                    ", checkSum='" + checkSum + '\'' +
                    ", createdTime='" + createdTime + '\'' +
                    ", modelArtifactSize=" + modelArtifactSize +
                    '}';
        }
    }
}
