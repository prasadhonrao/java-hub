package rxwriter.prescription;

public class DurationParser {


    /**
     * A duration string will typically have two parts:  an integer quantity
     * and a unit, i.e. "2 weeks" or "3 days", for which this method should
     * return 14 and 3 respectively.
     *
     * Returns 0 for strings not parseable to days by this logic.
     *
     * TODO: Try to rewrite this method using a Java Switch Expression!
     */
    public static int parseDays(String durationString) {
        String[] parts = durationString.split(" ");
        if (parts.length == 2) {
            return unitValueCalculation(parts[1], parts[0]);
        }
        else if (parts.length == 1)
        {
            if (parts[0].equalsIgnoreCase("once")) return 1;
        }
        return 0;
    }

    private static int unitValueCalculation(String unitString, String valueString) {
        DurationUnit unit = DurationUnit.getByTextValue(unitString);
        if (unit == null) {
            return 0;
        }
        return (parseValue(valueString) * unit.getMultiplier());
    }

    private static int parseValue(String valueString) {
        try {
            return Integer.parseInt(valueString);
        }
        catch (Throwable t) {
            return 0;
        }
    }
}
