package topInterviewQuesitonsIn2018.hash;

/**
 * Excel表列序号
 * <pre>
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 例如，
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 * 输入: "A"
 * 输出: 1
 *
 * 示例 2:
 * 输入: "AB"
 * 输出: 28
 *
 * 示例 3:
 * 输入: "ZY"
 * 输出: 701
 * </pre>
 */
public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        String expression = "AA";
        int number = titleToNumber(expression);
        System.out.println(number);
    }

    private static int titleToNumber(String s) {
        int number = 0;
        for (char c : s.toCharArray()) {
            number = number * 26 + (int) c - 64;
        }
        return number;
    }

}
