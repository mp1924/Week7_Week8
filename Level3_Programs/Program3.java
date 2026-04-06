public class OTPGenerator {

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static void main(String[] args) {

        int[] otpList = new int[10];

        for (int i = 0; i < 10; i++) {
            otpList[i] = generateOTP();
            System.out.println("OTP " + (i+1) + ": " + otpList[i]);
        }
    }
}
