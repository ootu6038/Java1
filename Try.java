public class Try {
    public static void main(String[] args) throws Exception {
        try {
            // 整数型として構文解析
            System.out.println(Integer.parseUnsignedInt("100")); // 100
            System.out.println(Integer.parseUnsignedInt("+40")); // 40
            System.out.println(Integer.parseUnsignedInt("0"));   // 0

            // 基数指定して構文解析
            System.out.println(Integer.parseUnsignedInt("10", 10));  // 10
            System.out.println(Integer.parseUnsignedInt("1010", 2)); // 10
            System.out.println(Integer.parseUnsignedInt("12", 8));   // 10
            System.out.println(Integer.parseUnsignedInt("A", 16));   // 10

            // 負の記号を指定すると例外
            System.out.println(Integer.parseUnsignedInt("-20"));
        } catch (Exception e) {
            System.out.println(e); // java.lang.NumberFormatException: Illegal leading minus sign on unsigned string -20.
        }
    }
}