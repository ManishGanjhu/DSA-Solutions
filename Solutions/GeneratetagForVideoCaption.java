public class GeneratetagForVideoCaption{
    public static void main(String args[]){
        String caption = "i suck at coding ";
        System.out.println(generateTag(caption));
    }
        public static String generateTag(String caption) {
        String[] words = caption.trim().split("\\s+");
        StringBuilder tag = new StringBuilder("#");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll("[^a-zA-Z]", "");
            if (word.isEmpty()) continue;

            if (i == 0) {
                tag.append(word.toLowerCase());
            } else {
                tag.append(Character.toUpperCase(word.charAt(0)));
                tag.append(word.substring(1).toLowerCase());
            }
        }

        if (tag.length() > 100) {
            return tag.substring(0, 100);
        }

        return tag.toString();
    }
}