import java.util.*;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            double gradeInDoubleFormat = (double) grade;
            double roundOffGrade = 5 * Math.ceil(gradeInDoubleFormat / 5);

            int roundOffGradeInt = (int) roundOffGrade;

            if (roundOffGradeInt < 38 || Math.abs(roundOffGradeInt - grade) >= 3) {
                result.add(grade);
                continue;
            }

            result.add(roundOffGradeInt);

            // Solution adapted from discussion forum for readability
            // The solution uses modulo operator to determine if the grade should be rounded
            // up.
            // Using modulo operator, the conditions will be reversed in order for it to
            // match the original condition.
            // If the grade % 5 is less than 3, the grade will not be rounded up.
            /*
             * int gradeRemainderOfFive = grade % 5;
             * 
             * If the grade is less than 38 or the remainder of 5 is less than 3, the grade
             * will not be updated.
             * 
             * E.g. 67 % 5 = 2. 2 is < 3, which is the same as 70 - 67 = 3. Therefore, the
             * value is not rounded up.
             * 
             * E.g. 58 * 5 = 3. The value will be rounded up. 
			 * if (grade < 38 || gradeRemainderOfFive < 3) 
			 * { result.add(grade); continue; }
             * 
             * The modulo result will be subtracted to 5 and added to the current grade to
             * get the rounded up value 
			 * E.g. 73 % 5 = 3, 5 - 3 = 2, 2 + 73 = 75 
			 * E.g. 74 * 5 = 4, 5 - 4 = 1, 1 + 74 = 75 
			 * result.add(grade + 5 - (grade % 5)); // genius method!
             */
        }

        return result;
    }

}