public class Roman2Integer {

    public static void main(String[] args) {

        System.out.println(solution("LVIII"));

    }

    public static int solution(String s) {

        int result = 0;
        int currIntVal = 0;
        int nextIntVal = 0;

        for (int i = 0; i < s.length(); i++) {

            int nextInd = i + 1;

            currIntVal = getIntValue(s.charAt(i));
            if (nextInd == s.length()){
                result += currIntVal;
                break;
            }

            nextIntVal = getIntValue(s.charAt(nextInd));
            if (nextIntVal <= currIntVal){
                result += currIntVal;
                continue;
            }

            if (nextIntVal > currIntVal){
                result -= currIntVal;
                continue;
            }
        }

        return result;
    }

    private static int getIntValue(char roman) {

        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }

        return 0;
    }
}

