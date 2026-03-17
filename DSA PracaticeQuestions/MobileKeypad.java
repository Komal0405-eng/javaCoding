class MobileKeypad {

    static String[] keypad = {
        "0","1","ABC","DEF","GHI",
        "JKL","MNO","PQRS","TUV","WXYZ"
    };

    public static String convert(String input) {

        String result = "";

        for (char ch : input.toCharArray()) {

            if (ch == ' ') {
                result += "0";
            } else {

                int num = ch - 'A';

                for (int i = 2; i <= 9; i++) {

                    int index = keypad[i].indexOf(ch);

                    if (index != -1) {

                        for (int j = 0; j <= index; j++)
                            result += i;

                        break;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "HELLO WORLD";
        System.out.println(convert(s));
    }
}