import javax.swing.JOptionPane;
public class Bai226{
    static int Mang[] = new int[7];
    static void TakeInput(String text, int quantity){
        System.out.println(text);
        String nums[] = text.split(" ", quantity);
        int i = 1;
        for (String a : nums){
            Mang[i] = Integer.parseInt(a);
            ++i;
        }
            
    }
    static String ReturnInput(){
        String text;
        text = JOptionPane.showInputDialog(null, "Input values: \n Note: values ​​separated by space \n Write as a, b, c,...");
        return text;
    }

    static void LinearEquation(int a, int b){
        if (a == 0) {
            if (b == 0) JOptionPane.showMessageDialog(null, "PT co vo so nghiem");
            else JOptionPane.showMessageDialog(null, "PT vo nghiem");
        }
        else {
            JOptionPane.showMessageDialog(null, "PT co nghiem: " + -b/a);
        }
    }

    static void DoubleEquation(int a, int b, int c){
        if (a == 0) {
            LinearEquation(b, c);
            return;
        }else {
            int delta = b*b - 4*a*c;
            System.out.println(delta);
            if (delta < 0 ) JOptionPane.showMessageDialog(null, "PT vo nghiem");
            else if (delta == 0) JOptionPane.showMessageDialog(null, "PT co nghiem: " + -b/(2*a));
            else {
                double num1, num2;
                num1 = (-b + Math.sqrt(delta))/(2*a);
                num2 = (-b - Math.sqrt(delta))/(2*a);
                JOptionPane.showMessageDialog(null, "PT co nghiem: " + num1 + " va " + num2);
            }
        }

    }

    static void LinearSystem(){
        int a1,a2,b1,b2,c1,c2;
        a1 = Mang[1];
        a2 = Mang[4];
        b1 = Mang[2];
        b2 = Mang[5];
        c1 = Mang[3];
        c2 = Mang[6];
        int D = a1*b2 - a2*b1;
        int Dx = c1*b2 - c2*b1;
        int Dy = a1*c2 - a2*c1;
        if (D != 0) JOptionPane.showMessageDialog(null, 
                                            "Phuong trinh co nghiem:\n x = " + Dx/D + "\n y = " + Dy/D);
        else if (D == 0) {
            if (Dx == 0 && Dy == 0) JOptionPane.showMessageDialog(null, "PT vo so nghiem");
            else if (Dx == 0 || Dy == 0) JOptionPane.showMessageDialog(null, "PT vo nghiem");
        }
    }

    public static void main(String[] args) {
        Object[] options = {"Linear equation", "Linear system", "Second-degree equation"};
        int result = JOptionPane.showOptionDialog(null,
                        "Chọn phương trình bạn muốn giải: ",
                        "Xác nhận",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
        if(result == JOptionPane.YES_OPTION){
            String input = ReturnInput();
            TakeInput(input, 2);
            LinearEquation(Mang[1], Mang[2]);
        }else if (result == JOptionPane.NO_OPTION){
            String input = ReturnInput();
            TakeInput(input, 6);
            LinearSystem();
        } else if (result == JOptionPane.CANCEL_OPTION) {
            String input = ReturnInput();
            TakeInput(input, 3);
            DoubleEquation(Mang[1], Mang[2], Mang[3]);
        }
    }
}