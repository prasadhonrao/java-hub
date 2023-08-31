package rxwriter.drug;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class DrugConcept {

    public final static DrugConcept OPIATES = new DrugConcept(new DrugClassification[]{
            DrugClassification.ANTIANXIETY,
            DrugClassification.ANALGESICS_NARCOTIC,
            DrugClassification.NARCOTIC_ANTIHISTAMINE});

    private final DrugClassification[] drugClassesInConcept;

    public DrugConcept(DrugClassification[] drugClassesInConcept) {
        this.drugClassesInConcept = drugClassesInConcept;
    }

    public boolean isDrugInConcept(DispensableDrug drug) {
        Objects.requireNonNull(drug, "Drug must not be null for comparison to drug concepts.");
        HashSet<DrugClassification> drugClassifications = new HashSet<>(Arrays.asList(drug.drugClassifications()));
        drugClassifications.retainAll(Arrays.asList(drugClassesInConcept));
        return !drugClassifications.isEmpty();
    }
}


