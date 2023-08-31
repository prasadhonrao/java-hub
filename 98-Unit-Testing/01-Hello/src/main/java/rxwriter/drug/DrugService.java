package rxwriter.drug;

import rxwriter.drug.database.DrugDatabase;
import rxwriter.drug.database.DrugRecord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DrugService {

    public List<DispensableDrug> findDrugsStartingWith(String startsWith) {
        if (startsWith == null || startsWith.isBlank() || startsWith.trim().length() <2) {
            throw new IllegalArgumentException("Starts with string must be non-null, non-blank, " +
                    "and at least two characters.  String provided: [" + startsWith + "]");
        }
        List<DrugRecord> records = new DrugDatabase().findDrugsStartingWith(startsWith);
        List<DispensableDrug> matchedDrugs = convertRecords(records);
        matchedDrugs.sort(Comparator.comparing(DispensableDrug::drugName));
        return matchedDrugs;
    }

    private List<DispensableDrug> convertRecords(List<DrugRecord> records) {
        ArrayList<DispensableDrug> dispensableDrugs = new ArrayList<>();
        for (DrugRecord record : records) {
            dispensableDrugs.add(convertRecord(record));
        }
        return dispensableDrugs;
    }

    private DispensableDrug convertRecord(DrugRecord record) {
        List<DrugClassification> classifications = new ArrayList<>();
        for (int code : record.classCodes()) {
            classifications.add(DrugClassification.getClassificationByCode(code));
        }
        return new DispensableDrug(record.drugName(), classifications.toArray(new DrugClassification[0]),
                record.deaSchedule() > 0);
    }

}
