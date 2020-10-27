public class ConverterToDecimal {
    public static void main(String[] args) {
        String bin = "101011";
        System.out.println("decimal from binary> " + convertToDecimal(bin));
        String octal = "88";
        System.out.println("decimal from octal> " + convertOctalToDecimal(octal));
        String octal1 = "18";
        System.out.println("decimal from octal> " + convertOctalToDecimal(octal1));
    }

    public static int convertToDecimal(String binary) {
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
            result += conversion;
        conversion *= 2;
        }
        return result;
    }

    public static int convertOctalToDecimal(String octal) {
        int conversion = 1; 
        int result = 0;
        for (int i = 1; i <= octal.length(); i++) {
            if (octal.charAt(octal.length() - i) != '9' && octal.charAt(octal.length() - i) != '0')
                result += conversion *
                            Integer.parseInt(String.valueOf(octal.charAt(octal.length() - i)));
            conversion *= 8;
        }
        return result;
    }
}