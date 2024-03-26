class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int value = 0;

            switch (currentChar) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman numeral character: " + currentChar);
            }

            // If the current value is less than the previous one, subtract it
            if (value < prevValue) {
                result -= value;
            } else { //otherwise sum it
                result += value;
            }

            prevValue = value;
        }

        return result;
    }
}
