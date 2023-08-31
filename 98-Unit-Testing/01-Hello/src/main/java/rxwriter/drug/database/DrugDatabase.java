package rxwriter.drug.database;

import java.util.ArrayList;
import java.util.List;

public class DrugDatabase implements DrugSource {

    private static final List<DrugRecord> dataList = new ArrayList<>();

    static {
        dataList.add(new DrugRecord("fluticasone", new int[] {301}, 0));
        dataList.add(new DrugRecord("simvastatin", new int[] {263}, 0));
        dataList.add(new DrugRecord("aspirin", new int[] {3645, 3530}, 0));
        dataList.add(new DrugRecord("lorazepam", new int[] {523}, 4));
        dataList.add(new DrugRecord("oxycodone", new int[] {582}, 2));
        dataList.add(new DrugRecord("methadone", new int[] {582}, 2));
        dataList.add(new DrugRecord("asmanex", new int[] {301}, 0));
        dataList.add(new DrugRecord("fluconazole", new int[] {2602}, 0));
    }

    public List<DrugRecord> findDrugsStartingWith(String startingString) {
        return dataList.stream().filter(rec -> rec.drugName().startsWith(startingString)).toList();
   }

}
