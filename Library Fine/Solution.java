// Java imports

public class Solution {

    // Firstly, we have to understand what kind of cases that we need to handle as
    // this can be quite tricky
    static int libraryFine(int dayReturn, int monthReturn, int yearReturn, int dayDue, int monthDue, int yearDue) {
        // The easiest case to handle:
        // Whenever the due year is more than the return year, there will
        // be a fixed fine of 10,000
        if (yearReturn > yearDue)
            return 10000;

        // Next case that we have to handle is when the return year and due year is the
        // same.
        // When the year is the same, we have to check if the return month is more than
        // the due month

        // E.g. Return date: 01 05 2019, Due date 10 04 2019

        // The following example will trigger this condition as the return month is more
        // than the due month
        if (monthReturn > monthDue && yearReturn == yearDue)
            return 500 * (monthReturn - monthDue);

        // The final case that we have to handle. The logic is the same as the previous
        // case

        // E.g. Return date: 30 05 2019, Due date 10 05 2019
        if (dayReturn > dayDue && yearReturn == yearDue && monthReturn == monthDue)
            return 15 * (dayReturn - dayDue);

        return 0;
    }

    // rest of the code
}