package rxwriter.drug;

import java.util.Arrays;

public enum DrugClassification {
    ANALGESIC(3645, "Analgesic, Anti-inflammatory, or Antipyretic"),
    ANALGESICS_NARCOTIC(582, "Analgesics - Narcotic"),
    ANTIANXIETY(523, "Antianxiety Agent - Benzodiazepines"),
    ANTIBACTERIAL(2549, "Antibacterial Agents"),
    ANTIFUNGAL(2602, "Antigungal Agents"),
    VITAMINS_WATER_SOLUBLE(658, "Vitamins - Water Soluble"),
    NASAL_CORTICOSTEROIDS(301, "Nasal Corticosteroids"),
    ACE_INHIBITORS(6108, "ACE Inhibitors and ACE Inhibitor Combinations"),
    ANTIHYPERLIPIDEMICS(263, "Antihyperlipidemics"),
    NARCOTIC_ANTIHISTAMINE(338, "Narcotic Antitussive-Antihistamine Combinations"),
    PLATELET_AGGREGATION_INHIBITORS(3530, "Platelet Aggregation Inhibitors and Combinations");

    private final int classificationCode;
    private final String description;

    DrugClassification(int code, String description) {
        this.classificationCode = code;
        this.description = description;
    }

    public int getClassificationCode() {
        return classificationCode;
    }

    public String getDescription() {
        return description;
    }

    public static DrugClassification getClassificationByCode(int therapeuticCode) {
        return Arrays.stream(DrugClassification.values()).filter(c -> c.getClassificationCode() == therapeuticCode)
                .findFirst().orElse(null);
    }

}
