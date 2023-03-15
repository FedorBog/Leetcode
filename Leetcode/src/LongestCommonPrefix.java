public class LongestCommonPrefix {

    public static void main(String[] args) {

        String [] strs = {"flower","flow","flight"};
        System.out.println(solution(strs));

    }

    public static String solution(String[] strs){

        StringBuilder sb = new StringBuilder();
        char currChar = '\u0000';
        int index = 0;
        Boolean isBreak = false;

        do {

            for (String word: strs) {

                if (word.length() <= index){
                    isBreak = true;
                    break;
                }

                if (currChar == '\u0000'){
                    currChar = word.charAt(index);
                    continue;
                }

                if (word.charAt(index) != currChar){
                    isBreak = true;
                    break;
                }
            }

            if (isBreak){
                break;
            }

            sb.append(currChar).toString();
            currChar = '\u0000';
            index++;

        }while (true);

        return sb.toString();
    }
}
