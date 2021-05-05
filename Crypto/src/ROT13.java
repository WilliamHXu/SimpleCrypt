public class ROT13  {

    private Integer shift;

    ROT13(Character cs, Character cf) {
        int temp = cf - cs;
        while (temp < 0){
            temp += 26;
        }
        this.shift = temp;
    }

    ROT13(int key) {
        this.shift = key;
    } //Takes in a user number for how many places the letter should shift

    public String crypt(String text) throws UnsupportedOperationException {
        return crypt(text, shift);
    }

    public String crypt(String text, Integer shift) throws UnsupportedOperationException {
        char[] charArray = text.toCharArray();
        String result = "";
        for (char c : charArray){
            result += cryptCharacter(c, shift);
        }
        return result;
    }

    public String encrypt(String text) {
        return crypt(text, shift);
    }

    public String decrypt(String text) {
        return crypt(text, 26 - shift);
    }

    public static String rotate(String s, Character c) {
        int index = 0;
        for (int i = 0; i < s.length(); i++){
            if (c.equals(s.charAt(i))){
                index = i;
                break;
            }
        }
        return s.substring(index) + s.substring(0, index);
    }

    public static Character cryptCharacter(Character c, Integer shift){
        Character result;
        if (Character.isLowerCase(c)){
            char temp = (char)(c + (char)(shift.intValue()));
            if (temp > 'z'){
                temp -= 26;
            }
            result = temp;
        }
        else if (Character.isUpperCase(c)){
            char temp = (char)(c + (char)(shift.intValue()));
            if (temp > 'Z'){
                temp -= 26;
            }
            result = temp;
        }
        else {
            result = c;
        }
        return result;
    }

}
