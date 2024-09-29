import java.util.HashMap;
import javax.swing.JOptionPane;

public class Bai64 {
    static int isLeap = 0;
    static int takeYear(){
        int year;
        do {
            year = Integer.parseInt(JOptionPane.showInputDialog("Input year: "));
        } while (year < 0);
        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 != 0) isLeap = 0;
            else isLeap = 1;
        }
        return year;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> days = new HashMap<Integer, Integer>();
        days.put(1, 31);
        days.put(2, 28);
        days.put(3, 31);
        days.put(4, 30);
        days.put(5, 31);
        days.put(6, 30);
        days.put(7, 31);
        days.put(8, 31);
        days.put(9, 30);
        days.put(10, 31);
        days.put(11, 30);
        days.put(12, 31);
        int year = takeYear();
        int month = takeMonth();
        if (month != 2) JOptionPane.showMessageDialog(null, "Thang " + month + " cua nam " + year + " co " + days.get(month) + " ngay.");
        else {
            if (isLeap == 1) JOptionPane.showMessageDialog(null, "Thang " + month + " cua nam " + year + " co " + (days.get(month)+1) + " ngay.");
            else JOptionPane.showMessageDialog(null, "Thang " + month + " cua nam " + year + " co " + days.get(month) + " ngay.");
        }
    }

    public static int takeMonth() {
        String monthInput;
        int isRightInput;
        do {
            monthInput = JOptionPane.showInputDialog("Input month: ");
            switch (monthInput.toLowerCase()) {
                case "january":
                case "jan.":
                case "jan":
                case "1":
                    isRightInput = 1;
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    isRightInput = 1;
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    isRightInput = 1;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    isRightInput = 1;
                    break;
                case "may":
                case "5":
                    isRightInput = 1;
                    break;
                case "june":
                case "jun":
                case "6":
                    isRightInput = 1;
                    break;
                case "july":
                case "jul.":
                case "jul":
                case "7":
                    isRightInput = 1;
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    isRightInput = 1;
                    break;
                case "september":
                case "sep.":
                case "sep":
                case "9":
                    isRightInput = 1;
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    isRightInput = 1;
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    isRightInput = 1;
                    break;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    isRightInput = 1;
                    break;
                default:
                    isRightInput = 0;
            }
        } while (isRightInput == 0);
        return Integer.parseInt(monthInput);
    }
}
