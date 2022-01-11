package day25_CustomMethod_Overloading;

public class MethodMaxMinNumber {
    public static void main(String[] args) {

    }


    public static int maximum(int[] numbers) {
        int max = numbers[0];//we asume that first number is thr maximum
        for (int each : numbers) {
            if (each > max) {
                max = each;

            }

        }
        return max;
    }

    public static double maximum(double[] numbers) {
        double max = numbers[0];//we asume that first number is thr maximum
        for (double each : numbers) {
            if (each > max) {
                max = each;

            }

        }
        return max;
    }

    public static short maximum(short[] numbers) {
        short max = numbers[0];//we asume that first number is thr maximum
        for (short each : numbers) {
            if (each > max) {
                max = each;

            }

        }
        return max;
    }

    public static long maximum(long[] numbers) {
        long max = numbers[0];//we asume that first number is thr maximum
        for (long each : numbers) {
            if (each > max) {
                max = each;

            }

        }
        return max;
    }

    public static float maximum(float[] numbers) {
        float max = numbers[0];//we asume that first number is thr maximum
        for (float each : numbers) {
            if (each > max) {
                max = each;

            }

        }
        return max;
    }

    public static byte maximum(byte[] numbers) {
        byte max = numbers[0];//we asume that first number is thr maximum
        for (byte each : numbers) {
            if (each > max) {
                max = each;

            }

        }
        return max;
    }

    public static int minimumNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int each : arr) {

            if (each < min) {
                min = each;
            }
        }


        return min;
    }

    public static byte minimumNumber(byte[] arr) {
        byte min = 127;
        for (byte each : arr) {

            if (each < min) {
                min = each;
            }
        }


        return min;
    }

    public static short minimumNumber(short[] arr) {
        short min = 32767;
        for (short each : arr) {

            if (each < min) {
                min = each;
            }
        }


        return min;
    }

    public static long minimumNumber(long[] arr) {
        long min = 9223372036854775807l;
        for (long each : arr) {

            if (each < min) {
                min = each;
            }
        }


        return min;
    }
}

    
