package rxwriter.drug;

public record DispensableDrug(String drugName, DrugClassification[] drugClassifications, boolean isControlled) {
}
