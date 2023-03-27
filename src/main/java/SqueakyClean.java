class SqueakyClean {
    
    static String clean(String identifier) {
        StringBuilder stbd = new StringBuilder();
        int length = identifier.length();
        for(int i = 0;i<length;i++)
            {
                char ch = identifier.charAt(i);
                if(Character.isSpaceChar(ch) == true)
                    stbd.append("_");
                else if(Character.isISOControl(ch) == true)
                    stbd.append("CTRL");
                else if(ch == '-'){
                    i++;
                    if(Character.isDigit(identifier.charAt(i)) == true){
                        i++;
                    stbd.append(Character.toUpperCase(identifier.charAt(i)));
                    } else {
                    stbd.append(Character.toUpperCase(identifier.charAt(i)));
                    }
                }
                else if(Character.isLetter(ch) == false || (ch >= 'α' && ch <= 'ω'))
                    stbd.append("");
                else
                    stbd.append(ch);
            }
         String output = stbd.toString();
        return output;
    }
}
