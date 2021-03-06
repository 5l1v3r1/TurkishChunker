package trnlp.apps;

public class ContentPreprocessor {

    public String process(String input) {
        return normalizeQuotesHyphens(input);
    }

    /**
     * This method converts different single and double quote symbols to a
     * unified form. also it reduces two connected single quotes to a one double
     * quote.
     *
     * @param input input string.
     * @return cleaned input string.
     */
    public static String normalizeQuotesHyphens(String input) {
        // rdquo, ldquo, laquo, raquo, Prime sybols in unicode.
        return input
                .replaceAll("[\u201C\u201D\u00BB\u00AB\u2033\u0093\u0094]|''",
                        "\"").replaceAll("[\u0091\u0092\u2032´`’‘]", "'")
                .replaceAll("[\u0096\u0097–]", "-");
    }
}
