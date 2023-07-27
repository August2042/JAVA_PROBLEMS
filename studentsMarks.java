public class studentsMarks {
    public static void main(String[] args) {
        int marks_1 = 85;
        int marks_2 = 90;
        int marks_3 = 88;
        int marks_4 = 89;
        int marks_5 = 95;
        int marks_6 = 90;

        int total_marks = marks_1 + marks_2 + marks_3 + marks_4 + marks_5 + marks_6;
        float average = total_marks / 6;
        System.out.println("The total marks : " + total_marks);

        switch ((int) average / 10) {
            case 10:
                System.out.println("Grade is A+");
                break;
            case 9:
                System.out.println("Grade is A");
                break;
            case 8:
                System.out.println("Grade is B+");

                break;
            case 7:
                System.out.println("Grade is B");

                break;
            case 6:
                System.out.println("Grade is C+");

                break;
            case 5:
                System.out.println("Grade is C");

                break;
            case 4:
                System.out.println("Grade is D+");

                break;
            case 3:
                System.out.println("Grade is D");

                break;
            default:
                System.out.println("Grade id F");
                break;
        }

    }
}
