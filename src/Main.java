import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String> ();

        words.add ("java");
        words.add ("kotlin");
        words.add ("python");
        words.add ("nodejs");
        words.add ("go");
        words.add ("react");
        words.add ("react native");
        words.add ("swift");
        words.add ("dart");

        String target = "android";
        int targetIndex = 0;

        String result = "";

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (targetIndex == target.length()) {
                break;
            }
            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                if (currentChar == target.charAt(targetIndex)) {
                    result += currentChar;
                    targetIndex++;
                    if (targetIndex == target.length()) {
                        break;
                    }
                    i = -1;
                }
            }
        }

        System.out.println(result);
    }
}