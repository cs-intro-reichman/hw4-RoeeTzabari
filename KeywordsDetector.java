public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        int index = 0;

        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if (contains(sentences[i].toLowerCase(), keywords[j].toLowerCase())) {
                    System.out.println(sentences[i]);
                    break;
                }
            }
        }
        
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
        int index = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                for (int j = i; j < str1.length() && index < str2.length(); j++) {
                    if (str2.charAt(index) != str1.charAt(j)) break;
                    index++;
                }
                if (index == str2.length()) return true;
                index = 0;
            }
        }
        
        return false;
    }

}
